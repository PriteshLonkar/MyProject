package Fr6_POMwithDDF_TestNG_BaseClass_UtilityClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UtilityClass 
{

	
	
	public static String TestData(int rowIndex, int CellIndex) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file = new FileInputStream("D:\\Pritesh\\6. Automation- Framework\\datasheet.xlsx");
		 Sheet sh = WorkbookFactory.create(file).getSheet("DDF2");
		  
		 String value = sh.getRow(rowIndex).getCell(CellIndex).getStringCellValue();
		 return value;
	}
}
