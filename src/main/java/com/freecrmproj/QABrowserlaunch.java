package com.freecrmproj;

import org.openqa.selenium.By;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

public class QABrowserlaunch {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\703196247\\AppData\\Roaming\\Microsoft\\Windows\\Network Shortcuts\\chromedriver_win32\\chromedriver.exe");

		
		ChromeOptions option=new ChromeOptions();
		option.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.IGNORE);
		option.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		option.setCapability(CapabilityType.SUPPORTS_JAVASCRIPT, true);
		option.setCapability(CapabilityType.TAKES_SCREENSHOT, true);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https:\\rediffmail.com");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"details-button\"]")).click();
		//driver.getTitle();
		Thread.sleep(2000);
		driver.findElement(By.id("proceed-link")).click();
		//Thread.sleep(3000);
		driver.switchTo().frame("moneyiframe");
		Thread.sleep(1000);
		//driver.switchTo().frame(driver.findElement(By.className(("//a[contains(text(),'query')]"))).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"get_quote\"]/input[2]")).click();
		//driver.quit();
	
	}

}
