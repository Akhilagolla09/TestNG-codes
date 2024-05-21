package Webpages;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class Magento extends Baseclass3{
	
	WebDriver driver;
	
	public Magento(WebDriver driver) {
		this.driver=driver;
	}
	

	By signin = By.xpath("(//li[@class='authorization-link'])[1]/a");
	By email = By.xpath("//input[@name='login[username]']");
	By Password = By.xpath("//input[@name='login[password]']");
	By clicksignin = By.xpath("(//button[@type='submit'])[2]/span");
	
	By women = By.xpath("(//li[@role='presentation'])[2]/a");
	By bottom = By.xpath("//a[@href='https://magento.softwaretestingboard.com/women/bottoms-women.html']");
	By pants = By.xpath("//a[@id='ui-id-15']");
	
	By style = By.xpath("(//div[@class='filter-options-title'])[1]");
	By capri = By.xpath("//a[@href='https://magento.softwaretestingboard.com/women/bottoms-women/pants-women.html?style_bottom=106']");
	
	By size = By.xpath("(//div[@class='filter-options-title'])[1]");
	By select = By.xpath("(//div[@class=\"swatch-option text \"])[1]");
	
	By price = By.xpath("(//div[@class='filter-options-title'])[1]");
	By selectprice = By.xpath("//a[@href='https://magento.softwaretestingboard.com/women/bottoms-women/pants-women.html?price=40-50&size=171&style_bottom=106']");
	
	By colour = By.xpath("(//div[@class='filter-options-title'])[1]");
	By Blue = By.xpath("//a[@aria-label='Blue']/div");
	
	By type = By.xpath("(//div[@class='filter-options-title'])[1]");
	By cotton = By.xpath("//a[@href='https://magento.softwaretestingboard.com/women/bottoms-women/pants-women.html?color=50&material=33&price=40-50&size=171&style_bottom=106']");
	
	By pattern = By.xpath("(//div[@class='filter-options-title'])[6]");
	By solid = By.xpath("(//div[@data-role=\"collapsible\"])[8]/div[2]/ol/li/a");
	
	By climate = By.xpath("(//div[@class='filter-options-title'])[6]");
	By all = By.xpath("(//div[@data-role=\"collapsible\"])[8]/div[2]/ol/li[1]/a");
	
	By apperance = By.xpath("(//a[@class='modes-mode mode-list'])[1]");
	By addtocart = By.xpath("(//button[@title='Add to Cart'])[1]");
	By shoppingcart = By.xpath("//a[@class='action showcart']");
	By proceed = By.xpath("//button[@id='top-cart-btn-checkout']");

	
	public void Login(String Email, String password) {
		
//User Login
		
		log.debug("Click on signin and enter email & password");
		WebElement signIn = driver.findElement(signin);
	    clickMethod(signIn);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
	    WebElement EMail = driver.findElement(email);
	    sendkeysint(EMail, Email);
	    
	    WebElement PassW = driver.findElement(Password);
	    sendkeysint(PassW, password);
	    
	    WebElement CsignIn = driver.findElement(clicksignin);
	    clickMethod(CsignIn); 
	    log.debug("User logged in successfully");
	    
	}
	
	public void addtocart() throws InterruptedException {
		
		
//Hover over mouse to Women 
		
		Actions act = new Actions(driver);
		
		WebElement Women = driver.findElement(women);
		act.moveToElement(Women).perform();
		log.debug("hover the mouse to women");
		 
//Hover mouse to Bottom
		WebElement Bottom = driver.findElement(bottom);
		act.moveToElement(Bottom).perform();
		log.debug("hover the mouse to bottom");
		
//click on pants 
		WebElement Pants = driver.findElement(pants);
		clickMethod(Pants);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		log.debug("click on pants");
		
//select shopping options -style,size,colour,price,type,pattern,climate
		
		WebElement Style = driver.findElement(style);
		clickMethod(Style);
		Thread.sleep(2000);
		
		WebElement Capri = driver.findElement(capri);
		clickMethod(Capri);
		Thread.sleep(2000);
		
		WebElement Size = driver.findElement(size);
		clickMethod(Size);
		
		WebElement Select = driver.findElement(select);
		clickMethod(Select);
		Thread.sleep(2000);
		
		
		WebElement Price = driver.findElement(price);
		clickMethod(Price);
		
		WebElement Selectprice = driver.findElement(selectprice);
		clickMethod(Selectprice);
		Thread.sleep(2000);
		
		WebElement Colour = driver.findElement(colour);
		clickMethod(Colour);
		
		WebElement blue = driver.findElement(Blue);
		clickMethod(blue);
		Thread.sleep(2000);
		
		WebElement Type = driver.findElement(type);
		clickMethod(Type);
		
		WebElement Cotton = driver.findElement(cotton);
		clickMethod(Cotton);
		Thread.sleep(2000);
		
		WebElement Pattern = driver.findElement(pattern);
		clickMethod(Pattern);
		
		WebElement Solid = driver.findElement(solid);
		clickMethod(Solid);
		Thread.sleep(2000);
		
		WebElement Climate = driver.findElement(climate);
		clickMethod(Climate);
		
		WebElement All = driver.findElement(all);
		clickMethod(All);
		Thread.sleep(2000);
		log.debug("All shopping options are selected -style,size,colour,price,type,pattern,climate");
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,200)");
		
//change items position
		WebElement appear = driver.findElement(apperance);
		clickMethod(appear);
		Thread.sleep(2000);

//add item to cart
		JavascriptExecutor js1 =(JavascriptExecutor)driver;
		js1.executeScript("window.scrollBy(0,200)");
		Thread.sleep(2000);
		
		log.debug("click on add to cart");
		WebElement Add = driver.findElement(addtocart);
		clickMethod(Add);
		Thread.sleep(4000);
		
//click on shopping cart
		WebElement cart = driver.findElement(shoppingcart);
		clickMethod(cart);
		Thread.sleep(2000);
		log.debug("Item is added to cart");
		
		WebElement Tocart = driver.findElement(proceed);
		clickMethod(Tocart);
		Thread.sleep(5000);		

		try {
			takescreenshot("Cart Summery");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
