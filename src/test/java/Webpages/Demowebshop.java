package Webpages;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Demowebshop extends Baseclass3 {

	WebDriver driver;

	public Demowebshop(WebDriver driver) {
		this.driver = driver;
	}

	By login = By.xpath("//a[@class=\"ico-login\"]");
	By email = By.id("Email");
	By password = By.name("Password");
	By login1 = By.xpath("//input[@class='button-1 login-button']");

	By computers = By.xpath("(//a[@href=\"/computers\"])[1]");
	By notebook = By.xpath("(//h2[@class='title'])[2]/a");
	By sortby = By.xpath("//select[@id=\"products-orderby\"]");
	By display = By.xpath("//select[@id=\"products-pagesize\"]");
	By viewas = By.xpath("//select[@name=\"products-viewmode\"]");
	By laptop = By.xpath("//img[@src='https://demowebshop.tricentis.com/content/images/thumbs/0000224_141-inch-laptop_125.png']");
	By addtocart = By.xpath("//input[@id='add-to-cart-button-31']");
	By shoppingcart = By.xpath("(//a[@class=\"ico-cart\"])[1]");
			

	public void Login() throws InterruptedException {

//	login
		WebElement Logi = driver.findElement(login);
		clickMethod(Logi);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		WebElement Email = driver.findElement(email);
		explicitWait(driver, 20, Email);
		sendkeysint(Email, "abcxxyz@gmail.com");
		Thread.sleep(2000);

		WebElement passw = driver.findElement(password);
		explicitWait(driver, 20, passw);
		sendkeysint(passw, "1234567");
		Thread.sleep(2000);

		WebElement log1 = driver.findElement(login1);
		clickMethod(log1);
		Thread.sleep(2000);

		log.debug("User logged in successfully");

	}

	public void Addtocart() throws InterruptedException {

//computer
		WebElement Comp = driver.findElement(computers);
		clickMethod(Comp);
		Thread.sleep(2000);
		
//notebook
		WebElement note = driver.findElement(notebook);
		clickMethod(note);
		Thread.sleep(2000);
		log.debug("clicked on computer and selected notebook");

//Apply filters 
		WebElement sort=driver.findElement(sortby);
		Select s=new Select(sort);
		s.selectByVisibleText("Name: A to Z");
		
		
		WebElement dis=driver.findElement(display);
		Select s1=new Select(dis);
		s1.selectByVisibleText("12");
		
		WebElement list=driver.findElement(viewas);
		Select s2=new Select(list);
		s2.selectByIndex(1);
		log.debug("Applied all the filters ");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");

//select one item
		WebElement lapt = driver.findElement(laptop);
		clickMethod(lapt);
		Thread.sleep(2000); 
		
//ADD TO CART
		WebElement add = driver.findElement(addtocart);
		clickMethod(add);
		Thread.sleep(2000);
		
//shopping cart
		WebElement cart = driver.findElement(shoppingcart);
		clickMethod(cart);
		Thread.sleep(2000);
		log.debug("selected item is added to cart successfully");

		
		try {
			takescreenshot("Cartitems");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
