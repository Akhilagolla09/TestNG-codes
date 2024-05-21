package Testcases;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Webpages.NoBrokerOwnerPlans;

public class NoBrokerOwnerPlanstest extends driver3 {

	
	@Test
	public void NoBroker_test() throws InterruptedException {

		NoBrokerOwnerPlans obj = new NoBrokerOwnerPlans(driver);

		obj.Login();
		obj.Ownerplan();
		obj.flat();
		
		
		test = report.startTest("NoBrokerOwnerPlanstest");
		test.log(LogStatus.PASS, "pass");
		report.endTest(test);
		report.flush();
		
		
		
	}
}
