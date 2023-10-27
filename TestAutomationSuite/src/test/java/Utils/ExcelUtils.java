package Utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;

public class ExcelUtils {
	private static XSSFWorkbook workbook;
	private static XSSFSheet sheet;

	public ExcelUtils(String path, String sheetName) {
		try {
			workbook = new XSSFWorkbook(path);
			sheet = workbook.getSheet(sheetName);
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	public static int getRowCount() {
		int rowCount = 0;
		rowCount = sheet.getPhysicalNumberOfRows();
		return rowCount;
	}

	public static int getColCount() {

		int colCount = 0;
		colCount = sheet.getRow(0).getPhysicalNumberOfCells();
		return colCount;

	}

	public static String getCellData(int rowNum, int colNum) {

		String cellData = null;
		if (sheet.getRow(rowNum).getCell(colNum).getCellType().equals(CellType.STRING)) 
		{
			cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
		}
		else if (sheet.getRow(rowNum).getCell(colNum).getCellType().equals(CellType.NUMERIC))
		{
			cellData = Integer.toString((int) sheet.getRow(rowNum).getCell(colNum).getNumericCellValue());
		}

		return cellData;

	}

}
