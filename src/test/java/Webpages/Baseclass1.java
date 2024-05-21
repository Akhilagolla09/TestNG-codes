package Webpages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Testcases.driver1;

public class Baseclass1 extends driver1 {
	
	
	public void clickMethod(WebElement m) {
		m.click();
	}
	
	public void sendkeysint(WebElement m,String s) {
		m.sendKeys(s);
	}

	public void getText(WebElement e1) {
		String s=e1.getText();
		System.out.println(s);
	}
	
	 public void explicitWait(WebDriver driver, int time, WebElement element) {
		 WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(time));
		 wait.until(ExpectedConditions.visibilityOf(element));
	 }

}
