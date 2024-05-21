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

public class driver1 {

	public static WebDriver driver;

	public static ExtentReports report = ExtentManager.getInstance();
	public static ExtentTest test;

	public static Logger log = Logger.getLogger("devpinoyLogger");    //inbuilt class

	@BeforeSuite
	public void openBrowser() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get("https://www.abhibus.com/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		log.debug("Login Sucessfull");

	}

	@AfterSuite
	public void closeBrowser() {
		if (driver != null) {
			driver.quit();

		}
	}
}
