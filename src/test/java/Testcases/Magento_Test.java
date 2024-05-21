package Testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Webpages.Magento;

public class Magento_Test extends driver8 {
	
	@Test(dataProvider="getData")
	public void Magento1 (String Email, String password) throws InterruptedException {
		
		Magento  obj = new Magento(driver);
		
		obj.Login(Email,password);
		obj.addtocart();
		
		test = report.startTest("Magento_Test");
		test.log(LogStatus.PASS, "pass");
		report.endTest(test);
		 report.flush();
		
	}
	
	@DataProvider
	public Object[][] getData() {
		String sheetname = "magento";
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
