package Webpages;

import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Nestaway extends Baseclass3 {

	WebDriver driver;

	public Nestaway(WebDriver driver) {
		this.driver = driver;
	}

	By menu = By.xpath("//div[@class=\"flex items-center gap-4\"]/div[2]/p");
	By login = By.xpath("//div[@class='flex justify-center gap-4']/button[2][text()='Login']");
	By email = By.xpath("//input[@placeholder='Email id/ Phone number']");
	By click = By.xpath("(//div[@class=\"w-full\"])[2]/button");
	By password = By.xpath("//input[@placeholder='Enter Password']");
	By click1 = By.xpath("(//div[@class='w-full'])[2]/button");

	By menu1 = By.xpath("//div[@class='flex items-center gap-4']/div[2]/p");
	By explore = By.xpath("(//li[@class=\"mb-4 hover:text-primary\"])[6]/a[text()='Explore']");
	By colive = By.xpath("//div[@class='flex flex-wrap gap-2 p-3 max-sm:hidden ']/button[3]");
	By state = By.xpath("//div[@class=\" relative\"]/div");
	By Hyd = By.xpath("//div[@class='flex flex-wrap items-center justify-center gap-1']/div[8]/div/div");
	By colive1 = By.xpath("//div[@class='flex flex-wrap gap-2 p-3 max-sm:hidden ']/button[3]");
	By locality = By.xpath("//div[@class='flex flex-auto items-center']/input");
//	By property = By.xpath("(//div[@class='min-w-[165px] relative'])[1]");
//	By selectprop = By.xpath("(//div[@class=\"min-w-[165px] relative\"])[1]/div[2]/li[3]");
	By popup = By.xpath("//div[@class='flex flex-col justify-between']/div[1]/button/div");
	By looking = By.xpath("(//div[@class='min-w-[165px] relative'])[2]");
	By room = By.xpath("(//div[@class='min-w-[165px] relative'])[2]/div[2]/li[2][text()='Room']");
	By tenant = By.xpath("(//div[@class='min-w-[165px] relative'])[3]");
	By type = By.xpath("(//div[@class='min-w-[165px] relative'])[3]/div[2]/li[2][text()='Girls']");
	By sort = By.xpath("(//div[@class=\"flex gap-2\"])[3]/div[1]");
	By selectsort = By.xpath("(//div[@class=\"flex gap-2\"])[3]/div[1]/div[2]/li[text()='Price: High to Low']");

	By Filters = By.xpath("(//div[@class=\"flex gap-2\"])[3]/button[1]");
	By bhk = By.xpath("(//div[@class='flex flex-wrap gap-3'])[4]/div[1]");
	By Budget = By.xpath("(//div[@class='flex flex-wrap gap-3'])[5]/div[4]");
	By furnishing = By.xpath("(//div[@class='flex flex-wrap gap-3'])[6]/div[1]");
	By ManagedBy = By.xpath("(//div[@class='flex flex-wrap gap-3'])[9]/div[1]");
	By immediate = By.xpath("(//div[@class='flex flex-wrap gap-3'])[10]/div[1]");
	By apply = By.xpath("(//div[@class=\"flex gap-2\"])[4]/button[2]");
	By displayedlist = By.xpath(
			"//div[@class='flex-grow cursor-pointer p-4']/div/a/p[text()='Fully furnished STUDIO in  journalists colony phase 3, gawaldoddi']");

	
	public void Login(String Username,String Password) throws InterruptedException {

		log.debug("click on menu");
		WebElement Menu = driver.findElement(menu);
		clickMethod(Menu);
		Thread.sleep(2000);

//login
		log.debug("click on login button");
		WebElement Login = driver.findElement(login);
		clickMethod(Login);
		Thread.sleep(2000);

		log.debug("Enter email & password");
		WebElement Email = driver.findElement(email);
		//sendkeysint(Email, "akhilasai0209@gmail.com");
		sendkeysint(Email, Username);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		WebElement Click = driver.findElement(click);
		clickMethod(Click);

		WebElement PassW = driver.findElement(password);
	//	sendkeysint(PassW, "18701A0405#");
		sendkeysint(PassW, Password);

		log.debug("click on login");
		WebElement Click1 = driver.findElement(click1);
		clickMethod(Click1);
		Thread.sleep(2000);
		log.debug("loggedin in successfully");

	}
	
	public void explore() throws InterruptedException {
		Thread.sleep(3000);

//Menu
		log.debug("click on menu");
		WebElement Menu1 = driver.findElement(menu1);
		clickMethod(Menu1);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

//Explore -select colive, city, locality
		log.debug("select explore");
		WebElement Explore = driver.findElement(explore);
		clickMethod(Explore);

		log.debug("click on colive");
		WebElement Colive = driver.findElement(colive);
		clickMethod(Colive);

		log.debug("select city-Hyderabad & locality-Gachibowli ");
		WebElement State = driver.findElement(state);
		clickMethod(State);

		WebElement HYD = driver.findElement(Hyd);
		clickMethod(HYD);
		Thread.sleep(2000);

		WebElement Colive1 = driver.findElement(colive1);
		clickMethod(Colive1);

		WebElement Locality = driver.findElement(locality);
		sendkeysint(Locality, "Gachibowli");
		Thread.sleep(5000);
		Locality.sendKeys(Keys.ENTER);

//		WebElement Property = driver.findElement(property);
//		clickMethod(Property);
//		
//		WebElement sel= driver.findElement(selectprop);
//		clickMethod(sel);

		WebElement Popup = driver.findElement(popup);
		clickMethod(Popup);

		log.debug("select all the filters");
//Looking for -room
		WebElement Looking = driver.findElement(looking);
		clickMethod(Looking);
		Thread.sleep(2000);

		WebElement Room = driver.findElement(room);
		clickMethod(Room);
		Thread.sleep(2000);

//Tenant type -girls
		WebElement Tenant = driver.findElement(tenant);
		clickMethod(Tenant);
		Thread.sleep(2000);

		WebElement Type = driver.findElement(type);
		clickMethod(Type);
		Thread.sleep(2000);

//sort - High to low
		WebElement Sort = driver.findElement(sort);
		clickMethod(Sort);
		Thread.sleep(2000);

		WebElement Selectsort = driver.findElement(selectsort);
		clickMethod(Selectsort);
		Thread.sleep(2000);

//Filters 
		WebElement filters = driver.findElement(Filters);
		clickMethod(filters);
		Thread.sleep(2000);

		WebElement BHK = driver.findElement(bhk);
		clickMethod(BHK);
		Thread.sleep(2000);

		WebElement budget = driver.findElement(Budget);
		clickMethod(budget);
		Thread.sleep(2000);

		WebElement Furnishing = driver.findElement(furnishing);
		clickMethod(Furnishing);
		Thread.sleep(2000);

		WebElement Managed = driver.findElement(ManagedBy);
		clickMethod(Managed);
		Thread.sleep(2000);

		WebElement Immediate = driver.findElement(immediate);
		clickMethod(Immediate);
		Thread.sleep(2000);

		log.debug("click on apply filters");
		WebElement Apply = driver.findElement(apply);
		clickMethod(Apply);
		Thread.sleep(2000);

		log.debug("shows the list of pg's, rooms of selected filters");

		WebElement dlist = driver.findElement(displayedlist);
		clickMethod(dlist);
		Thread.sleep(3000);

		log.debug("after clicking on one pg/room, navigates to another window");

		String parent_win = driver.getWindowHandle(); // parent win

		// store mutliple windows in set

		Set<String> set = driver.getWindowHandles();

		// iterates through set of items (windows)

		Iterator<String> I = set.iterator();

		while (I.hasNext()) {

			String child_win = I.next();

			if (!(parent_win.equals(child_win))) {
				driver.switchTo().window(child_win);
			}

		}
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
        
		try {
			takescreenshot("Room");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.switchTo().window(parent_win);

	}

}
