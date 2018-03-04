package com.gsb.TestPackage;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
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

import com.gsb.BasicObject.MBGDAO.DepartmentMapper;
import com.gsb.BasicObject.MBGDAO.PersonMapper;
import com.gsb.BasicObject.MBGDAO.SocietyMapper;
import com.gsb.BasicObject.MBGPOJO.Department;
import com.gsb.BasicObject.MBGPOJO.Society;
import com.gsb.BasicObject.MBGPOJO.SourcePerson;
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
	SocietyMapper society_mapper;
	
	public void  insertSociety() {
		try {
			Set sets = OpenWorkSheet.countLibsAmount( "现所在分会", new File("src/data-new.xls"));
			Iterator<String> it = sets.iterator();
			while( it.hasNext()) {
				String content = it.next();
				if( !content.equals("")) {
					Society s = new Society();
					s.setSocietyName( content);
					society_mapper.insert( s);
				}
					
			}
		} catch (BiffException | IOException | ParseException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
	
	@Autowired
	StoreFileInfos sfis;
	
	public void  insertDept() {
		sfis.storeDeptsWith( "");
	}
	
	@Autowired
	ReadDBInfos info_reader;
	
	
//	@Test
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
//		info_reader.getAllAmount( 2);
//		info_reader.getAgeRangeAmountTest();
//		info_reader.getAmountEachSociety();
//		long a = info_reader.getAllAmountAtRangeToday(0, 100);
//		info_reader.getPartyMembersAmount( 2);
//		info_reader.getLastYearAmount(2016);
//		info_reader.getLastYearAmount(2017);
//		info_reader.getLastYearAmount(2018);
//		System.out.println("精确到今天:");
//		info_reader.getAverageAge( -1, true);
//		System.out.println("精确到16年最后一天:");
//		info_reader.getAverageAge( 2016, false);
//		System.out.println("精确到17年最后一天:");
//		info_reader.getAverageAge( 2017, false);
//		info_reader.getRecentBirthday( null);
	}
	
	@Autowired
	StoreNewInfos sni;
											
	@Test
	public void printWithString() {

	}
	
	@Autowired
	StoreFileInfos sfi;
	
	@Test
	public void compareFileAndDB() throws BiffException, IOException, ParseException {
		info_reader.getRecentBirthday( sfi.CompareOpen());
	}
	
	@Test
	public void testNationPrinting() {
		List<String> strings;
//		strings = info_reader.getAllNations();
//		strings = info_reader.getAllSociaties();
//		strings = info_reader.getAllDepts();
//		strings = info_reader.getAllFunc();
		strings = info_reader.getAllTitleLv();
		for( String s:strings) {
			System.out.println( s);
		}
	}
	
	@Autowired
	PersonMapper person_mapper;
	
	@Test
	public void testFuncGet() {
		
		List<SourcePerson> selectAllForShow = person_mapper.selectAllForShow(null);
		for( SourcePerson sp: selectAllForShow) {
			System.out.println( sp.getDept().getDeptName());
		}
	}
	
	@Test
	public void testNullPrint() {
//		info_reader.testOr();
//		List<String> list = new ArrayList<>();
//		list.add(null);
//		List<String> list2 = new ArrayList<>();
//		list2.add("11");
//		list2.add(null);
//		list2.removeAll(list);
//		System.out.println( list2.get(0));
		return;
	}
	
}
