package Webpages;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class wonderlegal1 extends Baseclass3 {

	WebDriver driver;

	public wonderlegal1(WebDriver driver) {
		this.driver = driver;
	}

	By myaccount = By.xpath("//a[@class='logincompte']");
	By email = By.xpath("//input[@type='email']");
	By clickalready = By.xpath("//label[@id='id_mot_de_passe_existe_oui']");
	By password = By.xpath("//input[@type='password']");
	By login = By.xpath("//button[@class='connexion deuxi btn large call2action']");

	By documents = By.xpath("(//a[@href='https://www.wonder.legal/in/choix-modele/'])[1]");
	By personal = By.xpath("//a[@href='https://www.wonder.legal/in/choix-modele/personal'][text()='Personal']");
	By travelform = By.xpath("//a[@id='item_2756']");
	By filltemplate = By.xpath("(//a[@class='btn large call2action creation-document'])[1]");

//details
	By travellingwith = By.xpath("//select[@id='travel_accompaniment']");
	By next = By.xpath("//button[@type='submit']");
	By next1 = By.xpath("(//button[@type='submit'])[1]");
	By parent = By.xpath("//input[@name='only_parent_name']");
	By address = By.xpath("//input[@name='only_parent_address']");
	By phone = By.xpath("//input[@name='only_parent_phone_number']");
	By next2 = By.xpath("//button[@type='submit']");
	By emailid = By.xpath("//input[@name='only_parent_email_address']");
	By next3 = By.xpath("//button[@onclick='formulaire_ajax(this.name, event);'][1]");
	By click = By.xpath("//button[@class='questions suivante autre_etape btn call2action']");
	By childname = By.xpath("//input[@name='only_child_name']");
	By date = By.xpath("//input[@name='only_child_birth_date']");
	By selectyear = By.xpath("//select[@class='ui-datepicker-year']");
	By selectday = By.xpath("(//td[@data-handler=\"selectDay\"])[15]");
	By next4 = By.xpath("//button[@onclick='formulaire_ajax(this.name, event);'][1]");
	By birthplace = By.xpath("//input[@id='only_child_birth_location']");
	By next5 = By.xpath("//button[@onclick='formulaire_ajax(this.name, event);'][1]");
	By passport = By.xpath("//input[@name='only_child_passport_number']");
	By next6 = By.xpath("//button[@onclick='formulaire_ajax(this.name, event);'][1]");
	By destination = By.xpath("//input[@name='travel_destination']");
	By next7 = By.xpath("//button[@onclick='formulaire_ajax(this.name, event);'][1]");
	By traveldate = By.xpath("//input[@name='travel_date_start']");
	By selectdate = By.xpath("(//a[@class='ui-state-default'])[29]");
	
	By traveldate11 = By.xpath("//input[@name='travel_date_start']");
	By selectdate11 = By.xpath("(//a[@class='ui-state-default'])[29]");
	
	By tripend = By.xpath("//input[@name='travel_date_end']");
	By selectdate1=By.xpath("(//a[@class='ui-state-default'])[30]");
	By next8 = By.xpath("//button[@onclick=\"formulaire_ajax(this.name, event);\"][1]");
	By inchargename = By.xpath("//input[@name='group_travel_adult_contact']");
	By click1 = By.xpath("(//button[@onclick='formulaire_ajax(this.name, event);'])[1]");
	By click2 = By.xpath("(//button[@onclick='formulaire_ajax(this.name, event);'])[1]");
	By Contact = By.xpath("//input[@name='travel_adult_contact_number']");
	By emailId = By.xpath("//input[@name='travel_adult_email']");
	By click3 = By.xpath("(//button[@onclick='formulaire_ajax(this.name, event);'])[1]");
	By disability= By.xpath("//div[@class='radio_box_texte']");
	By click4 = By.xpath("(//button[@onclick='formulaire_ajax(this.name, event);'])[1]");
    By enclosure = By.xpath("//div[@class='radio_box_texte']");
    By click5 = By.xpath("(//button[@onclick='formulaire_ajax(this.name, event);'])[1]");
    


	public void Login(String EmaiL, String PassWord) throws InterruptedException {

		
		WebElement Account = driver.findElement(myaccount);
		clickMethod(Account);
		log.debug("clicked on my account");

//Enter email
		WebElement mail = driver.findElement(email);
		sendkeysint(mail, EmaiL);
		Thread.sleep(2000);

//click on i already have account
		WebElement click = driver.findElement(clickalready);
		clickMethod(click);
		Thread.sleep(2000);

//enter password
		WebElement passw = driver.findElement(password);
		sendkeysint(passw, PassWord);
		
		log.debug("Enter email and password and click on login");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");

//Click on login
		WebElement Login = driver.findElement(login);
		clickMethod(Login);
		Thread.sleep(4000);
		
		log.debug("user logged in successfully");

	}

	public void personal() throws InterruptedException {

//Hover over to document
		WebElement Doc = driver.findElement(documents);

		Actions actions = new Actions(driver);
		actions.moveToElement(Doc).perform();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		log.debug("click on personals from documents submenu");
		

//Click on personals
		WebElement Personal = driver.findElement(personal);
		clickMethod(Personal);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");

//click on Travel consent form
		
		log.debug("click on Travel consent form and fill the template");
		WebElement Travelform = driver.findElement(travelform);
		clickMethod(Travelform);
		

//click on fill template 
		WebElement fill = driver.findElement(filltemplate);
		clickMethod(fill);
	}

	public void Travelconsentform(String Parent, String Address, String Phone, String EmailID, String ChildName,
			String BirthPlace, String PassPort, String DestinatioN, String InchargeName, String ContactNumber, String EMAILid) throws InterruptedException {

//enter all the details 
		
		log.debug("Enter all the details and click on next");
		WebElement Travellingwith = driver.findElement(travellingwith);
		Select s1 = new Select(Travellingwith);
		s1.selectByVisibleText("With a group or organization");

		WebElement Next = driver.findElement(next);
		clickMethod(Next);
		Thread.sleep(2000);
		WebElement Next1 = driver.findElement(next1);
		clickMethod(Next1);
		Thread.sleep(2000);

		WebElement pare = driver.findElement(parent);
		sendkeysint(pare, Parent);
		Thread.sleep(2000);

		WebElement Addr = driver.findElement(address);
		sendkeysint(Addr, Address);
		Thread.sleep(2000);

//		boolean elementfound = false;
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

//		while (!elementfound) {
//			try {
//				WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(phone));
//
//				sendkeysint(element, Phone);
//
//				elementfound = true;
//				WebElement next = wait.until(ExpectedConditions.presenceOfElementLocated(next2));
//				next.click();
//			} catch (TimeoutException e) {
//				try {
//					WebElement next = wait.until(ExpectedConditions.presenceOfElementLocated(next2));
//					next.click();
//					WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(phone));
//					sendkeysint(element, Phone);
//					
//				}catch(TimeoutException ex) {
//					break;
//				}
//			}
//		}

		
		
		WebElement Next2 = driver.findElement(next2);
		clickMethod(Next2);
		Thread.sleep(2000);

		WebElement phon = driver.findElement(phone);
		sendkeysint(phon, Phone);
		Thread.sleep(2000);

//	     }
		WebElement mailid = driver.findElement(emailid);
		sendkeysint(mailid, EmailID);
		Thread.sleep(2000);

		WebElement Next3 = driver.findElement(next3);
		clickMethod(Next3);
		Thread.sleep(2000);
		
		WebElement Click = driver.findElement(click);
		clickMethod(Click);

		WebElement Cname = driver.findElement(childname);
		sendkeysint(Cname, ChildName);
		Thread.sleep(2000);

		WebElement Date = driver.findElement(date);
		clickMethod(Date);
		Thread.sleep(2000);

		WebElement year = driver.findElement(selectyear);
		Select s = new Select(year);
		s.selectByVisibleText("2019");

		WebElement Day = driver.findElement(selectday);
		clickMethod(Day);
		Thread.sleep(2000);

		WebElement Next4 = driver.findElement(next4);
		clickMethod(Next4);
		Thread.sleep(2000);

		WebElement Birth = driver.findElement(birthplace);
		sendkeysint(Birth, BirthPlace);
		Thread.sleep(2000);

		WebElement Next5 = driver.findElement(next5);
		clickMethod(Next5);

		WebElement Passport = driver.findElement(passport);
		sendkeysint(Passport, PassPort);
		Thread.sleep(2000);

		WebElement Next6 = driver.findElement(next6);
		clickMethod(Next6);

		WebElement Destination = driver.findElement(destination);
		sendkeysint(Destination, DestinatioN);
		Thread.sleep(2000);

		WebElement Next7 = driver.findElement(next7);
		clickMethod(Next7);
		
		WebElement Traveldate = driver.findElement(traveldate);
		clickMethod(Traveldate);
		Thread.sleep(2000);
		
		WebElement Selectdate = driver.findElement(selectdate);
		clickMethod(Selectdate);
		Thread.sleep(2000);
		
		WebElement Traveldate11 = driver.findElement(traveldate11);
		clickMethod(Traveldate11);
		Thread.sleep(2000);
		
		WebElement Selectdate11 = driver.findElement(selectdate11);
		clickMethod(Selectdate11);
		Thread.sleep(2000);
		
		
		WebElement Enddate = driver.findElement(tripend);
		clickMethod(Enddate);
		Thread.sleep(2000);
		
		WebElement Selectdate1 = driver.findElement(selectdate1);
		clickMethod(Selectdate1);
		Thread.sleep(2000);
		
		WebElement Next8 = driver.findElement(next8);
		clickMethod(Next8);
		
		WebElement incharge = driver.findElement(inchargename);
		sendkeysint(incharge, InchargeName);
		Thread.sleep(2000);
		
		WebElement Click1 = driver.findElement(click1);
		clickMethod(Click1);
		Thread.sleep(2000);
		
		WebElement Click2 = driver.findElement(click2);
		clickMethod(Click2);
		Thread.sleep(2000);
		
		WebElement Cont = driver.findElement(Contact);
		sendkeysint(Cont, ContactNumber);
		Thread.sleep(2000);
		
		WebElement id = driver.findElement(emailId);
		sendkeysint(id, EMAILid);
		Thread.sleep(2000);
		
		WebElement Click3 = driver.findElement(click3);
		clickMethod(Click3);
		Thread.sleep(2000);
		
		WebElement Disablity = driver.findElement(disability);
		clickMethod(Disablity);
		Thread.sleep(2000);
		
		WebElement Click4 = driver.findElement(click4);
		clickMethod(Click4);
		Thread.sleep(2000);
		
		WebElement Enclosu = driver.findElement(enclosure);
		clickMethod(Enclosu);
		Thread.sleep(2000);
		
		WebElement Click5 = driver.findElement(click5);
		clickMethod(Click5);
		Thread.sleep(3000);
		
		log.debug("Document is ready");
		
		try {
			takescreenshot("documentready");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
