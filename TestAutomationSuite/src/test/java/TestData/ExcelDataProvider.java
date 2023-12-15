package TestData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;

public class ExcelDataProvider{

	private static XSSFWorkbook workbook;
	private static XSSFSheet sheet;
	private static XSSFCell cell;

	public static void openExcel(String path, String sheetName) throws FileNotFoundException, IOException {

		FileInputStream excelSheet = new FileInputStream(path);
		workbook = new XSSFWorkbook(excelSheet);
		sheet = workbook.getSheet(sheetName);
	}
	public static int getRowCount() {
		
		return sheet.getLastRowNum();
	}

	public static int getColCount() {

		return sheet.getRow(0).getLastCellNum();

	}
	
	public static int OpenExcelFileAndGetRowCount(String path, String sheetName) throws IOException {
		FileInputStream excelSheet = new FileInputStream(path);
		workbook = new XSSFWorkbook(excelSheet);
		sheet = workbook.getSheet(sheetName);
		return sheet.getLastRowNum();
	}
	
	public static Object[][] getSheetData(){

		int rows = getRowCount();
		int cols = getColCount();

		Object[][] data = new Object[rows][cols];

		for (int i = 0; i < rows; i++) {
			XSSFRow row = sheet.getRow(i + 1);
			for (int j = 0; j < cols; j++) {
				 cell = row.getCell(j);

				if (cell.getCellType().equals(CellType.STRING)) {
					data[i][j] = cell.getStringCellValue();
				}
				else if (cell.getCellType().equals(CellType.NUMERIC)) {
					data[i][j] = Integer.toString((int) cell.getNumericCellValue());
				}

			}

		}
		return data;

	}

	
}



//	public static String getCellData(int rowNum, int colNum) {
//
//		String cellData = null;
//		cell = sheet.getRow(rowNum).getCell(colNum);
//
//		if (cell.getCellType().equals(CellType.STRING)) {
//			cellData = cell.getStringCellValue();
//		} else if (cell.getCellType().equals(CellType.NUMERIC)) {
//			cellData = Integer.toString((int) cell.getNumericCellValue());
//		}
//
//		return cellData;
//
//	}

//	public Object[][] getTestData(String path, String sheetName) {
//		int rowCount = ExcelUtils.getRowCount();
//		int colCount = ExcelUtils.getColCount();
//
//		Object data[][] = new Object[rowCount - 1][colCount];
//
//		for (int i = 1; i < rowCount; i++) {
//
//			for (int j = 0; j < colCount; j++) {
//				String cellData = ExcelUtils.getCellData(i, j);
//				data[i - 1][j] = cellData;
//			}
//
//		}
//		return data;
//	}


