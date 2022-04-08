package Excel_sheetstudy;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Test6 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream Myfile=new FileInputStream("G:\\Velocity notes\\Java Automation\\Chromedriver\\exceltest.xlsx");		
		Sheet MySheet = WorkbookFactory.create(Myfile).getSheet("Sheet5");
			
			int totalRows = MySheet.getLastRowNum();
			
			int totalCell = MySheet.getRow(0).getLastCellNum()-1;
			
			for(int i=0;i<=totalRows;i++)
			{
				for(int j=0;j<=totalCell;j++)
				{
					Cell info = MySheet.getRow(i).getCell(j);
					try
					{CellType type = info.getCellType();//string, numeric,boolean
					
					
					if(type==CellType.STRING)
					{
						String value = info.getStringCellValue();
						System.out.print(value+" ");
					}
					
					else if (type==CellType.NUMERIC) 
					{
						double value = info.getNumericCellValue();
						System.out.print(value+" ");
					}
					else if (type==CellType.BOOLEAN)
					{
						boolean value = info.getBooleanCellValue();
						System.out.print(value+" ");
					}
					}
//					else if(type==CellType.BLANK)
//					{
//						info.getErrorCellValue();
//					}
					catch (Exception e) {
						System.out.print(" | Null");
			
				System.out.println();
				
			}}}}}
			
				// TODO: handle exception
			

		

