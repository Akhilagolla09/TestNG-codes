package Testcases;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import Ultilities.ExcelReader;
import Ultilities.ExtentManager;
import io.github.bonigarcia.wdm.WebDriverManager;

public class driver6 {
	
	public static WebDriver driver;
	
	public static ExcelReader excel=new ExcelReader("C:\\Users\\GOAKHILA\\eclipse-workspace\\TestNgTask\\src\\test\\resources\\Excel\\Codebeautify.xlsx");
	public static ExtentReports report = ExtentManager.getInstance();
	public static ExtentTest test;

	public static Logger log = Logger.getLogger("devpinoyLogger");    //inbuilt class

		@BeforeSuite
		public void openBrowser() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://codebeautify.org/");
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			log.debug("Website open Sucessfully");	
		}
//		@AfterSuite
		public void closeBrowser() {
			if(driver != null) {
				driver.quit();
				
				
			}
		}		

}
