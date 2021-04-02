package com.TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HalfEbay {
	WebDriver driver;
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\703196247\\AppData\\Roaming\\Microsoft\\Windows\\Network Shortcuts\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.get("https://www.ebay.com/"); 
	}
	@Test(priority=1)
	public void searchTextbox() {
	driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']")).sendKeys("java");
	}
	@Test(priority=1)
	public void searchButton() throws InterruptedException {
	driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
	Thread.sleep(2000);
	}
	@Test(priority=3)
	public void advanceSearchButton() {
	driver.findElement(By.xpath("//a[@title='Advanced Search']")).click();
	}
}
