package Testcases;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Webpages.NoBrokerRentalAgreement;

public class NoBrokerRentalAgreementtest extends driver3 {

	@Test
	public void NoBroker_test() throws InterruptedException {

		NoBrokerRentalAgreement obj = new NoBrokerRentalAgreement(driver);

		obj.Login();
		obj.rentalagreement();
		obj.propertydetails();
		obj.landlorddetails();
		obj.Tenantdetails();
		obj.Contractdetails();
		
		test = report.startTest("NoBrokertest");
		test.log(LogStatus.PASS, "pass");
		report.endTest(test);
		report.flush();

		
	}
	
	
}
