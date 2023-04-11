package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	
	
	//Method For Take Screenshot 
	public static void captureScreen(WebDriver driver, String testId) throws IOException, InterruptedException, WebDriverException {
		
		for (int i = 1 ; i < 3 ; i++)
		{
			File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		    File save = new File("E:\\Pranit\\"+testId+""+i+".jpeg");
		
		    FileHandler.copy(scr, save);
		
		    Thread.sleep(1000);
		}
		
	}
	
	//Method for Get data from Exel file
	public static String getDataFromExelFile (String sheetName, int rowNum, int cellNum) throws EncryptedDocumentException, IOException {
		
		try 
		{
			String path = "C:\\Users\\Akash\\Desktop\\Book1.xlsx";
	
	        FileInputStream file = new FileInputStream(path);
//	        Workbook book = WorkbookFactory.create(file);
//	    
//	        Sheet sheet = book.getSheet(sheetName);
//		    Row row = sheet.getRow(rowNum);
//		    Cell cell = row.getCell(cellNum);
//		    String data = cell.getStringCellValue();
	    
	        String data = WorkbookFactory.create(file).getSheet(sheetName).getRow(rowNum).getCell(cellNum)
	    		                                      .getStringCellValue();
//		    System.out.println(data);
		    return data;
		}
		
		catch(IllegalStateException e)
		{
			String path = "C:\\Users\\Akash\\Desktop\\Book1.xlsx";
			
		    FileInputStream file = new FileInputStream(path);
//		    Workbook book = WorkbookFactory.create(file);
//		    
//		    Sheet sheet = book.getSheet(sheetName);
//			Row row = sheet.getRow(rowNum);
//			Cell cell = row.getCell(cellNum);
//			double value = cell.getNumericCellValue();
		    
		    double value = WorkbookFactory.create(file).getSheet(sheetName).getRow(rowNum).getCell(cellNum)
                                                       .getNumericCellValue();
			String data = value + "";
			return data;
		}
	}
	

}
