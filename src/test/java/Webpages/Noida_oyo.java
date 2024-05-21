package Webpages;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Noida_oyo extends Baseclass3 {


	WebDriver driver;

	public Noida_oyo(WebDriver driver) {
		this.driver = driver;
	}

	By allcities = By.xpath("//a[@href=\"/allcities/\"]");
    By alphabet = By.xpath("(//a[@class=\"c-1lbid7y\"])[14]");
//    By citynum = By.xpath("//div[@class=\"c-i0v0l3\"]/div[2]/h1[text()='Cities from N (22)']");
	By Noida = By.xpath("//a[@href=\"/hotels-in-noida/\"]");
	By location = By.xpath("//a[@class=\"c-nn640c\"][3]/div[text()='Greater Noida']");
	By calender = By.xpath("//div[@class='oyo-cell oyo-cell--12-col oyo-cell--8-col-tablet oyo-cell--4-col-phone d-text14 headerDatePicker__checkInOut u-textEllipsis']");
    By date = By.xpath("//div[@class='DateRangePicker__Month'][2]/table/tbody/tr[3]/td[3]");
	By date1 = By.xpath("//div[@class='DateRangePicker__Month'][2]/table/tbody/tr[3]/td[6]");
	By select = By.xpath("//div[@class='oyo-cell oyo-cell--12-col oyo-cell--8-col-tablet oyo-cell--4-col-phone d-text14 u-textEllipsis headerGuestRoomPicker__guestRoomCount']");
	By addguest = By.xpath("//span[@class='guestRoomPickerPopUp__plus']");
	By addroom = By.xpath("//button[@class='guestRoomPickerPopUp__addRoom']");
	By addguest1 = By.xpath("(//span[@class=\"guestRoomPickerPopUp__plus\"])[2]");
	By search = By.xpath("//button[@class=\"u-textCenter searchButton searchButton--header\"]");
	By title = By.xpath("//h1[@class='ListingContentHeader__h1']");
	By collections = By.xpath("//div[text()='Family OYOs']");
	By townhouse = By.xpath("//span[text()='Townhouse']");
	By hotel = By.xpath("//div[text()='Hotel']");
	By tv = By.xpath("//input[@id='39']");
	By pay = By.xpath("//div[text()='Pay at Hotel']");
	By hotel1 = By.xpath("//h3[text()='OYO Townhouse 589 Hotel Diamond View']");
	By map = By.xpath("//label[@class='ToggleButton']/span");
	By sortBy = By.xpath("//div[@class='dropdown']/span[2]");
	By guestrating = By.xpath("//li[@class='dropdown__item'][2]");

	
	public void noidahotels() throws InterruptedException {
		
		log.debug("click on ALL cities");
		WebElement all = driver.findElement(allcities);
		clickMethod(all);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		log.debug("select alphabet N");
		WebElement N = driver.findElement(alphabet);
		clickMethod(N);
		
		log.debug("display the list of cities start from N");
		
//		String text = driver.findElement(citynum).getText();
//		System.out.println(text);
		
		log.debug("click on Noida");
		WebElement noida = driver.findElement(Noida);
		clickMethod(noida);
		
		log.debug("enter location - Greater noida");
		WebElement Location = driver.findElement(location);
		clickMethod(Location);
		Thread.sleep(4000);
		
		log.debug("select all calender and enter number of rooms, persons");
		WebElement calend = driver.findElement(calender);
		clickMethod(calend);
		    
		WebElement Date = driver.findElement(date);
		clickMethod(Date);
		
		WebElement Date1 = driver.findElement(date1);
		clickMethod(Date1);
		
		WebElement Select = driver.findElement(select);
		clickMethod(Select);
		
		WebElement Addguest = driver.findElement(addguest);
		clickMethod(Addguest);
		
		WebElement Addroom = driver.findElement(addroom);
		clickMethod(Addroom);
		
		WebElement Addguest1 = driver.findElement(addguest1);
		clickMethod(Addguest1);
		
		log.debug("click on search");
		WebElement Search = driver.findElement(search);
		clickMethod(Search);
		Thread.sleep(3000);
		
		String text1 = driver.findElement(title).getText();
		System.out.println(text1);
		
		log.debug("select filters");
		WebElement Collection = driver.findElement(collections);
		clickMethod(Collection);
		Thread.sleep(2000);
	
		WebElement Town = driver.findElement(townhouse);
		clickMethod(Town);
		
		WebElement Hotel = driver.findElement(hotel);
		clickMethod(Hotel);
		Thread.sleep(5000);
		
		WebElement TV = driver.findElement(tv);
		clickMethod(TV);
		
		WebElement Pay = driver.findElement(pay);
		clickMethod(Pay);
		
		WebElement Hotel2 = driver.findElement(hotel1);
		clickMethod(Hotel2);
		Thread.sleep(5000);
		
		log.debug("hotel opens in another window");
		
		String parent_win = driver.getWindowHandle();    
		
		Set<String> set = driver.getWindowHandles();     
	
		Iterator<String> I = set.iterator();
		
	   while(I.hasNext()){
			
		   String child_win =I.next();
		   
		   if(!(parent_win.equals(child_win))) {
			 //System.out.println(index.size());
			   driver.switchTo().window(child_win);
		   }
		   
		}

	   driver.switchTo().window(parent_win);
	   
	   log.debug("switch to map view");
	   WebElement Map = driver.findElement(map);
		clickMethod(Map);
		
		WebElement sort = driver.findElement(sortBy);
		clickMethod(sort);
		
		WebElement guest = driver.findElement(guestrating);
		clickMethod(guest);
	}

	
	
}
