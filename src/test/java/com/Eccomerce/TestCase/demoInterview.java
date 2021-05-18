package com.Eccomerce.TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class demoInterview {
	@Test
	public void temoTest()
	{
	System.setProperty("webdriver.chrome.driver","C:\\work1\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("");
	}

}
