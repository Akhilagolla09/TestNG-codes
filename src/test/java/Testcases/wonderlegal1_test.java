package Testcases;

import java.awt.AWTException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Webpages.wonderlegal1;

public class wonderlegal1_test extends driver7{

	
	@Test(dataProvider="getData")
	public void WonderLegal1(String EmaiL,String PassWord,String Parent,String Address,String Phone, String EmailID,String ChildName, String BirthPlace,String PassPort,String DestinatioN, String InchargeName, String ContactNumber, String EMAILid) throws InterruptedException, AWTException {
		
		wonderlegal1 obj = new wonderlegal1(driver);
		
		obj.Login(EmaiL, PassWord);
		obj.personal();
		obj.Travelconsentform(Parent,Address, Phone,EmailID,ChildName,BirthPlace,PassPort,DestinatioN,InchargeName,ContactNumber,EMAILid);
		
		
		test = report.startTest("wonderlegal1_test");
		test.log(LogStatus.PASS, "pass");
				report.endTest(test);
				report.flush();
		
	}
	
	@DataProvider
	public Object[][] getData() {
		String sheetname = "wonderlegal";
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
