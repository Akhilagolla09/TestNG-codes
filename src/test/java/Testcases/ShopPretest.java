package Testcases;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Webpages.ShopPre;

public class ShopPretest extends driver2{


		@Test
		public void shoppre_test() throws InterruptedException {

			ShopPre obj = new ShopPre(driver);
			
			obj.Services();
			
			test = report.startTest("ShopPretest");
			test.log(LogStatus.PASS, "pass");
			report.endTest(test);
			report.flush();

		}
	

}
