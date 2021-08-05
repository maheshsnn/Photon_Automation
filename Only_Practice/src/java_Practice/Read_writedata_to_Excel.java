package java_Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_writedata_to_Excel {
	
	
	public static String readcell(int row,int col) throws Exception
	{
		

		FileInputStream fis = new FileInputStream("D:\\Workplace\\rrrr.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet s = wb.getSheetAt(0);

		XSSFRow rows = s.getRow(row);
		XSSFCell cell = s.getRow(row).getCell(col);
	//	fis.close();
		String k=cell.toString();
		return k;
	}
	public static void writetocell(int row, int col, String value) throws Exception {

		FileInputStream fis = new FileInputStream("D:\\Workplace\\rrrr.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet s = wb.getSheetAt(0);

		XSSFRow rows = s.getRow(row);
		XSSFCell cell = s.getRow(row).getCell(col);

		if (cell == null)

		{

			XSSFCell cel2 = rows.createCell(col);
			cel2.setCellValue(value);

		} else {

			cell.setCellValue(value);
		}
		fis.close();
		FileOutputStream fos = new FileOutputStream("D:\\Workplace\\rrrr.xlsx");

		wb.write(fos);
		fos.close();

	}
	
	public static void main(String[] args) throws Exception {
		writetocell(1, 1, "********************");
		String y=readcell(1, 1);
		System.out.println(y);
	}
	
}
