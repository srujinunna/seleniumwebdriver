package com.welback.utility;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelHelper {

	private static XSSFSheet ExcelSheet;
	private static XSSFWorkbook ExcelWorkBook;
	private static XSSFCell Cell;
	private static XSSFRow Row;

	public static void setExcelFile(String path, int sheet) {
		try {
			FileInputStream fis = new FileInputStream(path);
			ExcelWorkBook = new XSSFWorkbook(fis);
			ExcelSheet = ExcelWorkBook.getSheetAt(sheet);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static String getCellData(int rowNum, int colNum) {
		try {
			Cell = ExcelSheet.getRow(rowNum).getCell(colNum);
			String data = Cell.getStringCellValue();
			return data;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return "";
		}
	}
}
