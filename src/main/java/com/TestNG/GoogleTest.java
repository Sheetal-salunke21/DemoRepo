package com.TestNG;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {

	WebDriver driver;
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\703196247\\AppData\\Roaming\\Microsoft\\Windows\\Network Shortcuts\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.IGNORE);
		option.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		option.setCapability(CapabilityType.SUPPORTS_JAVASCRIPT, true);
		option.setCapability(CapabilityType.TAKES_SCREENSHOT, true);
		driver=new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"C:\\Users\\703196247\\Downloads\\Firefox Installer.exe");
		//WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.get("https://www.google.com/"); 
		}
		@Test(priority=-1,groups="Title")
		public void googleTitleTest() {
			String title=driver.getTitle();
			System.out.println(title);
			assertEquals(title,"Google");
		}
		@Test(priority=2, groups="Link")
		public void imageLinkTest() {
			
			Boolean image=driver.findElement(By.linkText("Images")).isDisplayed();
			System.out.println(image);
		}
		@Test(priority=2,groups="Link")
		public void mailLinkTest() {
			Boolean mail=driver.findElement(By.xpath("//a[@class='gb_g' and @data-pid='23']")).isDisplayed(); 
			System.out.println(mail);
		}
		@Test(priority=4,groups="Link")
		public void GsigninLinkTest() {
			Boolean GL=driver.findElement(By.xpath("//a[@class='gb_4 gb_5 gb_ae gb_4c']")).isDisplayed();
			System.out.println(GL);
		}
		@AfterMethod
		public void tierdown() {
			driver.quit();
		}
	
}
