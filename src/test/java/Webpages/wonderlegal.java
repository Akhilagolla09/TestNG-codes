package Webpages;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class wonderlegal extends Baseclass3{

	WebDriver driver;

	public wonderlegal(WebDriver driver) {
		this.driver = driver;
	}
	
	By documents = By.xpath("(//a[@href='https://www.wonder.legal/in/choix-modele/'])[1]");
	By CancellationLetter = By.xpath("//a[@href=\"https://www.wonder.legal/in/modele/cancellation-letter\"]");
	By fill = By.xpath("(//a[@class='btn large call2action creation-document'])[1]");
	
	By sendername = By.xpath("//input[@name='sender_s_name']");
	By companyname = By.name("sender_s_company_name");
	By next = By.xpath("//button[@type='submit']");
	
	By address = By.id("sender_s_address");
	By servicename = By.xpath("//input[@name='service_provider_s_company_name']");
	By next1 = By.xpath("(//button[@type='submit'])[1]");
	
	By department = By.xpath("//input[@name='department']");
	By companyaddress = By.xpath("//textarea[@placeholder='E.g. 987, Raisina Road, Delhi -110000']");
	By next2 = By.xpath("//button[@onclick='formulaire_ajax(this.name, event);'][1]");
	
	By date = By.xpath("//input[@class='datepicker0 hasDatepicker']");
	By selectdate = By.xpath("//a[@data-date='25']");
	
	By date11 = By.xpath("//input[@class='datepicker0 hasDatepicker']");
	By selectdate11 = By.xpath("//a[@data-date='25']");
	By accountnum = By.xpath("//input[@name='id_number']");
	
	By next3 = By.xpath("//button[@name='suivant']");
	
	By cancelling = By.xpath("//textarea[@name='reason_for_cancellation']");
	By date1 = By.xpath("//input[@id='cancellation_date']");
	By selectdate1 = By.xpath("//a[@data-date='30']");
	By next4 = By.xpath("//button[@name='suivant']");
	
	By checkbox = By.xpath("(//input[@type=\"checkbox\"])[2]");
	By next5 = By.xpath("//button[@name='suivant']");
	
	By bankaccountnum = By.xpath("//input[@name='bank_account_number']");
	By bankname = By.xpath("//input[@name='name_of_bank']");
	By next6 = By.xpath("//button[@name='suivant']");
	By next7 = By.xpath("//button[@name='suivant']");
	
	By refundamount = By.xpath("//input[@name='refund_amount']");
	By next8 = By.xpath("//button[@name='suivant']");
	By next9 = By.xpath("//button[@name='suivant']");
	
	By phonenum = By.xpath("//input[@name='contact_phone_number']");
	By next10 = By.xpath("//button[@name='suivant']");
	
	By checkbox1 = By.xpath("//input[@id='mailing_address']");
	By next11 = By.xpath("//button[@name='suivant']");
	
//	By mailingaddress = By.xpath("//textarea[@name='sender_s_alternate_mailing_address']");
	By mailingaddress = By.id("question_1");
	
	By finish = By.xpath("(//button[@onclick=\"formulaire_ajax(this.name, event);\"])[1]");
	
	public void Documents() throws InterruptedException {

//Documents 
		log.debug("click on documents");
		WebElement doc = driver.findElement(documents);
		clickMethod(doc);
		Thread.sleep(4000);
		
//Personal -select Cancellation letter
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		
		log.debug("select cancellation letter");
		WebElement Personal = driver.findElement(CancellationLetter);
		clickMethod(Personal);
		Thread.sleep(4000);
		
		log.debug("click on Fill out the template");
		WebElement Fill = driver.findElement(fill);
		clickMethod(Fill);

//Enter sender's name & company name 
		log.debug("enter all the details");
		WebElement Name  = driver.findElement(sendername);
		explicitWait(driver, 20, Name);
     	sendkeysint(Name, "sanaya sehgal");
     	
     	
     	WebElement Company  = driver.findElement(companyname);
		explicitWait(driver, 20, Company);
     	sendkeysint(Company, "MX Entertainment Pvt Ltd");
     	
     	WebElement Next = driver.findElement(next);
		clickMethod(Next);
		Thread.sleep(3000);
		
//Enter Address and service 
		WebElement Address  = driver.findElement(address);
		explicitWait(driver, 20, Address);
     	sendkeysint(Address, "12,Gandhi Lane,Mumbai,Maharashtra");
     	Thread.sleep(3000);
     	
     	WebElement service  = driver.findElement(servicename);
		explicitWait(driver, 20, service);
     	sendkeysint(service, "IGPL Gas Limited");
     	
     	WebElement Next1 = driver.findElement(next1);
		clickMethod(Next1);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
     	
//Department & Company address
		WebElement Dept  = driver.findElement(department);
		explicitWait(driver, 20, Dept);
     	sendkeysint(Dept, "Membership Department");
     	Thread.sleep(3000);
     	
     	WebElement Address1  = driver.findElement(companyaddress);
		explicitWait(driver, 20, Address1);
     	sendkeysint(Address1, "987,Raisina Road,Delhi -11000");
     	
     	WebElement Next2 = driver.findElement(next2);
		clickMethod(Next2);
		
//select date and enter account number 
		WebElement Date = driver.findElement(date);
		clickMethod(Date);
		Thread.sleep(3000);
		
		WebElement selectDate = driver.findElement(selectdate);
		clickMethod(selectDate);
		
		WebElement Date11 = driver.findElement(date11);
		clickMethod(Date11);
		Thread.sleep(3000);
		
		WebElement selectDate11 = driver.findElement(selectdate11);
		clickMethod(selectDate11);
		
		WebElement Accountnum = driver.findElement(accountnum);
		sendkeysint(Accountnum, "5262376");
     	
		WebElement Next3 = driver.findElement(next3);
		clickMethod(Next3);
		
//Enter reason for cancellation and cancellation date 
		WebElement Cancelling  = driver.findElement(cancelling);
		explicitWait(driver, 20, Cancelling);
     	sendkeysint(Cancelling, "Lack of Features");
     	
     	WebElement Date1 = driver.findElement(date1);
		clickMethod(Date1);
		Thread.sleep(3000);
		
		WebElement selectDate1 = driver.findElement(selectdate1);
		clickMethod(selectDate1);
		Thread.sleep(3000);
		
		WebElement Next4 = driver.findElement(next4);
		clickMethod(Next4);
		Thread.sleep(3000);
		
		
//Click on chjeckbox
		WebElement Checkbox = driver.findElement(checkbox);
		clickMethod(Checkbox);
		Thread.sleep(3000);
		
		WebElement Next5 = driver.findElement(next5);
		clickMethod(Next5);
		Thread.sleep(3000);
		
//enter bank account number & bank name 
		WebElement BAccountnum = driver.findElement(bankaccountnum);
		sendkeysint(BAccountnum, "526235674");
		Thread.sleep(3000);
		
		WebElement Bankname  = driver.findElement(bankname);
		explicitWait(driver, 20, Bankname);
     	sendkeysint(Bankname, "State bank of India");
     	Thread.sleep(3000);
     	
     	WebElement Next6 = driver.findElement(next6);
		clickMethod(Next6);
		Thread.sleep(3000);
//next
		WebElement Next7 = driver.findElement(next7);
		clickMethod(Next7);
		Thread.sleep(3000);
		
//Refund amount
		WebElement Refundamount  = driver.findElement(refundamount);
		explicitWait(driver, 20, Refundamount);
     	sendkeysint(Refundamount, "3000");
     	Thread.sleep(3000);
     	
     	WebElement Next8 = driver.findElement(next8);
		clickMethod(Next8);
		Thread.sleep(3000);
//next
		WebElement Next9 = driver.findElement(next9);
		clickMethod(Next9);
		Thread.sleep(3000);
		
//phone number
		WebElement Phone  = driver.findElement(phonenum);
		explicitWait(driver, 20, Phone);
     	sendkeysint(Phone, "5432689375");
     	Thread.sleep(3000);
     	
     	WebElement Next10 = driver.findElement(next10);
		clickMethod(Next10);
		Thread.sleep(3000);
     	
//click on checkbox
		WebElement Checkbox1 = driver.findElement(checkbox1);
		clickMethod(Checkbox1);
		Thread.sleep(3000);
		
		WebElement Next11 = driver.findElement(next11);
		clickMethod(Next11);
		Thread.sleep(3000);
		
//Enter mail address & click on Finish 
		WebElement MailAddress  = driver.findElement(mailingaddress);
		explicitWait(driver, 30, MailAddress);
		try {
     	sendkeysint(Address, "12,Gandhi sagar Lane,Kolkata");
     	Thread.sleep(3000);
		}
		catch(StaleElementReferenceException e){
			
		}
     	
     	log.debug("click on Finish");
     	WebElement Finish = driver.findElement(finish);
		clickMethod(Finish);
		Thread.sleep(3000);
		
		try {
			takescreenshot("Cancellationletter");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
