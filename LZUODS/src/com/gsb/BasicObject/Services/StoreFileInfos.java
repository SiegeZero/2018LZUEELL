package com.gsb.BasicObject.Services;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gsb.BasicObject.MBG.Department;
import com.gsb.BasicObject.MBG.Person;
import com.gsb.BasicObject.MBG.PersonExample;
import com.gsb.BasicObject.MBG.PersonExample.Criteria;
import com.gsb.BasicObject.MBG.PersonWithBLOBs;
import com.gsb.BasicObject.MBG.SalaryLib;
import com.gsb.BasicObject.MBG.Sociaty;
import com.gsb.BasicObject.MBG.SourcePerson;
import com.gsb.BasicObject.MBGDAO.DepartmentMapper;
import com.gsb.BasicObject.MBGDAO.PersonMapper;
import com.gsb.BasicObject.MBGDAO.SalaryLibMapper;
import com.gsb.BasicObject.MBGDAO.SociatyMapper;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

@Service
public class StoreFileInfos {

	Workbook wb;
	Sheet sheet;

	List<Person> person_list = null;
	public List<String> headers = null;
	Map<String, Integer> sociaties_map, depts_map, slib_map;

	boolean foundHeader = false;
	int rowAmount;
	int colAmount;
	int first_data_row_index;

	public List<String> CompareOpen() throws BiffException, IOException {
		String path = "src/1.xls";
		wb = Workbook.getWorkbook(new File(path));
		sheet = wb.getSheet(0);
		rowAmount = sheet.getRows();
		colAmount = sheet.getColumns();
		List<String> names = new ArrayList<>();
		for (int row_index = 0, col_index = 0; row_index < rowAmount; row_index++) {
			Cell cell = sheet.getCell(2, row_index);
			names.add(cell.getContents());
		}
		return names;
	}

	public StoreFileInfos() {

		person_list = new ArrayList<>();
		headers = new ArrayList<>();
	}

	public StoreFileInfos init() throws BiffException, IOException {
		// String path =
		// System.getProperty("ods.webroot")+"WEB-INF/classes/data-new.xls";
		String path = "src/data-new.xls";
		wb = Workbook.getWorkbook(new File(path));
		sheet = wb.getSheet(0);
		rowAmount = sheet.getRows();
		colAmount = sheet.getColumns();
		Set<String> contents = new HashSet<>();
		Map<String, String> tmp = new HashMap<>();
		for (int row_index = 0, col_index = 0; row_index < rowAmount; row_index++) {
			Cell cell = sheet.getCell(0, row_index);
			if (cell.getContents().equals("序号")) {
				if (rowAmount > row_index + 1) {
					first_data_row_index = row_index + 1;
				}
				while (col_index < colAmount) {
					headers.add(sheet.getCell(col_index, row_index).getContents());
					col_index++;
				}
				break;
			}
		}
		return this;
	}

	@Autowired
	DepartmentMapper dept_mapper;

	public boolean storeDeptsWith(String targetHeader) {
		if (first_data_row_index == 0) {
			return false;
		}
		Set<String> depts = new HashSet<>();

		for (int row_index = first_data_row_index; row_index < rowAmount; row_index++) {
			String tmp = sheet.getCell(headers.indexOf(targetHeader), row_index).getContents();
			if (tmp != "") {
				depts.add(tmp);
			}
		}
		Iterator<String> it = depts.iterator();
		while (it.hasNext()) {
			Department dept = new Department();
			dept.setDeptName(it.next());
			dept_mapper.insert(dept);
		}
		List<Department> selectByExample = dept_mapper.selectByExample(null);
		depts_map = new HashMap<String, Integer>();
		for (int index = 0; index < selectByExample.size(); index++) {
			depts_map.put(selectByExample.get(index).getDeptName(), selectByExample.get(index).getDeptNo());
		}
		return true;
	}

	@Autowired
	SociatyMapper sociaty_mapper;

	public boolean storeSociatieWith(String targetHeader) {
		if (first_data_row_index == 0) {
			return false;
		}
		Set<String> sociaties = new HashSet<>();
		for (int row_index = first_data_row_index; row_index < rowAmount; row_index++) {
			String tmp = sheet.getCell(headers.indexOf(targetHeader), row_index).getContents();
			sociaties.add(tmp);
		}
		Iterator<String> it = sociaties.iterator();
		while (it.hasNext()) {
			Sociaty sociaty = new Sociaty();
			sociaty.setSociatyName(it.next());
			sociaty_mapper.insert(sociaty);
		}

		List<Sociaty> selectByExample = sociaty_mapper.selectByExample(null);
		sociaties_map = new HashMap<String, Integer>();
		for (int index = 0; index < selectByExample.size(); index++) {
			sociaties_map.put(selectByExample.get(index).getSociatyName(), selectByExample.get(index).getSociatyNo());
		}
		return true;
	}

	@Autowired
	SalaryLibMapper slib_mapper;

	public boolean storeSLibWith(String targetHeader) {
		if (first_data_row_index == 0) {
			return false;
		}
		Set<String> slibs = new HashSet<>();
		for (int row_index = first_data_row_index; row_index < rowAmount; row_index++) {
			String tmp = sheet.getCell(headers.indexOf(targetHeader), row_index).getContents();
			slibs.add(tmp);
		}
		Iterator<String> it = slibs.iterator();
		while (it.hasNext()) {
			SalaryLib slib = new SalaryLib();
			slib.setSalaryVersion(it.next());
			slib_mapper.insert(slib);
		}
		List<SalaryLib> selectByExample = slib_mapper.selectByExample(null);
		slib_map = new HashMap<>();
		for (int index = 0; index < selectByExample.size(); index++) {
			slib_map.put(selectByExample.get(index).getSalaryVersion(), selectByExample.get(index).getSalaryLibNo());
		}
		return true;
	}

	@Autowired
	PersonMapper person_mapper;

	/*
	 * targetHeaders表示表头列名 其中当前版本数据排序为 【0序号、1工资编码、2姓名、3现所在分会、4单位名称、5工资库】
	 * 【6离/退、7性别、8民族、9籍贯、10学历、11党派、12年龄】 【13出生时间、14工作时间、15离退时间、16职务、17职称工人等级】
	 * 【18家庭住址、19电话号码、20手机号码、21家庭成员和生活状况】 【22身体情况、23军属、24是否贫困】
	 */
	public boolean storeBasicInfoWith(String[] targetHeaders) throws ParseException {
		sociaty_mapper.deleteByExample(null);
		dept_mapper.deleteByExample(null);
		slib_mapper.deleteByExample(null);
		if (!this.storeSociatieWith(headers.get(3)) || !this.storeDeptsWith(headers.get(4))
				|| !this.storeSLibWith(headers.get(5))) {
			return false;
		}
		person_mapper.deleteByExample(null);
		for (int row_index = first_data_row_index; row_index < rowAmount; row_index++) {
			SourcePerson person = new SourcePerson();
			person.setSalaryNo(sheet.getCell(headers.indexOf(targetHeaders[1]), row_index).getContents());
			person.setName(sheet.getCell(headers.indexOf(targetHeaders[2]), row_index).getContents());
			person.setSociaty(sheet.getCell(headers.indexOf(targetHeaders[3]), row_index).getContents());
			person.setDept(sheet.getCell(headers.indexOf(targetHeaders[4]), row_index).getContents());
			person.setSlib(sheet.getCell(headers.indexOf(targetHeaders[5]), row_index).getContents());
			person.setQuitOfficeType(sheet.getCell(headers.indexOf(targetHeaders[6]), row_index).getContents());
			person.setGender(sheet.getCell(headers.indexOf(targetHeaders[7]), row_index).getContents());
			person.setNation(sheet.getCell(headers.indexOf(targetHeaders[8]), row_index).getContents());
			person.setNativePlace(sheet.getCell(headers.indexOf(targetHeaders[9]), row_index).getContents());
			person.setEduBg(sheet.getCell(headers.indexOf(targetHeaders[10]), row_index).getContents());
			person.setPoliticalStatus(sheet.getCell(headers.indexOf(targetHeaders[11]), row_index).getContents());
			person.setBirth(sheet.getCell(headers.indexOf(targetHeaders[13]), row_index).getContents());
			person.setStart_job(sheet.getCell(headers.indexOf(targetHeaders[14]), row_index).getContents());
			person.setEnd_job(sheet.getCell(headers.indexOf(targetHeaders[15]), row_index).getContents());
			person.setFunc(sheet.getCell(headers.indexOf(targetHeaders[16]), row_index).getContents());
			person.setTitleLv(sheet.getCell(headers.indexOf(targetHeaders[17]), row_index).getContents());
			person.setAddress(sheet.getCell(headers.indexOf(targetHeaders[18]), row_index).getContents());
			person.setTelephoneNum(sheet.getCell(headers.indexOf(targetHeaders[19]), row_index).getContents());
			String tmp = sheet.getCell(headers.indexOf(targetHeaders[21]), row_index).getContents()
					+ sheet.getCell(headers.indexOf(targetHeaders[20]), row_index).getContents();
			person.setLivingSituation(tmp);
			person.setPhysicalSituation(sheet.getCell(headers.indexOf(targetHeaders[22]), row_index).getContents());
			person.setConscriptio_situation(sheet.getCell(headers.indexOf(targetHeaders[23]), row_index).getContents());
			person.setNeed_help(sheet.getCell(headers.indexOf(targetHeaders[24]), row_index).getContents());
			person_mapper.insert(person.format(depts_map, sociaties_map, slib_map));
			PersonExample personExample = new PersonExample();
			Criteria criteria = personExample.createCriteria();
			if (person.getName() != null)
				criteria.andNameEqualTo(person.getName());
			if (person.getDeptNo() != null)
				criteria.andDeptNoEqualTo(person.getDeptNo());
			if (person.getSociatyNo() != null)
				criteria.andSociatyNoEqualTo(person.getSociatyNo());
			if (person.getSalaryNo() != null)
				criteria.andSalaryNoEqualTo(person.getSalaryNo());
			if (person.getBirthTime() != null)
				criteria.andBirthTimeEqualTo(person.getBirthTime());
			personExample.or(criteria);
			List<SourcePerson> selectByExample = person_mapper.selectByExample(personExample);
		}
		return true;
	}

	public List<String>[] init(int year, int judgerAmount, String stuffFilePath, String[] levels, int[] total_point,
			String[] judgeItems, double[] itemsWeight) throws BiffException, IOException {
		return readStuffFile(new File(stuffFilePath), levels);

	}

	private List<String>[] readStuffFile(File stuffFile, String[] levels) throws BiffException, IOException {
		List<String>[] results = new ArrayList[levels.length];
		for( int i=0;i<levels.length;i++ ) {
			results[i] = new ArrayList<String>();
		}
		results[0] = new ArrayList<String>();
		Workbook wb = Workbook.getWorkbook(stuffFile);
		Sheet sheet = wb.getSheet(0);
		int colAmount = sheet.getColumns();
		int rowAmount = sheet.getRows();
		int col_index = 0, row_index = 0;
		int current_level = 0;
		while (row_index < rowAmount) {
			if (current_level+1<levels.length&&sheet.getCell(0, row_index).getContents().equals(levels[current_level])) {
				current_level++;
			} else {
				String content = sheet.getCell(0, row_index).getContents();
				if( !content.equals("")) {
					results[current_level].add( content);
				}
			}
			row_index++;
		}
		return results;
	}

}
