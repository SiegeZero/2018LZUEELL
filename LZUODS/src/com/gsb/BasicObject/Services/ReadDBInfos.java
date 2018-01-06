package com.gsb.BasicObject.Services;

import java.sql.Time;
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

	Calendar cal = Calendar.getInstance();
	@Autowired
	PersonMapper person_mapper;
	
	public List<Person> getBasicInfos( PersonExample example) {
		return person_mapper.selectByExample( example);
	}
	
	@Autowired
	SociatyMapper sociaty_mapper;
	public List<Long> getAmountEachSociaty() {
		long total_person = person_mapper.countByExample(null);
		List results = new ArrayList<Long>();
		List<Sociaty> selectByExample = sociaty_mapper.selectByExample(null);
		PersonExample example = new PersonExample();
		Criteria c = example.createCriteria();
		c.andGenderEqualTo("女");
		example.or(c);
		long total_female = person_mapper.countByExample(example);
		System.out.println( "总人数："+total_person+"女性总人数："+total_female+"男性总人数："+(total_person-total_female));
		for(Sociaty s:selectByExample) {
			example = new PersonExample();
			c = example.createCriteria();
			c.andSociatyNoEqualTo( s.getSociatyNo());
			example.or(c);
			long amount = person_mapper.countByExample( example);
			c.andGenderEqualTo("男");
			example.or(c);
			long male_amount = person_mapper.countByExample(example);
			results.add(amount);
			System.out.println( s.getSociatyName()+"共有："+amount+"人占总人数比例为："+amount*1.0/total_person);
			System.out.println("其中男性："+male_amount);
			System.out.println( "女性："+ (amount - male_amount));
		}
		cal.add( Calendar.YEAR, -50);
		Date fifty = cal.getTime();
		cal.add( Calendar.YEAR,  -10);
		Date sixty = cal.getTime();
		cal.add( Calendar.YEAR,  -10);
		Date seventy = cal.getTime();
		cal.add( Calendar.YEAR,  -10);
		Date eighty = cal.getTime();
		cal.add( Calendar.YEAR,  -10);
		Date ninty = cal.getTime();
		cal.add( Calendar.YEAR,  -10);
		Date ahun = cal.getTime();
		example = new PersonExample();
		c = example.createCriteria();
		c.andBirthTimeBetween( sixty, fifty);
		example.or(c);
		long fifty2sixty = person_mapper.countByExample(example);
		System.out.println("五十到六十岁人数："+fifty2sixty);
		example = new PersonExample();
		c = example.createCriteria();
		c.andBirthTimeBetween( seventy, sixty);
		example.or(c);
		long sixty2seventy = person_mapper.countByExample(example);
		System.out.println("六十到七十岁人数："+sixty2seventy);
		
		example = new PersonExample();
		c = example.createCriteria();
		c.andBirthTimeBetween(  eighty, seventy);
		example.or(c);
		long seventy2eighty= person_mapper.countByExample(example);
		System.out.println("七十到八十岁人数："+seventy2eighty);
		
		example = new PersonExample();
		c = example.createCriteria();
		c.andBirthTimeBetween(ninty, eighty);
		example.or(c);
		long eighty2ninty= person_mapper.countByExample(example);
		System.out.println("八十到九十岁人数："+eighty2ninty);
		
		example = new PersonExample();
		c = example.createCriteria();
		c.andBirthTimeBetween(ahun,  ninty);
		example.or(c);
		long ninty2ahun= person_mapper.countByExample(example);
		System.out.println("九十到一百岁人数："+ninty2ahun);
		
		example = new PersonExample();
		c = example.createCriteria();
		c.andBirthTimeLessThanOrEqualTo(ahun);
		example.or(c);
		long hun= person_mapper.countByExample(example);
		System.out.println("一百岁以上人数："+hun);
		System.out.println( fifty2sixty + sixty2seventy+seventy2eighty + eighty2ninty + ninty2ahun + hun);
		return results;
	}
}
