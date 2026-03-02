package Data.Driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelSheet {
	public static void main(String[] args) throws IOException {

		// Add poi-ooxml Dependacy before starting the data driven framework

		File f = new File("D:\\JAVA - SELINIUM\\Practice\\PracticeBook.xlsx");

		FileInputStream stream = new FileInputStream(f);

		Workbook w = new XSSFWorkbook(stream);

		Sheet sheet = w.getSheet("Data");

		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {

				Cell cell = row.getCell(j);

				System.out.println(cell);

			}

		}

	}

}
