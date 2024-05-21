package Testcases;

import java.awt.AWTException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Webpages.codebeautify;


public class codebeautify_test extends driver6{

	@Test(dataProvider="getData")
	public void codebeautifytest(String EMAIL, String PASSWORD, String PLAINTEXT, String UrL) throws InterruptedException, AWTException {

		codebeautify obj = new codebeautify(driver);
	
		obj.Login(EMAIL, PASSWORD);
		obj.Whirlpoolhash(PLAINTEXT,UrL);
		
		test = report.startTest("codebeautify_test");
		test.log(LogStatus.PASS, "pass");
				report.endTest(test);
				report.flush();
	}
	
	@DataProvider
	public Object[][] getData() {
		String sheetname = "sheet1";
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
