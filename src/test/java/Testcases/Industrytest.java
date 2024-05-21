package Testcases;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Webpages.Industrycampus;


public class Industrytest extends driver{
	
	
	@Test
	public void Industry_test() throws InterruptedException {

		Industrycampus obj = new Industrycampus(driver);
		
		obj.next();
		obj.Login();
		obj.Featured();
		
//Start the test
		test = report.startTest("Industrytest");
//Pass the test in report
		test.log(LogStatus.PASS, "pass");
//End the test
				report.endTest(test);
//Flush the data to report
				report.flush();
	}	

}
