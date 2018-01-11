package com.gsb.MainPackage.HumanManager;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.gsb.BasicObject.Services.StoreFileInfos;

import jxl.read.biff.BiffException;

@Controller
public class StuffExaminController {
	
	@Autowired
	StoreFileInfos sfi;
	
	@RequestMapping(value="/judge",method=RequestMethod.GET)
	public ModelAndView judge( HttpServletRequest hsr, @RequestParam("group")int group, @RequestParam("id") int id) {
		System.out.println(hsr.getAttribute("points"));
		ModelAndView mv = new ModelAndView("/judge.jsp");
		return null;
	}
	
	@Autowired
	SqlSessionFactory ssf;
	
	@RequestMapping(value="/start")
	public ModelAndView init( HttpServletRequest hsr) throws BiffException, IOException, SQLException {
		int itemAmount = 4;
		int year = Integer.parseInt( hsr.getParameter("year"));
		int judgerAmount = Integer.parseInt(hsr.getParameter("judgerAmount"));
		String[] judgeItems = new String[itemAmount];
		double[] weights = new double[itemAmount];
		for( int i=0; i<itemAmount; i++) {
			judgeItems[i] = hsr.getParameter("judge"+(i+1));
			weights[i] = Double.parseDouble( hsr.getParameter("weight"+(i+1)));
		}
		String[] levels = new String[]{"处长","领导级职工","普通职工"};
		List<String>[] stuffs = sfi.init(
				year, judgerAmount, 
				System.getProperty("ods.webroot")+"WEB-INF/classes/stuffInfos.xls", 
				levels, new int[]{120,120,120,120,100,100,100,100}, 
				judgeItems, weights);
		ArrayList[] points = new ArrayList[levels.length];
		for( int i=0;i<points.length;i++) {
			points[i] = new ArrayList();
			Map map = new HashMap<String,String>();
			map.put("real_point", "");
			map.put("point_percent", "");
			map.put("judge_lv", "");
			points[i].add(map);
		}
		SqlSession session = ssf.openSession();
		Connection connection = session.getConnection();
		Statement statement = connection.createStatement();
		statement.execute("use LZUODS;");
		statement.execute("drop table if exists examination_table");
		statement.execute("create table if not exists examination_table( group int, id int, point double);");
		for( int i=0;i<stuffs.length; i++) {
			
			
			for( int j=0;j<stuffs[i].size();j++) {
				statement.execute("insert into examination_table values("+i+","+j+","+0.0+")");
			}
		}
		ModelAndView mv = new ModelAndView("/result.jsp");
		mv.addObject("judgerAmount",judgerAmount);
		mv.addObject("judgeItems",judgeItems);
		mv.addObject("weights",weights);
		mv.addObject("levels", levels);
		mv.addObject("points", points);
		mv.addObject("stuffs",stuffs);
		return mv;
	}
}
