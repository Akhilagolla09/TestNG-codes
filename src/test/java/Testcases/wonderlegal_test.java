package Testcases;

import java.awt.AWTException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Webpages.wonderlegal;

public class wonderlegal_test extends driver7 {

	
	@Test
	public void WonderLegal() throws InterruptedException, AWTException {
		
		wonderlegal obj = new wonderlegal(driver);
		
		obj.Documents();
		
		
		test = report.startTest("wonderlegal_test");
		test.log(LogStatus.PASS, "pass");
				report.endTest(test);
				report.flush();
		
	}
	
}
