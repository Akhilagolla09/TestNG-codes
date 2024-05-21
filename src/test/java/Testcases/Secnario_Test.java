package Testcases;

import com.relevantcodes.extentreports.LogStatus;

import Webpages.Scenario;

public class Secnario_Test extends driver8{

	
	public void test() {
		
		Scenario obj = new Scenario(driver);
		
		
		
		test = report.startTest("Secnario_Test");
		test.log(LogStatus.PASS, "pass");
		report.endTest(test);
		 report.flush();
	}
}
