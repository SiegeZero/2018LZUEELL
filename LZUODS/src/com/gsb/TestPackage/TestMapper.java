package com.gsb.TestPackage;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.gsb.BasicObject.MBG.Department;
import com.gsb.BasicObject.MBG.Sociaty;
import com.gsb.BasicObject.MBG.SourcePerson;
import com.gsb.BasicObject.MBGDAO.DepartmentMapper;
import com.gsb.BasicObject.MBGDAO.SociatyMapper;
import com.gsb.BasicObject.Services.ReadDBInfos;
import com.gsb.BasicObject.Services.StoreFileInfos;
import com.gsb.BasicObject.Services.StoreNewInfos;
import com.gsb.GeneratorPackage.OpenWorkSheet;

import jxl.read.biff.BiffException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:root-context.xml" })
public class TestMapper{
	 @Autowired
	 DepartmentMapper dept_mapper;
	 
	 @Autowired
	 ApplicationContext applicationContext; 
	
	@Test
	public void testDepartmentInsert() {
		Department dept = new Department();
		dept.setDeptLeader("王科长");
		dept.setDeptName("离休科");
		dept.setDeptPhone("1234567890");
		dept.setDeptRemark("暂时没有备注啊");
		int resultCode = dept_mapper.insert( dept);
		System.out.println( resultCode);
	}
	
	@Autowired
	SociatyMapper sociaty_mapper;
	
	@Test
	@Rollback
	public void  insertSociaty() {
		try {
			Set sets = OpenWorkSheet.countLibsAmount( "现所在分会", new File("src/data-new.xls"));
			Iterator<String> it = sets.iterator();
			while( it.hasNext()) {
				String content = it.next();
				if( !content.equals("")) {
					Sociaty s = new Sociaty();
					s.setSociatyName( content);
					sociaty_mapper.insert( s);
				}
					
			}
		} catch (BiffException | IOException | ParseException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
	
	@Autowired
	StoreFileInfos sfis;
	
	@Test
	public void  insertDept() {
		sfis.storeDeptsWith( "");
	}
	
	@Autowired
	ReadDBInfos info_reader;
	
	
	@Test
	public void insertPerson() throws ParseException, BiffException, IOException {
		sfis.init();
		String[] headers = new String[sfis.headers.size()];
		int i = 0;
		while(i<headers.length ) {
			headers[i] = (String) sfis.headers.get(i);
			i++;
		}
		sfis.storeBasicInfoWith(
				headers
		);
	}
	
	@Test
	public void  printContent() throws ParseException {
//		info_reader.getAllAmount();
//		info_reader.getAmountEachSociaty();
//		info_reader.getPartyMembersAmount();
//		info_reader.getAgeRangeAmount();
//		info_reader.getLastYearAmount(2017);
		System.out.println("精确到今天:");
		info_reader.getAverageAge( true);
		System.out.println("精确到17年最后一天:");
		info_reader.getAverageAge( false);
//		info_reader.getRecentBirthday( null);
	}
	
	@Autowired
	StoreNewInfos sni;
	
	@Test
	public void printWithString() {

		System.out.println( sni.showRecordWith(1).get(0).getDept());
	}
	
	@Autowired
	StoreFileInfos sfi;
	
	@Test
	public void compareFileAndDB() throws BiffException, IOException, ParseException {
		info_reader.getRecentBirthday( sfi.CompareOpen());
	}
	
	@Test
	public void testNationPrinting() {
		List<String> nations = info_reader.getAllNations();
		for( String nation:nations) {
			System.out.println( nation);
		}
	}
	
}
