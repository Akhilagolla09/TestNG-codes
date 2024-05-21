package Webpages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class codebeautify extends Baseclass3 {

	WebDriver driver;

	public codebeautify(WebDriver driver) {
		this.driver = driver;
	}

	By login = By.id("notloggedin");
	By email = By.xpath("//input[@placeholder='Your Email']");
	By password = By.xpath("//input[@id='user-password']");
	By clicklogin = By.xpath("//button[@type='submit']");

	By search = By.xpath("//input[@id='searchHomePage']");
	By whirlpool = By.xpath("//div[@class='hero-body']/a[26][text()='Whirlpool Hash Generator']");
	By plaintext = By.xpath("//textarea[@id='inputTextArea']");
	By lowercase = By.xpath("//a[@class='button is-white is-small'][text()='Lower Case']");
	By url = By.xpath("(//button[@class='button is-medium mr-4'])[2]/span[2]");
	By enterurl = By.xpath("//input[@placeholder='https://codebeautify.org/api/names']");
	By submit = By.xpath("//button[@class='button is-primary']");
	By file = By.xpath("(//button[@class='button is-medium mr-4'])[1]");
	
	By text = By.xpath("//section[@class=\"pt-1\"]/h2[text()='Whirlpool Hash Generator Online']");
	By text1 = By.xpath("//div[@class='content']/h2[1][text()='How to Generate Whirlpool Hash?']");
	By text2 = By.xpath("//div[@class='content']/h2[2][text()='What is Whirlpool Hash?']");
	By hyperlink = By.xpath("//a[@href='https://en.wikipedia.org/wiki/Square_(cipher)']");

	public void Login(String EMAIL, String PASSWORD) throws InterruptedException {

//User Login
		log.debug("click on login");
		WebElement logi = driver.findElement(login);
		clickMethod(logi);
		Thread.sleep(4000);

//Enter Email 
		WebElement Email = driver.findElement(email);
		explicitWait(driver, 20, Email);
	//	sendkeysint(Email, "gollaakhila659@gmail.com");
		sendkeysint(Email, EMAIL);

//Enter password
		WebElement PassW = driver.findElement(password);
		explicitWait(driver, 20, PassW);
	//	sendkeysint(PassW, "Akhi0209#");
		sendkeysint(PassW, PASSWORD);
		
		log.debug("Email & password is entered");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");

//click on login
		WebElement click = driver.findElement(clicklogin);
		clickMethod(click);
		log.debug("user logged in successfully");
	}
	
	

	public void Whirlpoolhash(String PLAINTEXT, String UrL) throws InterruptedException, AWTException {

		
		log.debug("enter Tool in search bar");
		
//Enter cryptography in search bar
		WebElement Search = driver.findElement(search);
		explicitWait(driver, 20, Search);
		sendkeysint(Search, "cryptography");
		Thread.sleep(2000);
		Search.sendKeys(Keys.ENTER);

		String parent_win = driver.getWindowHandle();

		Set<String> set = driver.getWindowHandles();

		Iterator<String> I = set.iterator();

		while (I.hasNext()) {

			String child_win = I.next();

			if (!(parent_win.equals(child_win))) {

				driver.switchTo().window(child_win);
			}
		}

		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,400)");

		log.debug("Navigates to another window");

//click on whirlpool hash generator
		WebElement Whirlpool = driver.findElement(whirlpool);
		clickMethod(Whirlpool);
		
//Enter plain text
		WebElement Text = driver.findElement(plaintext);
		explicitWait(driver, 20, Text);
	//	sendkeysint(Text, "Hello world");
		sendkeysint(Text, PLAINTEXT);

		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0,400)");

//convert whirlpool hash to lower case letters
		WebElement Lowercase = driver.findElement(lowercase);
		clickMethod(Lowercase);

//Enter Url 
		WebElement Url = driver.findElement(url);
		clickMethod(Url);

		WebElement Enterurl = driver.findElement(enterurl);
		explicitWait(driver, 20, Enterurl);
	//	sendkeysint(Enterurl, "https://codebeautify.org/whirlpool-hash-generator");
		sendkeysint(Enterurl, UrL);
		Thread.sleep(2000);

		WebElement Submit = driver.findElement(submit);
		clickMethod(Submit);
		
//click on file
		WebElement File = driver.findElement(file);
		clickMethod(File);
		
		Robot r = new Robot();

		StringSelection path = new StringSelection("C:\\Users\\GOAKHILA\\Downloads\\Nestaway_colivingTestcases_Akhila.xlsx");
		Thread.sleep(2000);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(path, null);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_V);
		Thread.sleep(2000);
		r.keyRelease(KeyEvent.VK_V);
		Thread.sleep(2000);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		log.debug("Enter PLAIN TEXT, FILE, URL is converted into Whirlpool hash");
		
//questions
		String Text1 = driver.findElement(text).getText();
		System.out.println(Text1);
		
		String Text2 = driver.findElement(text1).getText();
		System.out.println(Text2);
		
		String Text3 = driver.findElement(text2).getText();
		System.out.println(Text3);
		
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("window.scrollBy(0,1500)");
		
//click on  Square Block Cipher hyperlink
		WebElement HLink = driver.findElement(hyperlink);
		clickMethod(HLink);
		
		try {
			takescreenshot("Squareblock");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
}
