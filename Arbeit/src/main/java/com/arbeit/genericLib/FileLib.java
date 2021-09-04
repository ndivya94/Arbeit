package com.arbeit.genericLib;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib 
{
	
	public String readpropertyData(String propPath, String key) throws Throwable
	{
		FileInputStream fis = new FileInputStream(propPath);
		Properties prop = new Properties();
		prop.load(fis);
		String propValue = prop.getProperty(key, "Incorrect key");
		return propValue;
		
	}
	public String readexcelData(String excelpath, String sheetname, int row, int cell) throws Throwable
	{
		
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wb= WorkbookFactory.create(fis);
		String excelValue= wb.getSheet(sheetname).getRow(row).getCell(cell).toString();
		return excelValue;
		
	}
	public void writeExcelData(String excelpath, String sheetname, int row, int cell, String data) throws Throwable
	{
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wb= WorkbookFactory.create(fis);
		wb.getSheet(sheetname).getRow(row).createCell(cell).setCellValue(data);
		FileOutputStream fos = new FileOutputStream(excelpath);
		wb.write(fos);
	}
	public int getRowCount(String excelpath, String sheet) throws Throwable
	{
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wb= WorkbookFactory.create(fis);
		int rowCount= wb.getSheet(sheet).getLastRowNum();
		return rowCount;
		
	}

}
