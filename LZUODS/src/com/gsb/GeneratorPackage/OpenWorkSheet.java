package com.gsb.GeneratorPackage;
import java.io.File;
import java.io.FileInputStream;
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

import com.gsb.BasicObject.MBG.Person;
import com.gsb.BasicObject.MBG.SalaryLib;

import jxl.Cell;
import jxl.CellFeatures;
import jxl.CellType;
import jxl.DateCell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.Number;
import jxl.write.NumberFormat;
import jxl.write.WritableCell;
import jxl.write.WritableCellFeatures;
import jxl.write.WritableCellFormat;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;;

public class OpenWorkSheet {

	public Map<Integer, List<String>> content = new HashMap<>(); 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OpenWorkSheet.ReplaceDate();
//		OpenWorkSheet.SelectOlderThan80();
		
//		OpenWorkSheet.Compare();
	}
	
	
	private static void CompareTwoWorkbook() {
		// TODO Auto-generated method stub
		
		
		Workbook wb_a = null, wb_b = null;
		try {
			wb_a = Workbook.getWorkbook( new File( "selected-file.xls"));
			wb_b = Workbook.getWorkbook( new File( "hm-selected.xls"));
			Sheet sheet_a = wb_a.getSheet(0);
			Sheet sheet_b = wb_b.getSheet(0);
			int a_row_amount = sheet_a.getRows();
			int b_row_amount = sheet_b.getRows();
			
			for( int a_index = 1, b_index = 1; a_index < a_row_amount && b_index < b_row_amount; ) {
				int a = Integer.parseInt(sheet_a.getCell(0, a_index).getContents());
				int b = Integer.parseInt(sheet_b.getCell(0, a_index).getContents());
				if( a == b) {
					a_index++;
					b_index++;
				} else if( a < b){
					a_index++;
					System.out.println("a:" + a_index);
				} else {
					b_index++;
					System.out.println( "b" + b_index);
				}
			}
		} catch (BiffException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	public static Set countLibsAmount( String colName, File file) throws BiffException, IOException, ParseException {
		SimpleDateFormat sdf =   new SimpleDateFormat( "yyyyMMdd" );
		Workbook wb = Workbook.getWorkbook( file);
		Sheet sheet = wb.getSheet(0);
		int rowAmount = sheet.getRows();
		int colAmount = sheet.getColumns();
		List<Person> person_list = new ArrayList<>();
		
		boolean foundHeader = false;
		List<String> headers = null;
		headers = new ArrayList<>();
		Set<String> salary_libs = new HashSet<>();
		Cell cell;
		Map< String, String> tmp = new HashMap<>();
		for( int row_index=0, col_index=0; row_index < rowAmount; row_index++)  {
			if( !foundHeader) {
				cell = sheet.getCell( 0, row_index);
				if( cell.getContents().equals("序号")) {
					while( col_index < colAmount) {
						headers.add(sheet.getCell( col_index, row_index).getContents());
//						System.out.println( headers.get(headers.size()-1));
						col_index++;
					}
					foundHeader = true;
				} 
				continue;
			}
			
			for( col_index = 0; col_index < colAmount; col_index++) {
				tmp.put( headers.get( col_index), 
						sheet.getCell( col_index, row_index).getContents());
			}

			salary_libs.add( tmp.get(colName));
//			for( int i=0; i < tmp.size(); i++) {
//				 sdf.parse( tmp.get("出生时间"));
//			}
		}
		System.out.println("不重复选项数目：" + salary_libs.size());
		int i=0;
		Iterator<String> it = salary_libs.iterator();
		while(it.hasNext()) {
			System.out.println( String.valueOf(it.next()));
		}
		return salary_libs;
	}
	
	public static void SelectOlderThan80() {
		Workbook wb = null;
		File file = new File( "data-new.xls");
		try {
			if( file.exists()) {
				File selected_file = new File("selected-file.xls");
				if( selected_file.exists()) {
					selected_file.delete();
				}
				WritableWorkbook wwb = Workbook.createWorkbook( selected_file);
				WritableSheet new_sheet = wwb.createSheet("年龄大于80数据", 0);
				wb = Workbook.getWorkbook( file);
				WritableWorkbook tmp = Workbook.createWorkbook( new File("tmp.xls"), wb);
				WritableSheet sheet = tmp.getSheet(0);
				int RowAmount = sheet.getRows();
				int ColAmount = sheet.getColumns();
				int row_p = 0;
				for( int col_index = 0; col_index < ColAmount; col_index++) {
					new_sheet.addCell( new Label( col_index,row_p,sheet.getCell( col_index, 2).getContents()));
				}
				row_p++;
				for( int row_index = 3; row_index < RowAmount; row_index++) {
					String content = sheet.getCell(13, row_index).getContents();
					if( content.equals("") || content.contains(" ") || (2017-80)<Integer.parseInt(content.substring(0, 4))) {
						continue;
					}
					for( int col_index = 0; col_index < ColAmount; col_index++) {
						new_sheet.addCell( new Label(col_index, row_p, sheet.getCell( col_index, row_index).getContents()));
					}
					row_p++;
				}
				wwb.write();
				wwb.close();
				wb.close();
			}
			
		} catch (BiffException | IOException | WriteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void ReplaceDate() {
		Workbook workbook = null;
		File file = new File("hello.txt");
		System.out.println( file.getAbsolutePath());
		boolean debugging = false;
		try {
			String file_name = "data.xls";
			String new_file_name = "data-new.xls";
			if( new File( file_name).exists()) {
				workbook = Workbook.getWorkbook( new FileInputStream( file_name));
				if( new File( new_file_name).exists()) {
					new File( new_file_name).delete();
				}
				WritableWorkbook wwb = Workbook.createWorkbook( new File( new_file_name), workbook);
//				Sheet sheet = workbook.getSheet(0);
				WritableSheet sheet = wwb.getSheet(0);
				String cell;
				int HeaderRow = 2;
				int ColumnAmount = sheet.getColumns();
				String[] ColumnNames = new String[ColumnAmount];
				for( int index = 0; index < ColumnAmount; index++ ) {
					ColumnNames[ index] = sheet.getCell( index, HeaderRow).getContents();
//					System.out.println( sheet.getCell(index, HeaderRow+1).getType());
				}
				
				int RowAmount = sheet.getRows();
				SimpleDateFormat SF_date = new SimpleDateFormat("yyyyMMdd");
				for( int row_index = HeaderRow + 1; row_index < RowAmount; row_index++) {
					for( int col_index = 0; col_index < ColumnAmount; col_index++) {
						WritableCell c = sheet.getWritableCell( col_index, row_index);
						if( c.getType() == CellType.DATE) {
							DateCell dc = (DateCell) c;
							cell = SF_date.format(dc.getDate());
							System.out.println( cell);
							c = new jxl.write.Number( col_index, row_index, Integer.parseInt(cell));
							c.setCellFormat( sheet.getWritableCell( col_index, row_index-1).getCellFormat());
							sheet.addCell( c);
						} else{
							cell = sheet.getCell( col_index, row_index).getContents();
						}
						
						if( cell.length() == 0) {
							continue;
						}
						String tips = cell;
						if( ColumnNames[col_index].endsWith("时间")) {
							if( cell.contains( ".")) {
								cell = cell.replaceAll(".", "");
							}
							if( cell.contains("/") || cell.contains("-")) {
								if( cell.length() == 10) {
									cell = cell.replaceAll( "/", "");
									cell = cell.replaceAll( "-", "");
								} else if( cell.length() == 8) {
									cell = cell.replaceAll( "/", "0");
									cell = cell.replaceAll( "-", "0");
								} else if( cell.length() == 9) {
									if( cell.lastIndexOf("-") == 6 || cell.lastIndexOf("/") == 6) {
										cell = cell.replaceFirst( "-", "0");
										cell = cell.replaceFirst( "/", "0");
										cell = cell.replaceFirst( "-", "");
										cell = cell.replaceFirst( "/", "");
									} else {
										cell = cell.replaceFirst( "-",	 "");
										cell = cell.replaceFirst( "/", "");
										cell = cell.replaceFirst( "-", "0");
										cell = cell.replaceFirst( "/", "0");
									}
									if( debugging && !tips.equals(cell)) {
										System.out.println( tips + " to " + cell);
									}
								} else {
									System.out.println( "error row with / or - : " + ++row_index);
								}
							} else if( cell.length() < 8) {
								while( cell.length() < 8) {
									cell = cell.concat( "0");
								}
							} else if( cell.length() > 8) {
								System.out.println( "error with more than 8 at : " + sheet.getCell(2, row_index).getContents());
							} 
							
							if( c.getType() == CellType.NUMBER) {
								((jxl.write.Number)c).setValue( Integer.parseInt(cell));
							} else if( c.getType() == CellType.LABEL) {
								((jxl.write.Label)c).setString( cell);
							}
						}
					}
				}
				
//				System.out.println( cell.getContents());
				workbook.close();
				wwb.write();
				wwb.close();
			}
		} catch (BiffException | IOException | WriteException | IndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
