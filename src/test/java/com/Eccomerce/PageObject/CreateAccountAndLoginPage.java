package com.Eccomerce.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Eccomerce.TestCase.BaseClass;

public class CreateAccountAndLoginPage extends BaseClass {
	
	public WebDriver driver;
	 
	 @FindBy(xpath="//span[contains(text(),'Create an Account')]")
	  private WebElement txtCreateAccount;
	 @FindBy(xpath="//input[@id='email']")
	 private WebElement txtEmail;
	 @FindBy(xpath="//input[@id='pass']")
	 private WebElement txtpass;
	 @FindBy(xpath="//span[contains(text(),'Login')]")
	 private WebElement txtlogin;
	 
	 public CreateAccountAndLoginPage(WebDriver d)
	 {
		 driver=d;
		 PageFactory.initElements(d, this);
	 }
	 public void ClickOnCreateAccount()
	 {
		 txtCreateAccount.click();
	 }
	 public void LoginToApplication(String email,String pass)
	 {
		 txtEmail.sendKeys(email);
		 txtpass.sendKeys(pass);
		 txtlogin.click(); 
	 }
		 
	 

}
