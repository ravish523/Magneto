package com.Eccomerce.PageObject;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.Eccomerce.TestCase.BaseClass;

public class AccountMainHomePage extends BaseClass {

	public WebDriver driver;
	 
	 @FindBy(xpath="//span[contains(text(),'Thank you for registering with Main Website Store.')]")
	  private WebElement txtAccountcnf;
	 @FindBy(xpath="//a[contains(text(),'TV')]")
	 private WebElement txtTV;
	 @FindBy(xpath="//body/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[8]/a[1]")
	 private WebElement txtMyWishList;
	 
	 
	 
	 
	 
	 public AccountMainHomePage(WebDriver d)
	 {
		 driver=d;
		 PageFactory.initElements(d, this);
		 
	 }
	 public void verifyAccountCreated() throws IOException
	 {
		 try
		 {
		 if(txtAccountcnf.getText().contains("Thank you for registering with Main Website Store."))
		 {
			 logger.info("account created sucessfully...pass");
			 Assert.assertTrue(true);
		 }
		 else
		 {
			 logger.info("account not created sucessfully...fail");
			 CaptureScreen(driver,"VerifyCreateAccountWishlist");
			 Assert.assertTrue(false);
		 }
		 }
		 catch(Exception e)
		 {
			 System.out.println("exception message :"+e.getMessage());
		 }
	 }
	 public void ClickOnTv()
	 {
		 txtTV.click();
	 }
	 public void ClickOnMyWishList()
	 {
		 txtMyWishList.click();
	 }
	 
	 
}
