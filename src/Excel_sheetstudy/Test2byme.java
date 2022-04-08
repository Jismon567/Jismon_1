package Excel_sheetstudy;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Test2byme {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream Myfile=new FileInputStream("G:\\Velocity notes\\Java Automation\\Chromedriver\\exceltest.xlsx");
		Workbook test = WorkbookFactory.create(Myfile);
		Sheet Sheetof = test.getSheet("Sheet1");
		
		String RowCol00 = Sheetof.getRow(0).getCell(0).getStringCellValue();
		String RowCol01 = Sheetof.getRow(0).getCell(1).getStringCellValue();
		String RowCol10 = Sheetof.getRow(1).getCell(0).getStringCellValue();
		String RowCol11 = Sheetof.getRow(1).getCell(1).getStringCellValue();
		
		//System.out.println(Sheetof);
		System.out.println(RowCol00);
		System.out.println(RowCol01);
		System.out.println(RowCol10);
		System.out.println(RowCol11);
		
		int lastrow = Sheetof.getLastRowNum();
		System.out.println(lastrow);
		short LastCell = Sheetof.getRow(0).getLastCellNum();
		System.out.println(LastCell);
		
				
		for(int i=0;i<=lastrow;i++)
		{
			for(int k=0;k<=LastCell-1;k++)
			{		
			String RowCol = Sheetof.getRow(i).getCell(k).getStringCellValue();
				System.out.print(RowCol+ "  ");
			}
			System.out.println();
		}
		Sheet Sheet4 = test.getSheet("Sheet4");
		int lastrow1 = Sheet4.getLastRowNum();
		System.out.println(lastrow1);
		int LastCell1 = Sheet4.getRow(0).getLastCellNum()-2;
		System.out.println(LastCell1);
		for(int i=0;i<=LastCell1;i++)
		{
			for(int k=0;k<=lastrow1;k++)
			{		
			String RowCol = Sheet4.getRow(k).getCell(i).getStringCellValue();
				System.out.print(RowCol+ "  ");
			}
			System.out.println();
		
	}
	}
}
