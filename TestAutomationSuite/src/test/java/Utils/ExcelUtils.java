package Utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;

public class ExcelUtils {
	private static XSSFWorkbook workbook;
	private static XSSFSheet sheet;
	private static XSSFCell cell;

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
		cell = sheet.getRow(rowNum).getCell(colNum);
		
		if (cell.getCellType().equals(CellType.STRING))
		{
			cellData = cell.getStringCellValue();
		}
		else if (cell.getCellType().equals(CellType.NUMERIC))
		{
			cellData = Integer.toString((int) cell.getNumericCellValue());
		}

		return cellData;

	}

}
