package Webpages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.apache.poi.ss.usermodel.Cell;

import Testcases.driver8;


public class Baseclass3 extends driver8{
	
	public void clickMethod(WebElement m) {
		m.click();
	}
	
	public void sendkeysint(WebElement m,String s) {
		m.sendKeys(s);
	}

	public void getText(WebElement e1) {
		String s=e1.getText();
		System.out.println(s);
	}
	
	public void clearMethod(WebElement m) {
		m.clear();
	}
	
	 public void explicitWait(WebDriver driver, int time, WebElement element) {
		 WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(time));
		 wait.until(ExpectedConditions.visibilityOf(element));
	 }
	 
	 public static void takescreenshot(String fileName) throws IOException {
			File file =   ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(file,new File("C:\\Users\\GOAKHILA\\eclipse-workspace\\TestNgTask\\screenshots\\"+fileName+ ".jpg"));
			}
	 
	 public void exceldata(String data) throws IOException{
		 
		 String path = "D://DemoFile.xlsx";
		 FileInputStream fs = new FileInputStream(path);
		 Workbook wb = new XSSFWorkbook(fs);
		 Sheet sheet1 = wb.getSheetAt(0);
		 int lastRow = sheet1.getLastRowNum();
		 
		 for(int i=0; i<=lastRow; i++){
		 Row row = sheet1.getRow(i);
		 Cell cell = row.createCell(2);

		 cell.setCellValue(data);

		 }

		 FileOutputStream fos = new FileOutputStream(path);
		 wb.write(fos);
		 fos.close();
		 }
	 
}
