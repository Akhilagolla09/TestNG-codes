package Webpages;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NoBrokerOwnerPlans extends Baseclass3 {

	WebDriver driver;

	public NoBrokerOwnerPlans(WebDriver driver) {
		this.driver = driver;
	}

	By login = By.xpath("//div[@class='px-1p border-l-1 border-l-solid border-l-header-grey cursor-pointer']");
	By phone = By.xpath("//input[@placeholder='Enter Mobile Number']");
	By continu = By.xpath("//label[@for='login-signup-form-login-radio-password']");
	By password = By.xpath("//input[@placeholder='Enter Password']");
	By continu1 = By.xpath("//button[@id='signUpSubmit']");

	// Menu
	By menu = By.xpath(
			"//div[@class='flex py-0 px-1.5p border-l-1 border-l-solid border-l-header-grey items-center cursor-pointer']");
	By Ownerplan = By.xpath(
			"//div[@style='box-shadow:0 10px 10px 0 rgba(0, 0, 0, 0.1);max-height:calc(100vh - 52px)']/a[text()='Owner Plans']");
	By moneyback = By.xpath("(//div[@class='mt-1.6p ml-1.6p mr-1p'])[3]");
	By Tenant = By.partialLinkText("Click here for Tenant Plans");
	By subscribe = By.xpath("(//button[@type='button'])[4]");
	By Question = By.xpath("//div[@class='nb__1aa1A']/span[text()='What will the Relationship Manager do?']");
	By loc = By.xpath("//a[@href='/flats-for-sale-in-marathahalli_bangalore']");

	// Flat
	By Bhk = By.xpath("//div[@id=\"listPageContainer\"]/div[1]/div[2]/div[2]/div/div/div[1]/div[2]/div[3]");
	By status = By.xpath("//label[@class='nb-radio radio-inline'][2]/input");
	By furnishing = By.xpath("//label[@for='furnishingFull']/input");
	By vehicle = By.xpath("//label[@for='parking_4_wheeler']/input");
	By skip = By.xpath("//div[@class=\"flex pt-3 justify-center items-center w-100pe\"]/span[text()='Skip']");
	By flat = By.xpath("//a[@href='/property/buy/2-bhk-apartment-for-sale-in-marathahalli-bangalore/8a9f90838c593af5018c5a00233862f1/detail']");

	
	public void Login() throws InterruptedException {

		WebElement Login = driver.findElement(login);
		clickMethod(Login);
		Thread.sleep(2000);

		WebElement Phone = driver.findElement(phone);
		explicitWait(driver, 20, Phone);
		sendkeysint(Phone, "6302911871");

		WebElement Continu = driver.findElement(continu);
		clickMethod(Continu);

		WebElement Password = driver.findElement(password);
		explicitWait(driver, 20, Password);
		sendkeysint(Password, "18701A0405###");

		WebElement Continu1 = driver.findElement(continu1);
		clickMethod(Continu1);
		Thread.sleep(2000);

		log.debug("login successfully");
	}

	public void Ownerplan() throws InterruptedException {

		WebElement Menu = driver.findElement(menu);
		clickMethod(Menu);
		Thread.sleep(2000);

		WebElement Owner = driver.findElement(Ownerplan);
		clickMethod(Owner);
		Thread.sleep(2000);

		log.debug("click on moneyback");
		WebElement money = driver.findElement(moneyback);
		clickMethod(money);
		Thread.sleep(2000);

		log.debug("click here for tenant plans ");
		WebElement tenant = driver.findElement(Tenant);
		clickMethod(tenant);
		Thread.sleep(2000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");

		log.debug("Subscribe to Relax plan");
		WebElement click = driver.findElement(subscribe);
		clickMethod(click);
		Thread.sleep(8000);

		driver.navigate().to("https://www.nobroker.in/owner/plans?nbFr=Home_page");
		Thread.sleep(3000);

		log.debug("navigate back to owner plan page ");
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,2000)");

		WebElement question = driver.findElement(Question);
		clickMethod(question);
		Thread.sleep(2000);

		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		// js2.executeScript("window.scrollBy(0,250)");

		log.debug("Click on flats in bangalore");
		WebElement location = driver.findElement(loc);
		js2.executeScript("arguments[0].click();", location);
	//	clickMethod(location);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	public void flat() throws InterruptedException {

		String parent_win = driver.getWindowHandle();
		Set<String> set = driver.getWindowHandles();

		Iterator<String> I = set.iterator();

		while (I.hasNext()) {

			String child_win = I.next();

			if (!(parent_win.equals(child_win))) {

				driver.switchTo().window(child_win);
			}

		}
		
		log.debug("apply filters ");
		WebElement BHK = driver.findElement(Bhk);
		clickMethod(BHK);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement ready = driver.findElement(status);
		clickMethod(ready);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement full = driver.findElement(furnishing);
		clickMethod(full);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement wheeler = driver.findElement(vehicle);
		clickMethod(wheeler);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement Skip = driver.findElement(skip);
		clickMethod(Skip);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		WebElement Flat = driver.findElement(flat);
		clickMethod(Flat);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}

}
