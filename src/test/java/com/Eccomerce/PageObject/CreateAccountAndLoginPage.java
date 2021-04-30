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
	 
	 
	 
	 
	 public CreateAccountAndLoginPage(WebDriver d)
	 {
		 driver=d;
		 PageFactory.initElements(d, this);
	 }
	 public void ClickOnCreateAccount()
	 {
		 txtCreateAccount.click();
	 }
		 
	 

}
