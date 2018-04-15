package com.gsb.BasicObject.Services;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gsb.BasicObject.Beans.SourcePerson;
import com.gsb.BasicObject.MBGDAO.DepartmentMapper;
import com.gsb.BasicObject.MBGDAO.PersonMapper;
import com.gsb.BasicObject.MBGDAO.SalaryLibMapper;
import com.gsb.BasicObject.MBGDAO.SocietyMapper;
import com.gsb.BasicObject.MBGPOJO.Department;
import com.gsb.BasicObject.MBGPOJO.Person;
import com.gsb.BasicObject.MBGPOJO.PersonExample;
import com.gsb.BasicObject.MBGPOJO.SalaryLib;
import com.gsb.BasicObject.MBGPOJO.Society;
import com.gsb.Utils.TypeTransfer;
import com.gsb.BasicObject.MBGPOJO.PersonExample.Criteria;

@Service
public class ReadDBInfos {

	DecimalFormat df = new DecimalFormat(",###.##");

	boolean debugging = true;
	Calendar cal = Calendar.getInstance();
	
	@Autowired
	PersonMapper person_mapper;

	@Autowired
	DepartmentMapper dept_mapper;

	@Autowired
	SalaryLibMapper slib_mapper;

	public List<SalaryLib> getSalaryLib() {
		return slib_mapper.selectByExample(null);
	}

	public List<String> getAllTitleLv() {
		List<String> results = person_mapper.selectAllTitleLv();
		results.remove("");
		return results;
	}

	public List<String> getAllFunc() {
		List<String> results = person_mapper.selectAllFunc();
		results.remove("");
		return results;
	}

	public List<String> getAllNations() {
		return person_mapper.selectAllNations();
	}

	public List<Society> getAllSocieties() {
		return society_mapper.selectByExample(null);
	}

	public List<Department> getAllDepts() {
		return dept_mapper.selectByExample(null);
	}

	public List<String> getAllConscriptionSituation() {
		return person_mapper.selectAllConscriptionSituation();
	}

	public List<SourcePerson> getBasicInfos(PersonExample example, int isAlive) {
		if( -1 != isAlive) {
			if( 1 == isAlive) {
				for( Criteria c:example.getOredCriteria()) {
					c.andPhysicalSituationNotLike( "%死亡%");
				}
			} else if( 0 == isAlive) {
				for( Criteria c:example.getOredCriteria()) {
					c.andPhysicalSituationLike( "%死亡%");
				}
			}
		}
		return person_mapper.selectAllForShow(example);
	}
	
	public List<SourcePerson> getAliveBasicInfos(PersonExample example) {
		return getBasicInfos(example, 1);
	}
	
	public SourcePerson getBasicInfosBy( Integer sysNo) {
		return (SourcePerson) person_mapper.selectByPrimaryKey(sysNo);
	}

	
	
	@Autowired
	SocietyMapper society_mapper;
	
	public List<Map<String, Long>> getAllAmount( int societyNo) {

		PersonExample example = new PersonExample();
		Criteria c = example.or();
		if( societyNo != -1) {
			c.andSocietyNoEqualTo( societyNo);
			example.or(c);
		}
		
		long total_person = person_mapper.countByExample( example);
		c.andGenderEqualTo("女");
		example.clear();
		example.or(c);
		long total_female = person_mapper.countByExample(example);

//		example = new PersonExample();
//		c = example.createCriteria();
//		if( societyNo != -1) {
//			c.andSocietyNoEqualTo( societyNo);
//		}
//		c.andGenderEqualTo("男");
//		example.or(c);
//		long total_male = person_mapper.countByExample(example);
		long total_male = total_person -  total_female;
		List<Map<String, Long>> results = new ArrayList<>();
		Map<String, Long> tmp = new HashMap<>();
		tmp.put("总人数", total_person);
		results.add( tmp);
		tmp = new HashMap<>();
		tmp.put("女性人数", total_female);
		results.add( tmp);
		tmp = new HashMap<>();
		tmp.put("男性人数", total_male);
		results.add( tmp);
		if (debugging) {

			System.out.println("总人数是否等于男性人数+女性人数：" + ((total_person == total_male + total_female) ? "是" : "否"));
			System.out.println("总人数：" + total_person
					+ "\n女性人数：" + total_female + "，占总人数百分比为："
					+ df.format(total_female * 100.0 / total_person) + "\n男性人数：" + total_male + "，占总人数百分比为："
					+ df.format(total_male * 100.0 / total_person));

		}
		return results;
	}

	public List<Map<String, Long>> getPartyMembersAmount( int societyNo) {
		PersonExample example = new PersonExample();

		Criteria c = example.or();
		if( societyNo != -1) {
			c.andSocietyNoEqualTo( societyNo);
			example.or(c);
		}
		long total_person = person_mapper.countByExample( example);
		c.andPoliticalStatusLike("%党%员%");
		c.andPoliticalStatusNotLike("%非%党%");
		example.clear();
		example.or(c);
		long patier_amount = person_mapper.countByExample(example);
		// System.out.println( "Like党员总人数："+patier_amount);
		// c.andPoliticalStatusNotEqualTo("党员");
		// example.or(c);
		// List<Person> selectByExample = person_mapper.selectByExample(example);
		// for(Person p: selectByExample) {
		// System.out.println(p.getPoliticalStatus());
		// }
		// example = new PersonExample();
		// c = example.createCriteria();
		// c.andPoliticalStatusEqualTo("党员");
		// example.or(c);
		// patier_amount = person_mapper.countByExample(example);
		c.andGenderEqualTo("男");
		example.clear();
		example.or(c);
		long male_patier = person_mapper.countByExample(example);
		long female_patier = patier_amount - male_patier;
		
		List<Map<String, Long>> results = new ArrayList<>();
		Map<String, Long> tmp = new HashMap<>();
		tmp.put("党员总人数", patier_amount);
		results.add( tmp);
		tmp = new HashMap<>();
		tmp.put("女性党员人数", female_patier);
		results.add( tmp);
		tmp = new HashMap<>();
		tmp.put("男性党员人数", male_patier);
		results.add( tmp);
		if( debugging) {
			System.out.println("党员总人数：" + patier_amount + "，占总人数百分比为：" + df.format(patier_amount * 100.0 / total_person));
			System.out.println("男性党员人数：" + male_patier + "，占党员人数百分比为：" + df.format(male_patier * 100.0 / patier_amount));
			System.out.println("女性党员人数：" + female_patier + "，占党员人数百分比为：" + df.format(female_patier * 100.0 / patier_amount));
		}
		return results;
	}

	private PersonExample getAgeExample( int societyNo, int left_bound, int right_bound, Calendar reference) {
		PersonExample example = new PersonExample();
		Criteria c = example.or();
		if( societyNo != -1) {
			c.andSocietyNoEqualTo( societyNo);
		}
		int during = right_bound - left_bound;
		if( reference == null) {
			reference = Calendar.getInstance();
		}
		reference.add( Calendar.YEAR, -left_bound);
		Date right_param = reference.getTime();
		
		reference.add( Calendar.YEAR, -during);
		reference.add(Calendar.DATE, 1);
		Date left_param = reference.getTime();
		c.andPhysicalSituationNotLike("%死亡%");
		c.andBirthTimeBetween( left_param, right_param);
		return example;
	}
	
	public long getAmountAtRange(int societyNo, int left_bound, int right_bound, Calendar reference) {
		long amount = person_mapper.countByExample(getAgeExample( societyNo, left_bound, right_bound, reference));
		System.out.println( );
		return amount;
	}
/**
 * 	public void getAgeRangeAmountTest() {
		System.out.println("0-60: " + getAmountAtRange(-1,0,60,null));
		System.out.println("60-70: " + getAmountAtRange(-1,60,70,null));
		System.out.println("70-80: " + getAmountAtRange(-1,70,80,null));
		System.out.println("80-90: " +  getAmountAtRange(-1,80,90,null));
		System.out.println("90-100: " +  getAmountAtRange(-1,90,100,null));
		System.out.println( "100-120: " + getAmountAtRange(-1,100,120,null));
		System.out.println( "70-90: " + getAmountAtRange(-1,70,90,null));
		System.out.println( "0-120: " + getAmountAtRange(2,0,120,null));
		System.out.println("end of Testing >>>>>>>>>>>>>>>>>>>>>");
	}
	
	public void testOr() {

		PersonExample example = new PersonExample();
		Criteria c = example.createCriteria();
		c.andGenderEqualTo("男");
		c.andGenderEqualTo("女");
		example.or(c);
		long tmp = person_mapper.countByExample(example);
		System.out.println( "first:"+tmp);
		c = example.or();
		c.andGenderEqualTo("女");
		tmp = person_mapper.countByExample(example);
		System.out.println( "second:"+tmp);
		c = example.or();
		c.andGenderEqualTo("男");
		tmp = person_mapper.countByExample(example);
		System.out.println( "third:"+tmp);
	}
	
	public List<Long> getAmountEachSociety() {
		long total_person = person_mapper.countByExample(null);
		List values = new ArrayList<Long>();
		List<Society> selectByExample = society_mapper.selectByExample(null);
		PersonExample example = null;
		Criteria c = null;
		for (Society s : selectByExample) {
			example = new PersonExample();
			c = example.createCriteria();
			c.andSocietyNoEqualTo(s.getSocietyNo());
			example.or(c);
			long amount = person_mapper.countByExample(example);
			c.andGenderEqualTo("男");
			example.or(c);
			long male_amount = person_mapper.countByExample(example);
			long female_amount = amount - male_amount;
			values.add(amount);
			values.add(male_amount);
			values.add(female_amount);
			if( debugging) {
				System.out.println(
						s.getSocietyName() + "共有：" + amount + "人，占总人数百分比为：" + df.format(amount * 100.0 / total_person));
				System.out.println("--分会男性人数：" + male_amount + "，占分会总人数百分比为：" + df.format(male_amount * 100.0 / amount));
				System.out
						.println("--分会女性人数：" + female_amount + "，占分会总人数百分比为：" + df.format(female_amount * 100.0 / amount));
			}

		}
		
		return values;
	}
 */
	
	public long getAllAmountAtRange(int left_bound, int right_bound, Calendar reference ) {
		return getAmountAtRange( -1, left_bound, right_bound, reference);
	}
	public long getAllAmountAtRangeToday(int left_bound, int right_bound ) {
		return getAllAmountAtRange( left_bound, right_bound, null);
	}
	
	public long getSocietyAmountAtRangeToday(int societyNo, int left_bound, int right_bound ) {
		return getAmountAtRange( societyNo, left_bound, right_bound, null);
	}
	
	public List<SourcePerson> getAllPersonListAtAge( int left_bound, int right_bound, Calendar reference) {
		return this.getBasicInfos( getAgeExample( -1, left_bound, right_bound, reference), 1);
	}
	public List<SourcePerson> getAllPersonListAtAgeToday( int left_bound, int right_bound) {
		return this.getBasicInfos( getAgeExample( -1, left_bound, right_bound, null), 1);
	}

	

	public List<Long> getQuitDepartmentAmountAt(int year) throws ParseException {

		PersonExample example = new PersonExample();
		Criteria c = example.or();
		cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, year);
		cal.setTime( TypeTransfer.Str2Date(String.valueOf(year) + "0101"));
		Date newer = cal.getTime();
		cal.setTime( TypeTransfer.Str2Date(String.valueOf(year) + "1231"));
		Date older = cal.getTime();
		c.andQuitOfficeTypeLike("%退%");
		c.andJobEndTimeBetween(newer, older);
		long total_amount = person_mapper.countByExample(example);
		example.clear();
		
		c.andGenderEqualTo("男");
		example.or(c);
		long male_amount = person_mapper.countByExample(example);
		example.clear();
		
		long female_amount = total_amount - male_amount;
		
		List<Map<String, Long>> results = new ArrayList<>();
		Map<String, Long> tmp = new HashMap<>();
		tmp.put("退休总人数", total_amount);
		results.add( tmp);
		tmp = new HashMap<>();
		tmp.put("退休男性人数", male_amount);
		results.add( tmp);
		tmp = new HashMap<>();
		tmp.put("退休女性人数", female_amount);
		results.add( tmp);
		
		if( debugging) {
			System.out.println( year + "年退休总人数：" + total_amount);
			System.out.println( year + "年退休男性人数：" + male_amount);
			System.out.println( year + "年退休女性人数：" + female_amount);
		}
		
		
		return null;
	}

	public Map<List<String>, List<String>> getAverageAge( int societyNo,int year, boolean exact) throws ParseException {
		Calendar birth = Calendar.getInstance();
		cal = Calendar.getInstance();
		if (!exact) {
			cal.setTime(TypeTransfer.Str2Date("" + year + "0100"));
		}
		PersonExample example = new PersonExample();
		Criteria c = example.or();
		c.andGenderEqualTo("男");
		if( societyNo != -1) {
			c.andSocietyNoEqualTo( societyNo);
		}
		List<SourcePerson> male = person_mapper.selectByExample(example);
		example.clear();
		long male_age = 0;
		for (Person p : male) {
			Date birthday = p.getBirthTime();
			birth.setTime(birthday);
			int age = cal.get(Calendar.YEAR) - birth.get(Calendar.YEAR);
			birth.set(Calendar.YEAR, cal.get(Calendar.YEAR));
			if (birth.equals(cal) || birth.before(cal)) {
				age++;
			}
			male_age += age;
		}
		c = example.or();
		c.andGenderEqualTo("女");
		if( societyNo != -1) {
			c.andSocietyNoEqualTo( societyNo);
		}
		List<SourcePerson> female = person_mapper.selectByExample(example);
		long female_age = 0;
		for (Person p : female) {
			Date birthday = p.getBirthTime();
			birth.setTime(birthday);
			int age = cal.get(Calendar.YEAR) - birth.get(Calendar.YEAR);
			birth.set(Calendar.YEAR, cal.get(Calendar.YEAR));
			if (birth.equals(cal) || birth.before(cal)) {
				age++;
			}
			female_age += age;
		}
		if( debugging) {
			 System.out.println( "男性年龄和：" + male_age);
			 System.out.println( "女性年龄和：" + female_age);
			 System.out.println("总年龄和："+(male_age + female_age));
			System.out.println("男性平均年龄：" + df.format(male_age * 1.0 / male.size()));
			System.out.println("女性平均年龄：" + df.format(female_age * 1.0 / female.size()));
			System.out.println("平均年龄：" + df.format((female_age + male_age) * 1.0 / (male.size() + female.size())));
		}
		Map<List<String>, List<String>> results = new HashMap<>();
		List<String> attrs = new ArrayList<>();
		List<String> values = new ArrayList<>();
		attrs.add("平均年龄");
		values.add(df.format((female_age + male_age) * 1.0 / (male.size() + female.size())));
		attrs.add("男性平均年龄");
		values.add(df.format(male_age * 1.0 / male.size()));
		attrs.add("女性平均年龄");
		values.add(df.format(female_age * 1.0 / female.size()));
		results.put( attrs, values);
		return results;
	}

	public List<Long> getRecentBirthday(List<String> names) throws ParseException {
		Calendar current = Calendar.getInstance();
		// current.set( Calendar.DATE, 9);
		Calendar birth = Calendar.getInstance();
		int amount = 0;
		List<SourcePerson> ps = person_mapper.selectByExample(null);
		for (Person p : ps) {
			birth.setTime(p.getBirthTime());
			current.set(Calendar.YEAR, birth.get(Calendar.YEAR));
			if (current.after(birth)) {
				if (names != null && !names.contains(p.getName())) {
					System.out.println(p.getName());
				}
				amount++;
			}
		}

		System.out.println(amount);

		return null;
	}

	public List<SalaryLib> getAllSLibs() {
		
		return slib_mapper.selectByExample(null);
	}
	
	

	public List<String> getAllPoliticalStatus() {
		return person_mapper.selectAllPoliticalStatus();
	}

	public List<String> getAllEduBg() {
		return person_mapper.selectAllEduBg();
	}

}
