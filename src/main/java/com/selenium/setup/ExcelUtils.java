package com.selenium.setup;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	private static XSSFSheet ExcelWSheet;
	private static XSSFWorkbook ExcelWBook;
	private static XSSFRow Row;
	private static FileInputStream excelFile;
	private static String filePath;

	public static Object[][] readExcelData(String sheetName) throws Exception {
		String[][] arrayExcelData = null;

		String workingDir = System.getProperty("user.dir");
		filePath = workingDir + File.separator + "src" + File.separator + "automation_practice.xlsx";
		excelFile = new FileInputStream(filePath);
		ExcelWBook = new XSSFWorkbook(excelFile);
		ExcelWSheet = ExcelWBook.getSheet(sheetName);
		// fill the code
		Row = ExcelWSheet.getRow(1);
		int RowNum = ExcelWSheet.getLastRowNum() + 1;
		int ColNum = Row.getLastCellNum();
		arrayExcelData = new String[RowNum - 1][ColNum - 1];
		for (int i = 1; i < RowNum; i++) {
			for (int j = 1; j < ColNum; j++) {
				arrayExcelData[i - 1][j - 1] = Row.getCell(j).toString();
			}
		}
		return arrayExcelData;
	}

}
