package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class baseclassfive {
	WebDriver driver;
	
	
	
	@BeforeMethod
public void verifyLoginTest() {
		driver= new ChromeDriver();
		driver.get("https://woocommerce-850415-2933260.cloudwaysapps.com/shop");
		driver.manage().window().maximize();
		
		
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
				
}
}