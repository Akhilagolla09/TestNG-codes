package Testcases;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Webpages.Noida_oyo;

public class Noida_oyotest extends driver4{

	@Test
	public void Oyo_Test() throws InterruptedException {

		Noida_oyo obj = new Noida_oyo(driver);
		
		obj.noidahotels();
		
	
		test = report.startTest("Noida_oyotest");
		test.log(LogStatus.PASS, "pass");
				report.endTest(test);
				report.flush();
	}	
	
	
	
	
	
	
}
