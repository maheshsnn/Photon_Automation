package java_Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readdata_from_excel {

	public static void main(String[] args) throws Exception {

		System.out.println(Readdata_from_excel.mp().get("mahesh"));
	}

	public static HashMap<String, String> mp() throws Exception {

		HashMap<String, String> hmap = new HashMap<String, String>();

		FileInputStream fis = new FileInputStream("D:\\Workplace\\writeexcel.xlsx");

		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet s = wb.getSheetAt(0);

		Iterator<Row> itr = s.iterator();

		while (itr.hasNext()) {

			Row row = itr.next();

			Iterator<Cell> cellit = row.iterator();

			while (cellit.hasNext()) {

				Cell cells = cellit.next();

				cells.setCellType(CellType.STRING);

				hmap.put(cells.getStringCellValue(), cellit.next().getStringCellValue());
			}
		}
		return hmap;

	}

}
