package Testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Webpages.Nestaway;

public class Nestaway_Test extends driver5{
	
	@Test(dataProvider="getData")
	public void nestaway(String Username, String Password) throws InterruptedException {
		
		Nestaway obj = new Nestaway(driver);
		
		obj.Login(Username,Password);
		obj.explore();
		
		test = report.startTest("Nestaway_Test");
		test.log(LogStatus.PASS, "pass");
		report.endTest(test);
		report.flush();
		
	}
	
	@DataProvider
	public Object[][] getData() {
		String sheetname = "login";
		int rows = excel.getRowCount(sheetname);
		int cols = excel.getColumnCount(sheetname);
		Object[][] data = new Object[rows - 1][cols];
		for (int rowNum = 2; rowNum <= rows; rowNum++) {
			for (int colNum = 0; colNum < cols; colNum++) {
				// data[0][0]
				data[rowNum - 2][colNum] = excel.getCellData(sheetname, colNum, rowNum);
			}
		}
		return data;
	}

}
