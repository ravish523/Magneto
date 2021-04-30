package com.Eccomerce.PageObject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.Eccomerce.TestCase.BaseClass;

public class MagnetoHomePage extends BaseClass{

	public WebDriver driver;
	 
	 @FindBy(xpath="//a[contains(text(),'Mobile')]")
	  private WebElement txtMobile;
	 @FindBy(xpath="//body[1]/div[1]/div[1]/div[3]/div[1]/div[4]/ul[1]/li[1]/a[1]")
	  private WebElement txtMyAccount;
	 
	 
	 
	 public MagnetoHomePage(WebDriver d)
	 {
		 driver=d;
		 PageFactory.initElements(d, this);
		 
	 }
	 public void ClickOnMobile()
	 {
		 txtMobile.click();
	 }
	 public void ClickOnMyAccount()
	 {
		 txtMyAccount.click();
	 }
	 
}

