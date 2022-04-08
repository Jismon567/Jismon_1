package Excel_sheetstudy;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Test4 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream Myfile= new FileInputStream("G:\\Velocity notes\\Java Automation\\Chromedriver\\exceltest.xlsx");
		
		Sheet MySheet = WorkbookFactory.create(Myfile).getSheet("Sheet2");
		
		int totalRows = MySheet.getLastRowNum();
		System.out.println(totalRows);
		
		int totalCell = MySheet.getRow(0).getLastCellNum()-1;
		System.out.println(totalCell);
		
		for(int i=0;i<=totalRows;i++)
		{
			for(int j=0;j<=totalCell;j++)
			{
				String value = MySheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value +" ");
			}
			System.out.println();
		}
		
	}
}
//Even numbers are required for I & J loops
//Even a blank is left then it shows NUll Error

