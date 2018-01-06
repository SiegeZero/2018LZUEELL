package com.gsb.BasicObject.Services;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gsb.BasicObject.MBG.Person;
import com.gsb.BasicObject.MBG.PersonExample;
import com.gsb.BasicObject.MBG.PersonExample.Criteria;
import com.gsb.BasicObject.MBG.Sociaty;
import com.gsb.BasicObject.MBGDAO.PersonMapper;
import com.gsb.BasicObject.MBGDAO.SociatyMapper;
import com.sun.glass.ui.Timer;

@Service
public class ReadDBInfos {
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
	DecimalFormat df = new DecimalFormat(",###.##");

	boolean debugging = true;
	Calendar cal = Calendar.getInstance();
	@Autowired
	PersonMapper person_mapper;
	
	public List<Person> getBasicInfos( PersonExample example) {
		return person_mapper.selectByExample( example);
	}
	
	@Autowired
	SociatyMapper sociaty_mapper;
	
	public List<Long> getAllAmount() {
		
		long total_person = person_mapper.countByExample(null);
		
		PersonExample example = new PersonExample();
		Criteria c = example.createCriteria();
		c.andGenderEqualTo("女");
		example.or(c);
		long total_female = person_mapper.countByExample(example);
		
		example = new PersonExample();
		c = example.createCriteria();
		c.andGenderEqualTo("男");
		example.or(c);
		long total_male = person_mapper.countByExample(example);

		List<Long> results = new ArrayList<Long>();
		results.add( total_person);
		results.add(total_female);
		results.add(total_male);
		if( debugging) {

			System.out.println("总人数是否等于男性人数+女性人数："+ ((total_person == total_male+total_female)?"是":"否"));
			System.out.println( "总人数："+total_person
					+ "\n女性人数：" + total_female+ "，占总人数百分比为：" + df.format(total_female*100.0/total_person) 
					+ "\n男性人数：" + total_male + "，占总人数百分比为：" + df.format(total_male*100.0/total_person) );
			
		}
		return results;
	}
	
	public List<Long> getPartyMembersAmount() {
		long total_amount = person_mapper.countByExample(null);
		PersonExample example = new PersonExample();
		Criteria c = example.createCriteria();
		c.andPoliticalStatusLike("%党%员%");
		c.andPoliticalStatusNotLike("%非%党%");
		example.or(c);
		long patier_amount = person_mapper.countByExample(example);
//		System.out.println( "Like党员总人数："+patier_amount);
//		c.andPoliticalStatusNotEqualTo("党员");
//		example.or(c);
//		List<Person> selectByExample = person_mapper.selectByExample(example);
//		for(Person p: selectByExample) {
//			System.out.println(p.getPoliticalStatus());
//		}
//		example = new PersonExample();
//		c = example.createCriteria();
//		c.andPoliticalStatusEqualTo("党员");
//		example.or(c);
//		patier_amount = person_mapper.countByExample(example);
		System.out.println( "党员总人数："+patier_amount+"，占总人数百分比为："+df.format(patier_amount*100.0/total_amount));
		c.andGenderEqualTo("男");
		example.or(c);
		long male_patier = person_mapper.countByExample(example);
		long female_patier = patier_amount - male_patier;
		System.out.println("男性党员人数：" + male_patier 
				+ "，占党员人数百分比为：" + df.format(male_patier*100.0/patier_amount));
		System.out.println("女性党员人数：" + female_patier 
				+ "，占党员人数百分比为：" + df.format(female_patier*100.0/patier_amount));
		return null;
	}
	
	public List<Long> getAgeRangeAmount(){
		Date current = cal.getTime();
		cal.add( Calendar.YEAR, -60);
		Date sixty = cal.getTime();
		cal.add( Calendar.DATE, 1);
		Date near_sixty = cal.getTime();
		cal.add( Calendar.DATE, -1);
		cal.add( Calendar.YEAR, -10);
		Date seventy = cal.getTime();
		cal.add( Calendar.DATE, 1);
		Date near_seventy = cal.getTime();
		cal.add( Calendar.DATE, -1);
		cal.add( Calendar.YEAR, -10);
		Date eighty = cal.getTime();
		cal.add( Calendar.DATE, 1);
		Date near_eighty = cal.getTime();
		cal.add( Calendar.DATE, -1);
		cal.add( Calendar.YEAR, -10);
		Date ninty = cal.getTime();
		cal.add( Calendar.DATE, 1);
		Date near_ninty = cal.getTime();
		cal.add( Calendar.DATE, -1);
		cal.add( Calendar.YEAR, -10);
		Date hundred = cal.getTime();
		cal.add( Calendar.DATE, 1);
		Date near_hundred = cal.getTime();
		
		PersonExample example = new PersonExample();
		Criteria c = example.createCriteria();
		c.andBirthTimeBetween( near_sixty, current);
		example.or(c);
		long fifty2sixty = person_mapper.countByExample(example);
		System.out.println("不到六十岁人数："+fifty2sixty);
		example = new PersonExample();
		c = example.createCriteria();
		c.andBirthTimeBetween( near_seventy, sixty);
		example.or(c);
		long sixty2seventy = person_mapper.countByExample(example);
		System.out.println("六十到七十岁人数："+sixty2seventy);
		
		example = new PersonExample();
		c = example.createCriteria();
		c.andBirthTimeBetween(  near_eighty, seventy);
		example.or(c);
		long seventy2eighty= person_mapper.countByExample(example);
		System.out.println("七十到八十岁人数："+seventy2eighty);
		
		example = new PersonExample();
		c = example.createCriteria();
		c.andBirthTimeBetween(near_ninty, eighty);
		example.or(c);
		long eighty2ninty= person_mapper.countByExample(example);
		System.out.println("八十到九十岁人数："+eighty2ninty);
		
		example = new PersonExample();
		c = example.createCriteria();
		c.andBirthTimeBetween( near_hundred,  ninty);
		example.or(c);
		long ninty2ahun= person_mapper.countByExample(example);
		System.out.println("九十到一百岁人数："+ninty2ahun);
		
		example = new PersonExample();
		c = example.createCriteria();
		c.andBirthTimeLessThanOrEqualTo(hundred);
		example.or(c);
		List<Person> pgreaterthan100 = person_mapper.selectByExample(example);
		for( Person p:pgreaterthan100) {
			System.out.println( sdf.format(p.getBirthTime()));
		}
		long hun= person_mapper.countByExample(example);
		System.out.println("一百岁以上人数："+hun);
		System.out.println( "已登记出生日期总人数："+(fifty2sixty + sixty2seventy+seventy2eighty + eighty2ninty + ninty2ahun + hun));
		
		List<Long> results = new ArrayList<>();
		results.add(fifty2sixty);
		results.add(sixty2seventy);
		results.add(seventy2eighty);
		results.add(eighty2ninty);
		results.add(ninty2ahun);
		results.add(hun);
		return results;
	}
	
	
	public List<Long> getAmountEachSociaty() {
		long total_person = person_mapper.countByExample(null);
		List results = new ArrayList<Long>();
		List<Sociaty> selectByExample = sociaty_mapper.selectByExample(null);
		PersonExample example = null;
		Criteria c = null;
		for(Sociaty s:selectByExample) {
			example = new PersonExample();
			c = example.createCriteria();
			c.andSociatyNoEqualTo( s.getSociatyNo());
			example.or(c);
			long amount = person_mapper.countByExample( example);
			c.andGenderEqualTo("男");
			example.or(c);
			long male_amount = person_mapper.countByExample(example);
			long female_amount = amount - male_amount;
			results.add(amount);
			System.out.println( s.getSociatyName()+"共有："+amount+"人，占总人数百分比为："+df.format(amount*100.0/total_person));
			System.out.println("--分会男性人数："+male_amount+"，占分会总人数百分比为："+df.format(male_amount*100.0/amount));
			System.out.println("--分会女性人数："+female_amount+"，占分会总人数百分比为："+df.format(female_amount*100.0/amount));
		}
		
		return results;
	}
}
