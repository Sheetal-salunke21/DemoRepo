package com.freecrmproj;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

public class CountingLinksGetText {

	public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver","C:\\Users\\703196247\\AppData\\Roaming\\Microsoft\\Windows\\Network Shortcuts\\chromedriver_win32\\chromedriver.exe");

		
		ChromeOptions option=new ChromeOptions();
		option.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.IGNORE);
		option.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		option.setCapability(CapabilityType.SUPPORTS_JAVASCRIPT, true);
		option.setCapability(CapabilityType.TAKES_SCREENSHOT, true);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https:\\facebook.com");
		List <WebElement> listele=driver.findElements(By.tagName("a"));
		System.out.println(listele.size());
		for(int i=0;i<listele.size();i++) {
		System.out.println(listele.get(i).getText());
		}
	}

}
