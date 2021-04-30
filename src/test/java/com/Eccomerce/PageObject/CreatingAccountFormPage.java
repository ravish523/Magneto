package com.Eccomerce.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Eccomerce.TestCase.BaseClass;

public class CreatingAccountFormPage extends BaseClass {
	public WebDriver driver;
	 
	 @FindBy(xpath="//input[@id='firstname']")
	  private WebElement txtFirstName;
	 @FindBy(xpath="//input[@id='middlename']")
	  private WebElement txtMiddleName;
	 @FindBy(xpath="//input[@id='lastname']")
	  private WebElement txtLastName;
	 @FindBy(xpath="//input[@id='email_address']")
	  private WebElement txtEmail;
	 @FindBy(xpath="//input[@id='password']")
	  private WebElement txtPassword;
	 @FindBy(xpath="//input[@id='confirmation']")
	  private WebElement txtcnfPassword;
	 @FindBy(xpath="//body/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/button[1]")
	  private WebElement txtRegister;
	 
	 
	 
	 public CreatingAccountFormPage(WebDriver d)
	 {
		 driver=d;
		 PageFactory.initElements(d, this);
	 }
	 public void EnterFirstName(String fname)
	 {
		 txtFirstName.sendKeys(fname);
	 }
	 public void EnterMiddleName(String mname)
	 {
		 txtMiddleName.sendKeys(mname);
	 }
	 public void EnterLastName(String lname)
	 {
		 txtLastName.sendKeys(lname);
	 }
	 public void EnterEmail(String email)
	 {
		 txtEmail.sendKeys(email);
	 }
	 public void EnterPassword(String pass)
	 {
		 txtPassword.sendKeys(pass);
	 }
	 public void EnterCnfPassword(String cnfpass)
	 {
		 txtcnfPassword.sendKeys(cnfpass);
	 }
	
	 public void EnterDetailsInCreatingAccountForm(String fname,String mname,String lname,String email,String pass,String cnfpass)
	 {
		 txtFirstName.sendKeys(fname);
		 txtMiddleName.sendKeys(mname);
		 txtLastName.sendKeys(lname);
		 txtEmail.sendKeys(email);
		 txtPassword.sendKeys(pass);
		 txtcnfPassword.sendKeys(cnfpass);
		 
	 }
	 public void ClickOnRegister()
	 {
		 txtRegister.click();
		
	 }
}
