package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import loginpage.LoginPage;
import loginpage.VesselManagement;
import loginpage.VesselMngmntCommunication;
import loginpage.VesselParticular;

public class baseclass {
	WebDriver driver;
	LoginPage login;
	
	
	@BeforeMethod
public void verifyLoginTest() {
		driver= new ChromeDriver();
		driver.get("https://woocommerce-850415-2933260.cloudwaysapps.com/my-account");
		driver.manage().window().maximize();
		login=new LoginPage(driver);
		
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
				
}
}