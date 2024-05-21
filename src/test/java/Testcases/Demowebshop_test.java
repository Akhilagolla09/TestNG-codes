package Testcases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Webpages.Demowebshop;

public class Demowebshop_test extends driver7{
	
	@Test
	public void demowebshop() throws InterruptedException, AWTException {
		
		Demowebshop obj = new Demowebshop(driver);
		
		obj.Login();
		obj.Addtocart();
		
		test = report.startTest("Demowebshop_test");
		test.log(LogStatus.PASS, "pass");
				report.endTest(test);
				report.flush();
	}

}
