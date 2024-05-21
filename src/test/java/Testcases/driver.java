package Testcases;

import java.util.concurrent.TimeUnit;


import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import Ultilities.ExtentManager;
import io.github.bonigarcia.wdm.WebDriverManager;

public class driver {

public static WebDriver driver; // defined globally -because we use for each and every method

public static ExtentReports report = ExtentManager.getInstance();
public static ExtentTest test;

public static Logger log = Logger.getLogger("devpinoyLogger");    //inbuilt class

	@BeforeSuite
	public void openBrowser() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();             
		driver.get("https://talent.capgemini.com/in");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		log.debug("Login Sucessfull");	
	}
//	@AfterSuite
	public void closeBrowser() {
		if(driver != null) {
			driver.quit();
			
			
		}
	}		

	
}
