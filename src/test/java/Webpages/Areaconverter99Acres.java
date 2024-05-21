package Webpages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Areaconverter99Acres extends Baseclass3 {

	WebDriver driver;

	public Areaconverter99Acres(WebDriver driver) {
		this.driver = driver;
	}
	By profile = By.xpath("(//div[@data-label=\"USER_PROFILE_DROPDOWN\"])[1]/i");
	By login = By.xpath("//div[@class=\"theader__popupCity theader__login false\"]/div[1]");
	By continuewith = By.xpath("//div[@class='phoneLogin__continueWithAnother']");
	By email = By.xpath("//input[@inputtype='email/userName']");
//	By continu = By.xpath("//div[@data-label='CONTINUE']/button");
	By continu = By.xpath("//div[@id=\"app\"]/div/div[8]/div[2]/div[1]/div/div[7]/button");
	
	
//menu
	By menu = By.xpath("(//i[@class='iconS_Common_24 icon_menuIcon hmenu__explicitSpriteSize'])[2]");
	By insights = By.xpath("(//div[@class='hmenu__labelWrap'])[5]");
	By ACtool = By.xpath("(//a[@href=\"/area-converter-utyp\"])[1]");
	By state = By.xpath("//input[@class='pageComponent']");
	By andhra = By.xpath("//div[@class=\"selectBox__selectList selectBox__show undefined \"]/div[1]/span[text()='  Andhra Pradesh']");
	By selectunit1 = By.xpath("(//div[@class=\"comp__dropdownDisplay \"])[1]/span[text()='select unit']");
	By squareyard = By.xpath("//div[@class=\"comp__dropdownList\"]/div[20]/span[text()='square yard']");
//	By selectunit2 = By.xpath("")
	
	
	

	public void Login() throws InterruptedException {
	
		log.debug("Click on Profile");
		WebElement Profile = driver.findElement(profile);
		clickMethod(Profile);
		Thread.sleep(3000);
		
		
		log.debug("Click on login");
		WebElement Login = driver.findElement(login);
		clickMethod(Login);
		Thread.sleep(2000);
		
		log.debug("continue with Email/Username");
		WebElement Continuewith = driver.findElement(continuewith);
		clickMethod(Continuewith);
		Thread.sleep(2000);
		
		log.debug("Enter Email");
		WebElement Email = driver.findElement(email);
		sendkeysint(Email,"gollaakhila659@gmail.com");
	//	sendkeysint(Email, Username);
		Thread.sleep(2000);
		
		log.debug("click on continue");
		WebElement Continue = driver.findElement(continu);
		clickMethod(Continue);
		Thread.sleep(2000);
		
		
	}
	
	public void Menu() throws InterruptedException {
		
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		
		log.debug("Click on Menu");
		WebElement Menu = driver.findElement(menu);
		clickMethod(Menu);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		log.debug("click on Insights");
		WebElement Insight = driver.findElement(insights);
		clickMethod(Insight);
		Thread.sleep(3000);
		
		log.debug("click on Area Converter Tool");
		WebElement Actool =driver.findElement(ACtool);
		clickMethod(Actool);
		Thread.sleep(7000);
		
		Set<String> parent_w = driver.getWindowHandles();
		
		List<String> child = new ArrayList<>(parent_w);
		
		driver.switchTo().window(child.get(1));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		System.out.println(driver.getTitle());
		
		log.debug("select state");
		WebElement State =driver.findElement(state);
		clickMethod(State);
		
		WebElement AP =driver.findElement(andhra);
		clickMethod(AP);

	
		WebElement selunit =driver.findElement(selectunit1);
		clickMethod(AP);
		
		WebElement unit =driver.findElement(squareyard);
		clickMethod(AP);
	}
		

		
}
