package bitmclass.selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	private static XSSFWorkbook workbook;
	private static XSSFSheet sheet;
	private static String file = "./data/userData.xlsx";
	private static int row;
	private static int col;

	public static void readExel() {
		FileInputStream fis;

		try {
			fis = new FileInputStream(file);
			workbook = new XSSFWorkbook(fis);

		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		sheet = workbook.getSheet("user-data");
		row = sheet.getPhysicalNumberOfRows();
		col = sheet.getRow(0).getPhysicalNumberOfCells();
	}

	public static Object[][] getData() {
		readExel();
		Object[][] data = new Object[row - 1][col];

		for (int r = 1; r < row; r++) {
			for (int c = 0; c < col; c++) {
				data[r - 1][c] = sheet.getRow(r).getCell(c).getStringCellValue();
			}
		}
		
		

		return data;

	}

	public static void main(String[] args)  {

//		XSSFWorkbook workbook = new XSSFWorkbook();
		readExel();
		getData();

	}

}
