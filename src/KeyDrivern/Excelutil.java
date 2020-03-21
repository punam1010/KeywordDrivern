package KeyDrivern;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutil {
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	public static void setExcelFile(String path, String sheetName) throws Exception  {
		FileInputStream fis=new FileInputStream(path);
		workbook=new XSSFWorkbook(fis);
		sheet=workbook.getSheet(sheetName);
		
	}
	public static String getCellData(int row, int col) {
		Cell cell=sheet.getRow(row).getCell(col);
		String cellData=cell.getStringCellValue();
		return cellData;
	}

}
