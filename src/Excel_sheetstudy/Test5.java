package Excel_sheetstudy;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Test5 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream Myfile=new FileInputStream("G:\\Velocity notes\\Java Automation\\Chromedriver\\exceltest.xlsx");		
				Sheet MySheet = WorkbookFactory.create(Myfile).getSheet("Sheet5");
				
				//STRING, NUMERIC, BOOLEAN
				CellType type0 = MySheet.getRow(0).getCell(0).getCellType();
				CellType type1 = MySheet.getRow(0).getCell(3).getCellType();
				CellType type2 = MySheet.getRow(0).getCell(4).getCellType();
				//CellType type3 = MySheet.getRow(0).getCell(5).getCellType();
				System.out.println(type0);
				System.out.println(type1);
				System.out.println(type2);
				//System.out.println(type3);
				
				String value1 = MySheet.getRow(0).getCell(3).getStringCellValue();
				double value2 = MySheet.getRow(0).getCell(4).getNumericCellValue();
				boolean value3 = MySheet.getRow(0).getCell(5).getBooleanCellValue();
				
				System.out.println(value1);
				System.out.println(value2);
				System.out.println(value3);
			}

}
