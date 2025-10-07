package extra;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetDataFromExcelFile {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream("./src/test/resources/testData.xlsx");
		
		Workbook wb = WorkbookFactory.create(fis);
		
		Sheet sh = wb.getSheet("Opp");
		
		Row row = sh.getRow(7);
		 
		Cell cell = row.getCell(7);
		
//		cell.getNumericCellValue();
		String value = cell.getStringCellValue();
//		cell.getDateCellValue();
//		cell.getLocalDateTimeCellValue();
//		cell.getBooleanCellValue();
		
		
		System.out.println(value);
	}
}








