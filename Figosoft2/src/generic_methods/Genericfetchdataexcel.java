package generic_methods;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Genericfetchdataexcel {
	public static String getdata(String sheet,int row,int cell) throws EncryptedDocumentException, InvalidFormatException, IOException 
	{
	String val="";
	FileInputStream fis=new FileInputStream("./Excel/data.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	Cell c = wb.getSheet(sheet).getRow(row).getCell(cell);
	val=c.toString();
	return val;

	}

}
