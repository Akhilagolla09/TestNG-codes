package Webpages;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Industrycampus extends Baseclass {

	WebDriver driver;

	public Industrycampus(WebDriver driver) {
		this.driver = driver;
	}

	By next = By.xpath("//a[@href='https://degreed.com/explore/777451']");
//LOGIN
	By username = By.cssSelector("#username");
	By continu = By.xpath("//button[@role='button']");
	By clickpassword = By.xpath("(//button[@role=\"button\"])[2]");
	By password = By.xpath("//input[@id='current-password']");
	By continue2 = By.xpath("(//button[@type='button'])[2]");
//FEATURED
	By featured = By.xpath("//a[text()=' Featured ']");
	By Industrycampus = By.xpath("//a[@href=\"/plan/2504635?newWindow=true\"]");
	By video = By.xpath("(//button[@data-dgat=\"content-card-2ef\"])[1]");
	By Aero = By.xpath("(//img[@class=\"image-layout__resource ng-star-inserted\"])[6]");
	By heading =By.xpath("//h1[@class=\"page-header__title__text h1 break ng-star-inserted\"]");
	By heading1= By.xpath("(//h2[@class=\"h2 guts-p-b-1 break ng-star-inserted\"])[1]");
	By heading2=By.xpath("(//h2[@class=\"h2 guts-p-b-1 break ng-star-inserted\"])[2]");
	

	public void next() throws InterruptedException {
		WebElement nxt = driver.findElement(next);
		clickMethod(nxt);
		Thread.sleep(2000);
	}

	public void Login() throws InterruptedException {

		String parent_win = driver.getWindowHandle(); // parent win

		Set<String> set = driver.getWindowHandles(); // store mutliple windows in set

		Iterator<String> I = set.iterator(); // iterates through set of items (windows)

		while (I.hasNext()) {

			String child_win = I.next();

			if (!(parent_win.equals(child_win))) {

				driver.switchTo().window(child_win);
			}

		}
//username
		WebElement Uname = driver.findElement(username);
		explicitWait(driver, 20, Uname);
		sendkeysint(Uname, "golla.akhila@capgemini.com");
		Thread.sleep(2000);
		log.debug("username is entered");

//continue
		WebElement conti = driver.findElement(continu);
		clickMethod(conti);
		log.debug("click on continue");

//password
		WebElement CpassW = driver.findElement(clickpassword);
		clickMethod(CpassW);
		Thread.sleep(2000);

		WebElement passw = driver.findElement(password);
		explicitWait(driver, 20, passw);
		sendkeysint(passw, "18701A0405###");
		Thread.sleep(2000);
		log.debug("password is entered");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");

		WebElement conti1 = driver.findElement(continue2);
		clickMethod(conti1);
		Thread.sleep(3000);
		log.debug("click on continue");
	}

	public void Featured() throws InterruptedException {

		WebElement feature = driver.findElement(featured);
		clickMethod(feature);
		Thread.sleep(2000);
		log.debug("click on featured");

		String expectedtitle = "BE FUTURE READY! | Plan | Degreed";
		String actualtitle = driver.getTitle();
		// System.out.println(driver.getTitle());
		Assert.assertEquals(actualtitle, expectedtitle);
		System.out.println(actualtitle);
		log.debug("get title");

		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,400)");

		WebElement industrycampus = driver.findElement(Industrycampus);
		clickMethod(industrycampus);
		Thread.sleep(2000);
		log.debug("click on industry campus");

		String expectedtitle1 = "INDUSTRY CAMPUS | Plan | Degreed";
		String actualtitle1 = driver.getTitle();
		Assert.assertEquals(actualtitle1, expectedtitle1);
		System.out.println(actualtitle1);
		Thread.sleep(2000);

		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0,900)");

		WebElement video1 = driver.findElement(video);
		clickMethod(video1);
		Thread.sleep(5000);
		log.debug("click on capgemini university indstry campus");
		
		driver.navigate().to("https://degreed.com/plan/2504635?newWindow=true");
		
		log.debug("navigates to another window ");


		Set<String> set = driver.getWindowHandles(); // store mutliple windows in set

		List<String> index = new ArrayList<>(set);

		Iterator<String> I = set.iterator(); // iterates through set of items (windows)

		while (I.hasNext()) {
			
			driver.switchTo().window(index.get(1));
			break;
		}

		log.debug("click on Aerospace & Defense Industry Campus");
		
		WebElement aerospace = driver.findElement(Aero);
		clickMethod(aerospace);
		
		String text = driver.findElement(heading).getText();
		System.out.println(text);
		
		String text1 = driver.findElement(heading1).getText();
		System.out.println(text1);
		
		String text2 = driver.findElement(heading2).getText();
		System.out.println(text2);
		
		
	}

}
