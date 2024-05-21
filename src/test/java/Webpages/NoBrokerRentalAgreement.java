package Webpages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class NoBrokerRentalAgreement extends Baseclass3 {

	WebDriver driver;

	public NoBrokerRentalAgreement(WebDriver driver) {
		this.driver = driver;
	}

	By login = By.xpath("//div[@class='px-1p border-l-1 border-l-solid border-l-header-grey cursor-pointer']");
	By phone = By.xpath("//input[@placeholder='Enter Mobile Number']");
	By continu = By.xpath("//label[@for='login-signup-form-login-radio-password']");
	By password = By.xpath("//input[@placeholder='Enter Password']");
	By continu1 = By.xpath("//button[@id='signUpSubmit']");

//rental agreement
	By menu = By.xpath(
			"//div[@class='flex py-0 px-1.5p border-l-1 border-l-solid border-l-header-grey items-center cursor-pointer']");
	By rentalagreement = By.xpath(
			"//div[@style='box-shadow:0 10px 10px 0 rgba(0, 0, 0, 0.1);max-height:calc(100vh - 52px)']/a[text()='Rental Agreement']");
//	By location = By.xpath("//img[@src='https://assets.nobroker.in/hs-new/public/Common/bangalore.png']");
	By Estampped = By.xpath("//div[@class=\"relative grid grid-cols-2 gap-4 md:gap-5 md:grid-cols-3\"]/div[2]");

	// generate estimate
	By stamp = By.xpath("//div[@class='nb-stampdutyselector-container']/div[text()='₹ 20 Stamp']");
	By startdate = By.xpath("//input[@class='form-control ']");
	By selectdate = By.xpath("//div[@class=\"react-datepicker__month\"]/div[4]/div[text()='23']");
	By owner = By.xpath("//div[@class='user-type-container mb-2']/div[text()='Owner']");
	By save = By.xpath("//button[@class='po:px-2 po:py-1 default-footer-button rounded-6 btn btn-default']");

	// property details
	By floors = By.xpath("//div[@class='nb-buttonDropdown-container ']/div[text()='1']");
	By BHK = By.xpath("//div[@class='nb-buttonDropdown-container ']/div[text()='2 BHK']");
	By typeproperty = By.xpath("(//div[@aria-hidden='true'])[3]");
	By selectprop = By.xpath("//div[text()='Office']");
	By officenum = By.xpath("//input[@placeholder='Enter Number']");
	By buildingnum = By.xpath("//input[@name='buildingName']");
	By locality = By.xpath("//input[@name='locality']");
	By pincode = By.xpath("//input[@name='pincode']");
//	By numBR = By.xpath("//div[@id='-add']");
	By proceed = By.xpath("//button[@class='po:px-2 po:py-1 default-footer-button rounded-6 btn btn-default']");

	// landlord details
	By name1 = By.xpath("//input[@placeholder='Enter Full Name']");
	By age = By.xpath("//input[@placeholder='Enter Age']");
	By gender = By.xpath("(//div[@aria-hidden='true'])[2]");
	By female = By.xpath("//div[text()='Female']");
	By phone1 = By.xpath("//input[@name='phone']");
	By address = By.xpath("//input[@name='street']");
	By email1 = By.xpath("//input[@name='email']");
	By pincode1 = By.xpath("//input[@name='pincode']");
	By save1 = By.xpath("//button[@class='po:px-2 po:py-1 default-footer-button rounded-6 btn btn-default']");

	// Tenant details
	By fullname = By.xpath("//input[@placeholder='Enter Full Name']");
	By age1 = By.xpath("//input[@placeholder='Enter Age']");
	By gender1 = By.xpath("(//div[@aria-hidden='true'])[2]");
	By female1 = By.xpath("//div[text()='Female']");
	By permanentadd = By.xpath("//input[@placeholder='Enter Full Address']");
	By pincode2 = By.xpath("//input[@name='pincode']");
	By save2 = By.xpath("//button[@class='po:px-2 po:py-1 default-footer-button rounded-6 btn btn-default']");
	
	//contract details 
	By agreement = By.xpath("//div[text()='12 Months']");
	By startdate1 = By.xpath("(//input[@class='form-control '])[1]");
	By march = By.xpath("//button[@class=\"react-datepicker__navigation react-datepicker__navigation--next\"]");
	By selectdate1 = By.xpath("//div[@class='react-datepicker__month']/div[1]/div[5]");
	By rent = By.xpath("//input[@name='rentAmount']");
	By refund = By.xpath("//input[@name='refundableDeposit']");
	By deposit = By.xpath("//input[@name='refundableDeposit']");
	By lockin = By.xpath("(//div[@class='nb-buttonDropdown-container '])[2]/div[3]");
	By rentday = By.xpath("(//input[@class='form-control '])[2]");
	By selectday = By.xpath("//div[@class='modal-dialog ls-date-container dialogView']/div/div/div/div[1]");
	By noticeperiod = By.xpath("//div[@id='ls-documentforms-noticePeriod-nbInput']/div/div[2]");
	By save3 = By.xpath("//button[@class='po:px-2 po:py-1 default-footer-button rounded-6 btn btn-default']");
	

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

	public void rentalagreement() throws InterruptedException {

		WebElement Menu = driver.findElement(menu);
		clickMethod(Menu);
		Thread.sleep(2000);

		WebElement Rentalagreement = driver.findElement(rentalagreement);
		clickMethod(Rentalagreement);
		Thread.sleep(4000);

//		WebElement Location = driver.findElement(location);
//		clickMethod(Location);      

		log.debug("click on E-stampped agreement");
		
		WebElement EStampped = driver.findElement(Estampped);
		clickMethod(EStampped);
		Thread.sleep(2000);

		WebElement Stamp = driver.findElement(stamp);
		clickMethod(Stamp);
		Thread.sleep(3000);

		WebElement Startdate = driver.findElement(startdate);
		clickMethod(Startdate);
		Thread.sleep(3000);

		WebElement Selectdate = driver.findElement(selectdate);
		clickMethod(Selectdate);
		Thread.sleep(4000);

		WebElement Ownwer = driver.findElement(owner);
		clickMethod(Ownwer);
		Thread.sleep(3000);

		WebElement Save = driver.findElement(save);
		clickMethod(Save);
		Thread.sleep(2000);
	}

	public void propertydetails() throws InterruptedException {

//Property details 
 
		log.debug("enter property details");
		
		WebElement Floor = driver.findElement(floors);
		clickMethod(Floor);
		Thread.sleep(2000);

		WebElement bhk = driver.findElement(BHK);
		clickMethod(bhk);
		Thread.sleep(2000);

		WebElement type = driver.findElement(typeproperty);
		clickMethod(type);
		Thread.sleep(2000);

		WebElement Selectprop = driver.findElement(selectprop);
		clickMethod(Selectprop);
		Thread.sleep(2000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)");

		WebElement Officenum = driver.findElement(officenum);
		explicitWait(driver, 20, Officenum);
		clearMethod(Officenum);
		sendkeysint(Officenum, "25-7");

		WebElement buildingnumb = driver.findElement(buildingnum);
		explicitWait(driver, 20, buildingnumb);
		clearMethod(buildingnumb);
		sendkeysint(buildingnumb, "xyZ");

		WebElement Locality = driver.findElement(locality);
		explicitWait(driver, 20, Locality);
		clearMethod(Locality);
		sendkeysint(Locality, "Brookefeild");

		WebElement Pin = driver.findElement(pincode);
		explicitWait(driver, 20, Pin);
		sendkeysint(Pin, "560037");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

//		WebElement BR= driver.findElement(numBR);
//		clickMethod(BR);
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		WebElement proceeD = driver.findElement(proceed);
		clickMethod(proceeD);
		Thread.sleep(2000);

	}

	public void landlorddetails() throws InterruptedException {

		log.debug("enter landlord details");
		WebElement Name = driver.findElement(name1);
		explicitWait(driver, 20, Name);
		clearMethod(Name);
		sendkeysint(Name, "Sai Krupa");

		WebElement Age = driver.findElement(age);
		explicitWait(driver, 20, Age);
		clearMethod(Age);
		sendkeysint(Age, "47");

		WebElement Gender = driver.findElement(gender);
		clickMethod(Gender);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		WebElement Gender1 = driver.findElement(female);
		clickMethod(Gender1);
	

		WebElement Phone1 = driver.findElement(phone1);
		explicitWait(driver, 20, Phone1);
		clearMethod(Phone1);
		sendkeysint(Phone1, "9652689047");

		WebElement Addre = driver.findElement(address);
		explicitWait(driver, 20, Addre);
		clearMethod(Addre);
		sendkeysint(Addre, "17/33,B-Block");

		WebElement Mail = driver.findElement(email1);
		explicitWait(driver, 20, Mail);
		clearMethod(Mail);
		sendkeysint(Mail, "sai123@gmail.com");

		WebElement code1 = driver.findElement(pincode1);
		explicitWait(driver, 20, code1);
		clearMethod(code1);
		sendkeysint(code1, "560037");

		WebElement proceeD1 = driver.findElement(save1);
		clickMethod(proceeD1);
		Thread.sleep(2000);
	}

      public void Tenantdetails() throws InterruptedException {
		
    	  log.debug("enter tenant details");
		WebElement Name1 = driver.findElement(fullname);
		explicitWait(driver, 20, Name1);
		clearMethod(Name1);
		sendkeysint(Name1, "Akhila"); 
		
		WebElement Age1 = driver.findElement(age1);
		explicitWait(driver, 20, Age1);
		clearMethod(Age1);
		sendkeysint(Age1, "23");
		
		WebElement Gender3 = driver.findElement(gender1);
		clickMethod(Gender3);
		

		WebElement Gender2 = driver.findElement(female1);
		clickMethod(Gender2);
	
		
		WebElement Addre1 = driver.findElement(permanentadd);
		explicitWait(driver, 20, Addre1);
		clearMethod(Addre1);
		sendkeysint(Addre1, "17/35,Brookefeild");
		
		WebElement code2 = driver.findElement(pincode2);
		explicitWait(driver, 20, code2);
		clearMethod(code2);
		sendkeysint(code2, "560037");
		
		WebElement proceeD2 = driver.findElement(save2);
		clickMethod(proceeD2);
		Thread.sleep(2000);
      }
     
      public void Contractdetails() throws InterruptedException {
    	  
    	  log.debug("enter contract details");
    	  
    	WebElement Agree = driver.findElement(agreement);
  		clickMethod(Agree);
  		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
  		
  		WebElement Startdate1 = driver.findElement(startdate1);
		clickMethod(Startdate1);
		Thread.sleep(2000);
		
		WebElement March = driver.findElement(march);
		clickMethod(March);
		Thread.sleep(2000);
		
		WebElement Selectdate1 = driver.findElement(selectdate1);
		clickMethod(Selectdate1);
		Thread.sleep(2000);
		
		WebElement Rent = driver.findElement(rent);
		explicitWait(driver, 20, Rent);
		clearMethod(Rent);
		sendkeysint(Rent, "16,000");
		
		WebElement Refund = driver.findElement(refund);
		explicitWait(driver, 20, Refund);
		clearMethod(Refund);
		sendkeysint(Refund, "12,000");
		
		
		WebElement Deposit = driver.findElement(deposit);
		explicitWait(driver, 20, Rent);
		clearMethod(Deposit);
		sendkeysint(Deposit, "4000");

		WebElement Lockin = driver.findElement(lockin);
  		clickMethod(Lockin);

    	  
  		WebElement Rentday = driver.findElement(rentday);
  		clickMethod(Rentday);
  		
  		
  		WebElement Selectday = driver.findElement(selectday);
  		clickMethod(Selectday);
  		
  		
  		WebElement noticep = driver.findElement(noticeperiod);
  		clickMethod(noticep);
  		
  		
  		WebElement proceeD3 = driver.findElement(save3);
		clickMethod(proceeD3);
		Thread.sleep(2000);
    	 
		log.debug("click on save ");
    	  
      }
	
}
