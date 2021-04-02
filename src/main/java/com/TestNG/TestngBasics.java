package com.TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngBasics {
	//Preconditions -- starting with @Before
	@BeforeSuite
	public void setUp() {
		System.out.println("Set up System Properties for Chrome");
	}

	@BeforeTest
	public void launchBrowser() {
		System.out.println("Launch Browser");
	}
	
	@BeforeClass
	public void login() {
		System.out.println("Login in the App");
	}

	@BeforeMethod
	public void enterURL() {
		System.out.println("Enter URL");
	}

	//Test Case--starting with @Test
	@Test
	public void googleTitleTest() {
		System.out.println("Google Title Test");
	}
	@Test
	public void searchTest() {
		System.out.println("Search Test");
	}
	
	@Test
	public void googleLogoTest() {
		System.out.println("Google Logo Test");
	}
	//post condition--starting with @After
	
	@AfterMethod
	public void logOut() {
		System.out.println("Login and Logout from Application");
	}
	@AfterClass
	public void closeBrowser() {
		System.out.println("Close Browser");
	}
	@AfterTest
	public void deleteAllCookies() {
		System.out.println("Deletec All Cookies");
	}
	//@AfterSuite
	//public void generateTestReport() {
		//System.out.println("Genrate Test Report");
	//}
}
