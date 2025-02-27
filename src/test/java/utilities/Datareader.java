package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datareader {

	
	public static List<HashMap<String,String>> data(String filepath,String sheetName) throws IOException 
	{

		List<HashMap<String,String>> mydata=new ArrayList<>();
		
		
		FileInputStream fi=new FileInputStream(filepath);
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet sheet=wb.getSheet(sheetName);
		XSSFRow headreRow=sheet.getRow(0);
		
		int row_count=sheet.getLastRowNum();
		
		
		for(int i=1;i<sheet.getPhysicalNumberOfRows();i++)
		{
			XSSFRow currentRow=sheet.getRow(i);
			HashMap<String,String> currentHash=new HashMap<String,String>();
			
			for(int j=0;j<currentRow.getPhysicalNumberOfCells();j++)
			{
				XSSFCell currentCell=currentRow.getCell(j);
				currentHash.put(headreRow.getCell(j).toString(), currentCell.toString());
			}
			mydata.add(currentHash);
		}
		
		return mydata;
		
	}
}
