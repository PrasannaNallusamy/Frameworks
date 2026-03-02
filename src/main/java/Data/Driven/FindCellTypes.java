package Data.Driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FindCellTypes {
	public static void main(String[] args) throws IOException {

//		Add poi-ooxml Dependacy before starting the data driven framework 

		File f = new File("D:\\JAVA - SELINIUM\\Practice\\PracticeBook.xlsx");

		FileInputStream stream = new FileInputStream(f);

		Workbook w = new XSSFWorkbook(stream);

		Sheet sheet = w.getSheet("Data with DOB & Ph Number");

		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);

			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {

				Cell cell = row.getCell(j);

				CellType cellType = cell.getCellType();
				if (cellType == CellType.STRING) {

					System.out.println(cell.getStringCellValue());

				}
				if (cellType == CellType.NUMERIC) {
					if (DateUtil.isCellDateFormatted(cell)) {

						Date dateCellValue = cell.getDateCellValue();

						SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy");

						String format = date.format(dateCellValue);
						System.out.println(format);

					} else {
						double numericCellValue = cell.getNumericCellValue();

						long l = (long) numericCellValue;

						String valueOf = String.valueOf(l);

						System.out.println(valueOf);
					}

				}
			}
		}

	}

}
