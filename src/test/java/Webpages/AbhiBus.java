package Webpages;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AbhiBus extends Baseclass1 {

	
	WebDriver driver;

	public AbhiBus(WebDriver driver) {
		this.driver = driver;
	}
	
	By Viewall = By.xpath("//a[@href=\"https://www.abhibus.com/srtc-directory/\"]");
	By Apsrtc = By.xpath("(//a[@href=\"https://www.abhibus.com/operator/919/APSRTC\"])[1]");
	//search
	By from = By.xpath("(//input[@type=\"text\"])[1]");
	By from1 = By.xpath("//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content']/li[text()='Kurnool']");
	By goingto = By.xpath("(//input[@type=\"text\"])[2]");
	By goingto1 = By.xpath("//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content']/li[text()='Hyderabad']");
	By date = By.xpath("(//input[@type=\"text\"])[3]");
	By selectdate = By.xpath("(//td[@data-handler=\"selectDay\"])[9]/a");
//	By search = By.xpath("//a[@id='seo_search_btn']");
	
//filters
	By pricedrop = By.xpath("//input[@type='checkbox']");
	By ac = By.xpath("//div[@id='seat-filter-bus-type']/a[1]");
	By before10 = By.xpath("//div[@class='container departureFilterList ']/a[1]");
//bus	
	By travels = By.xpath("(//div[@class='filter-banner-item'])[2]/img");
	By showseats = By.xpath("(//button[@class='btn bus-info-btn filled primary sm inactive button'])[1]");
	By seat = By.xpath("(//div[@class='Tooltip-Wrapper '])[4]/button");
	By seat1 = By.xpath("(//div[@class='Tooltip-Wrapper '])[5]/button");
	By dropping = By.xpath("(//div[@class=\"container checkbox-container  md \"])[2]/input");
	By conti = By.xpath("//button[@class='btn btn-shake filled primary md inactive button']");
	
	
	
	public void SRTC() throws InterruptedException {
		
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,600)");
		
		log.debug("Click viewall");
		WebElement view = driver.findElement(Viewall);
		clickMethod(view);
		Thread.sleep(2000);
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		
//apsrtc
		log.debug("Click on APSRTC");
		WebElement apsrtc = driver.findElement(Apsrtc);
		clickMethod(apsrtc);
		Thread.sleep(2000);
		
		log.debug("navigates to another window");
		String parent_win = driver.getWindowHandle(); 

		Set<String> set = driver.getWindowHandles(); 

		Iterator<String> I = set.iterator();      

		while (I.hasNext()) {

			String child_win = I.next();

			if (!(parent_win.equals(child_win))) {

				driver.switchTo().window(child_win);
			}

		}
		
//search 
		log.debug("enter source ,destination, date of journey");
		WebElement From = driver.findElement(from);
		explicitWait(driver, 20, From);
		sendkeysint(From, "Kurnool");
		Thread.sleep(2000);
		
		WebElement From1 = driver.findElement(from1);
		clickMethod(From1);
		
		WebElement GoingTo = driver.findElement(goingto);
		explicitWait(driver, 20, GoingTo);
		sendkeysint(GoingTo, "Hyderabad");
		Thread.sleep(2000);
		
		WebElement GoingTo1 = driver.findElement(goingto1);
		clickMethod(GoingTo1);
		
		WebElement Date = driver.findElement(date);
		clickMethod(Date);
		Thread.sleep(5000);
		
		WebElement selectDate = driver.findElement(selectdate);
		clickMethod(selectDate);
		Thread.sleep(3000);
/*		
		WebElement Search = driver.findElement(search);
		clickMethod(Search);
		Thread.sleep(4000);
	    Search = driver.findElement(search);         */

//Filters 		
		log.debug("select the filters  ");
		WebElement drop = driver.findElement(pricedrop);
		clickMethod(drop);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		WebElement Ac = driver.findElement(ac);
		clickMethod(Ac);
		
		WebElement Before10 = driver.findElement(before10);
		clickMethod(Before10);
				
		WebElement Travels = driver.findElement(travels);
		clickMethod(Travels);

		WebElement show = driver.findElement(showseats);
		clickMethod(show);
		
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0,300)");
		
		WebElement Seats= driver.findElement(seat);
		clickMethod(Seats);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement Seats1= driver.findElement(seat1);
		clickMethod(Seats1);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement Drop= driver.findElement(dropping);
		clickMethod(Drop);
		Thread.sleep(3000);
		
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("window.scrollBy(0,300)");
		
		log.debug("click on continue to boox ticket");
		WebElement contin= driver.findElement(conti);
		clickMethod(contin);
		
	}
}
