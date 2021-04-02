package com.freecrmproj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ApplicationAutomation {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\703196247\\AppData\\Roaming\\Microsoft\\Windows\\Network Shortcuts\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://availqa.coraaicloud.com/CVSHealth/CVSHealthLogin1.htm");
		Thread.sleep(3000);
		String title = driver.getTitle();
		driver.findElement(By.id("mailId")).sendKeys("Sheetal.Salunke@genpact.digital");
		driver.findElement(By.id("password")).sendKeys("cvs@123");
		driver.findElement(By.xpath("//*[@id=\"users\"]/div/div[6]/input")).click();
		
		System.out.println("PAge Tile is:" +title);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/a/img")).click();
		driver.findElement(By.id("btnCustomSearch")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("wqId")).sendKeys("15172");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"cvsExtractCustomSearch\"]/div/div/div[3]/button[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"workqueueTable\"]/tbody/tr/td[1]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"cvsCfcrdTempId\"]/a")).click();
		Thread.sleep(2000);
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.className("CaptionCont SelectBox"))).build().perform();
		Select drpval=new Select(driver.findElement(By.className("CaptionCont SelectBox")));
		drpval.deselectByVisibleText(" 22 Selected");
	}

}
