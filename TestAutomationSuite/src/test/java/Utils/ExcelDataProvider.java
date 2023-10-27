package Utils;

public class ExcelDataProvider {
	
	public static Object[][] getTestData(String path, String sheetName) {
		int rowCount = ExcelUtils.getRowCount();
		int colCount = ExcelUtils.getColCount();

		Object data[][] = new Object[rowCount - 1][colCount];

		for (int i = 1; i < rowCount; i++) {
			
			for (int j = 0; j < colCount; j++) {
				String cellData = ExcelUtils.getCellData(i, j);
				data[i - 1][j] = cellData;
			}

		}
		return data;
	}


	
	

}
