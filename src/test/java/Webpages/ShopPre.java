package Webpages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ShopPre extends Baseclass2 {

	WebDriver driver;

	public ShopPre(WebDriver driver) {
		this.driver = driver;
	}

	By popup= By.xpath("//div[@class='leadinModal-content']/button");
	By services = By.xpath("//a[@id='btn-home-page-service-menu-1']");
	By schedulepickup = By.xpath("(//a[@href='https://www.shopprecouriers.com/schedule-pickup'])[2]");
	By Learnmore = By.xpath("//a[@href=\"/international-courier-shipping-services-india\"]/span[text()='How to send a parcel by courier?']");
    By text =By.xpath("//h1[@class=\"f-c-d-greay f-s-30 f-w-8\"]");
    
	//contact details 
    By name = By.xpath("(//div[@class='form-group'])[8]/input");
    By phonenum=By.xpath("(//div[@class='col-sm-8'])/input");
    By email = By.xpath("(//div[@class='form-group'])[9]/input");
    By servicetype = By.xpath("//select[@id=\"ddl-service-type\"]");
    By dropoff = By.xpath("//select[@id='ddl-service-type']/option[text()='Drop Off']");
    By selectdrop = By.xpath("//select[@name=\"drop_off_location_id\"]");
    By droplocation = By.xpath("//select[@name=\"drop_off_location_id\"]/option[text()='Shopprecouriers - HSR Layout']");
    
    //package information
    By numberofbox  = By.xpath("//input[@name='no_of_packages']");
    By weight = By.xpath("//input[@class='form-control valid']");
    By itemname = By.xpath("//input[@class='form-control self_url']");
    By quantity = By.xpath("//input[@class='form-control self_amt']");
    By price = By.xpath("(//input[@class='form-control self_qty'])[1]");
    
//Destination 
    By firstname = By.xpath("(//input[@placeholder='Enter First Name'])[2]");
    By lastname =By.xpath("(//input[@placeholder='Enter Last Name'])[2]");
    By street = By.xpath("(//input[@placeholder='Please Enter Street'])[2]");
    By pin = By.xpath("(//input[@placeholder='Enter Pincode'])[2]");
    By state = By.xpath("(//input[@placeholder='Enter State'])");
    By city = By.xpath("(//input[@placeholder='Enter City'])[2]");
    By country = By.xpath("//span[@id='select2-dc_country-container']");
    By selcontr = By.xpath("//input[@class='select2-search__field']");
    By code = By.xpath("//select[@name='dc_phone_code']");
    By phone = By.xpath("(//input[@class='form-control'])[16]");
     By confirm = By.xpath("(//button[@id=' pickup btn_terms_popup'])[2]");
	
	public void Services() throws InterruptedException {


		WebElement PopUp = driver.findElement(popup);
		clickMethod(PopUp);
		Thread.sleep(2000);
		
		log.debug("click on services");
		WebElement service = driver.findElement(services);
		clickMethod(service);
		Thread.sleep(2000);
		
		log.debug("click on schedule pickup in courier service");
		WebElement Spickup = driver.findElement(schedulepickup);
		clickMethod(Spickup);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		log.debug("Learn More 👉 How to send a parcel by courier?");
		WebElement learn = driver.findElement(Learnmore);
		clickMethod(learn);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement Text = driver.findElement(text);
		getText(Text);
		
		driver.navigate().back();
		
		log.debug("Fill all contatct details");
//contact details		
		WebElement Name = driver.findElement(name);
		explicitWait(driver, 20, Name);
		sendkeysint(Name, "Akhila");
		Thread.sleep(2000);
		
		WebElement number = driver.findElement(phonenum);
		explicitWait(driver, 20, number);
		sendkeysint(number, "9652689047");
		Thread.sleep(2000);

		WebElement mail = driver.findElement(email);
		explicitWait(driver, 20, mail);
		sendkeysint(mail, "akhilasai12@gmail.com");
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		
		WebElement sertype = driver.findElement(servicetype);
		clickMethod(sertype);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement drop = driver.findElement(dropoff);
		clickMethod(drop);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement selloc = driver.findElement(selectdrop);
		clickMethod(selloc);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement droploc = driver.findElement(droplocation);
		clickMethod(droploc);

		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,400)");

//pacakage information
		
		log.debug("Enter package information");
		WebElement boxnum = driver.findElement(numberofbox);
		explicitWait(driver, 20, boxnum);
		sendkeysint(boxnum, "1");
	
		WebElement boxweight = driver.findElement(weight);
		explicitWait(driver, 20, boxweight);
		sendkeysint(boxweight, "4");
		
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0,400)");
		
		WebElement nameitem = driver.findElement(itemname);
		explicitWait(driver, 20, nameitem);
		sendkeysint(nameitem, "bags");
		
		WebElement quantityno = driver.findElement(quantity);
		explicitWait(driver, 20, quantityno);
		sendkeysint(quantityno, "02");
		
		WebElement itemprice = driver.findElement(price);
		explicitWait(driver, 20, itemprice);
		sendkeysint(itemprice, "1500");
		
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("window.scrollBy(0,400)");
		
//Destination 
		log.debug("Enter destination details");
		WebElement firstname1 = driver.findElement(firstname);
		explicitWait(driver, 20, firstname1);
		sendkeysint(firstname1, "Akhila");
		
		WebElement Lastname1 = driver.findElement(lastname);
		explicitWait(driver, 20, Lastname1);
		sendkeysint(Lastname1, "Golla");
		
		WebElement Street = driver.findElement(street);
		explicitWait(driver, 20, Street);
		sendkeysint(Street, "AECS Layout");
		
		WebElement Pin = driver.findElement(pin);
		explicitWait(driver, 20, Pin );
		sendkeysint(Pin , "AECS Layout");
		
		WebElement State= driver.findElement(state);
		explicitWait(driver, 20, State );
		sendkeysint(State , "Karnataka");
		
		
		WebElement City= driver.findElement(city);
		explicitWait(driver, 20, City );
		sendkeysint(City , "Bangalore");
		
		WebElement Country= driver.findElement(country);
		clickMethod(Country);
		Thread.sleep(2000);
		
		WebElement cont= driver.findElement(selcontr);
		explicitWait(driver, 20, cont );
		sendkeysint(cont , "Algeria");
		Thread.sleep(3000);
		cont.sendKeys(Keys.ENTER);
		
		Select select = new Select(driver.findElement(code));
		select.selectByValue("213");
		
		WebElement numbe= driver.findElement(phone);
		explicitWait(driver, 20, numbe );
		sendkeysint(numbe , "9652689047");
		
		log.debug("click on confirm");
		WebElement Confirm= driver.findElement(confirm);
		clickMethod(Confirm);
		Thread.sleep(2000);
	}
}
