package Data.Driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class OverrideExcel {

	public static void main(String[] args) throws IOException {

		// Add poi-ooxml Dependacy before starting the data driven framework
		File f = new File("D:\\JAVA - SELINIUM\\Practice\\PracticeBook.xlsx");

		FileInputStream stream = new FileInputStream(f);

		Workbook w = new XSSFWorkbook(stream);

		Sheet sheet = w.getSheet("Data");

		Row row = sheet.getRow(2);

		Cell cell = row.getCell(1);
		cell.setCellValue("Second");

		FileOutputStream out = new FileOutputStream(f);

		w.write(out);

		System.out.println("Excel updated Successfully");
	}

}
