package Excel_sheetstudy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TestPractise {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//create an Object of file input stream and give path along with file name and extension
				FileInputStream Myfile= new FileInputStream("G:\\Velocity notes\\Java Automation\\Chromedriver\\exceltest.xlsx");
				Sheet Sheet2 = WorkbookFactory.create(Myfile).getSheet("Sheet2");
//				for(int i=0;i<=1;i++)
//				{
//					String Value = Sheet2.getRow(i).getCell(0).getStringCellValue();
//					System.out.println(Value);
//				}
//				System.out.println("===============");
//				for(int j=0;j<=4;j++)
//				{
//					String Value = Sheet2.getRow(0).getCell(j).getStringCellValue();
//					System.out.println(Value);
//				}
//				for(int i=0;i<=1;i++)//0,0 0-1
//				{
//					for(int j=0;j<=4;j++)
//					{
//							String Value = Sheet2.getRow(i).getCell(j).getStringCellValue();
//							System.out.println(Value);
//						}
//				}
				int LastRownum = Sheet2.getLastRowNum();
				System.out.println(LastRownum);
				 int Lastcellnum = Sheet2.getRow(0).getLastCellNum()-1;
				System.out.println(Lastcellnum);
				
				for(int i=0;i<=LastRownum;i++)//0,0 0-1
					{
						for(int j=0;j<=Lastcellnum;j++)
						{
							Cell info = Sheet2.getRow(i).getCell(j);	
							CellType type = info.getCellType();
							//String Value = Sheet2.getRow(i).getCell(j).getStringCellValue();
								//System.out.println(type);
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
								System.out.println();
							}
					}
				
				
				
				
				
				
				
				
				
				
				
				
				
//				CellType Type = Sheet3.getRow(0).getCell(0).getCellType();
//				CellType Type1 = Sheet3.getRow(0).getCell(1).getCellType();
//				System.out.println(Type);
//				System.out.println(Type1);
//				String Value = Sheet3.getRow(0).getCell(1).getStringCellValue();
//				System.out.println(Value);
//				boolean Value2 = Sheet3.getRow(1).getCell(0).getBooleanCellValue();
//				System.out.println(Value2);
//				double Value3 = Sheet3.getRow(1).getCell(1).getNumericCellValue();
//				System.out.println(Value3);
				
	}

}
