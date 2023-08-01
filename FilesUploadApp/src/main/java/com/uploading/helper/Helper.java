package com.uploading.helper;


import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.multipart.MultipartFile;

import com.uploading.Entitys.RawdataF;

public class Helper {

	
	
	//this method belongs to Excel file or not 
	public static boolean checkExcelFormet(MultipartFile file) {
		
		String conenttype = file.getContentType();
		if(conenttype.equals("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet")) {
			return true;
		}else {
			return false;
		}
		
	}
	
	// This method  convert  Excel to List 
	
	public static List<RawdataF> converListOfRawData(InputStream inputStream){
		
		List<RawdataF> rawlist = new ArrayList<>();
		
		try (XSSFWorkbook workbook = new XSSFWorkbook(inputStream)) {
			
			XSSFSheet	sheet =	workbook.getSheet("TopRichestInWorld");
			
        	int rownumber =0;
        	Iterator<Row> iterator =	sheet.iterator();
        	
        	while(iterator.hasNext()) {
        		
        		Row row = iterator.next();
        		
        		if(rownumber==0) {
        			rownumber++;
        			continue;
        		}
        		Iterator<Cell> cells =	row.iterator();	
        		
        		int cid =0;
        		
        		
        		RawdataF data = new RawdataF();
        		
        		while(cells.hasNext()) {
        			
        			Cell cell = cells.next();
        			
        			switch(cid) {
        			
        			case 0:
        				data.setId((int) cell.getNumericCellValue());
        				break;
        			case 1:	
        				data.setName(cell.getStringCellValue());
        				break;
        			case 2:	
        				data.setNetWorth(cell.getStringCellValue());
        				break;
        			case 3:
        				data.setAge(cell.getNumericCellValue());
        				break;
        			case 4:
        				data.setCountryandTerritory(cell.getStringCellValue());
        				break;
        			case 5:
        				data.setSource(cell.getStringCellValue());
        				break;
        			case 6:
        				data.setIndustry(cell.getStringCellValue());
        				break;		
        			default:
        				
        				break;
        				
        				
        				
        			}
        			cid++;
        			
        		}
        		rawlist.add(data);
        	}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return rawlist;
	}
	
}
