package Testcases;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Webpages.AbhiBus;

public class AbhiBustest extends driver1 {

	@Test
	public void Abhibus_test() throws InterruptedException {

		AbhiBus obj = new AbhiBus(driver);

		obj.SRTC();

		test = report.startTest("AbhiBustest");
		test.log(LogStatus.PASS, "pass");
		report.endTest(test);
		report.flush();
	}

}
