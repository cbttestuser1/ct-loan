package com.ct.utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	private static XSSFWorkbook excelWBook;
	private static XSSFSheet excelWSheet;
	private static XSSFCell cell;
	private static XSSFRow row;
	private static String excelFilePath;

	// This method is to set the File path and to open the Excel file, Pass
	// Excel Path and Sheetname as Arguments to this method
	public static void openExcelFile(String path, String sheetName) {
		excelFilePath = path;
		try {
			// Open the Excel file
			FileInputStream ExcelFile = new FileInputStream(path);
			// Access the required test data sheet
			excelWBook = new XSSFWorkbook(ExcelFile);
			excelWSheet = excelWBook.getSheet(sheetName);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// This method is to read the test data from the Excel cell, in this we are
	// passing parameters as Row num and Col num
	public static String getCellData(int rowNum, int colNum) {
		try {
			row = excelWSheet.getRow(rowNum);
			if (row == null) {
				row = excelWSheet.createRow(rowNum);
			}
			cell = excelWSheet.getRow(rowNum).getCell(colNum);
			if (cell == null)
				cell = row.createCell(colNum);
			String cellData = cell.toString();
			return cellData;
		} catch (Exception e) {
			e.printStackTrace();
			return "";
		}
	}

	// This method help us creates a new Excel file
	public static void createExcelFile(String fileName, String sheetName) throws Exception {
		try {
			FileOutputStream excelFile = new FileOutputStream(fileName);
			XSSFWorkbook workbook = new XSSFWorkbook();
			XSSFSheet sheet = workbook.createSheet(sheetName);
			workbook.write(excelFile);
			excelFile.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// This method is to write in the Excel cell, Row num and Col num are the
	// parameters
	public static void setCellData(String value, int rowNum, int colNum) {
		try {
			row = excelWSheet.getRow(rowNum);
			if (row == null) {
				row = excelWSheet.createRow(rowNum);
			}
			cell = row.getCell(colNum);

			if (cell == null) {
				cell = row.createCell(colNum);
				cell.setCellValue(value);
			} else {
				cell.setCellValue(value);
			}
			// Constant variables Test Data path and Test Data file name
			FileOutputStream fileOut = new FileOutputStream(excelFilePath);
			excelWBook.write(fileOut);

			fileOut.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static int getUsedRowsCount() {
		try {
			int rowCount = excelWSheet.getPhysicalNumberOfRows();
			return rowCount;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}

	}

	public static int getUsedColumnCount() {
		int columnCount = excelWSheet.getRow(getUsedRowsCount()).getPhysicalNumberOfCells();
		return columnCount;

	}

	public static List<String[]> getSheetContent() {

		List<String[]> sheetContent = new ArrayList<String[]>();
		int columnCount = getUsedColumnCount();
		int rowCount = getUsedRowsCount();

		if (columnCount == 0 || rowCount == 0) {
			return null;
		}
		for (int currentRow = 0; currentRow < rowCount; currentRow++) {
			String[] rowData = new String[columnCount];
			for (int cell = 0; cell < columnCount; cell++) {
				rowData[cell] = getCellData(currentRow, cell);
			}
			sheetContent.add(rowData);
		}
		return sheetContent;

	}

}
