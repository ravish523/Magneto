package com.Eccomerce.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.Eccomerce.TestCase.BaseClass;

import junit.framework.Assert;

public class CheckOutPage extends BaseClass{
	
	public WebDriver driver;
	@FindBy(xpath="//input[@id='billing:firstname']")
	private WebElement txtFname;
	@FindBy(xpath="//input[@id='billing:middlename']")
	private WebElement txtmname;
	@FindBy(xpath="//input[@id='billing:lastname']")
	private WebElement txtLname;
	@FindBy(xpath="//input[@id='billing:company']")
	private WebElement txtcname;
	@FindBy(xpath="//input[@id='billing:street1']")
	private WebElement txtAdd1;
	@FindBy(xpath="//input[@id='billing:street2']")
	private WebElement txtAdd2;
	@FindBy(xpath="//input[@id='billing:city']")
	private WebElement txtcity;
	@FindBy(xpath="//input[@id='billing:region']")
	private WebElement txtstate;
	@FindBy(xpath="//input[@id='billing:postcode']")
	private WebElement txtzipcode;
	@FindBy(xpath="//select[@id='billing:country_id']")
	private WebElement txtcountry;
	@FindBy(xpath="//input[@id='billing:telephone']")
	private WebElement txtTelephone;
	@FindBy(xpath="//input[@id='billing:use_for_shipping_yes']")
	private WebElement RadioButton;
	@FindBy(xpath="//body/div[1]/div[1]/div[2]/div[1]/div[1]/ol[1]/li[1]/div[2]/form[1]/div[1]/div[1]/button[1]")
	private WebElement txtContinue;
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/ol[1]/li[3]/div[2]/form[1]/div[3]/button[1]/span[1]/span[1]")
	private WebElement txtShipingmethodContinue;
	@FindBy(xpath="//input[@id='p_method_checkmo']")
	private WebElement txtmoneyOrderbutton;
	@FindBy(xpath="//body/div[1]/div[1]/div[2]/div[1]/div[1]/ol[1]/li[4]/div[2]/div[2]/button[1]")
	private WebElement txtPaymentInformationContunue;
	@FindBy(xpath="//button[@title='Place Order']")
	private WebElement txtPlaceOrder;
	@FindBy(xpath="//h1[contains(text(),'Your order has been received.')]")
	private WebElement txtcnfOrderMessage;
	@FindBy(xpath="//body/div[1]/div[1]/div[2]/div[1]/div[1]//p[1]/a")
	private WebElement txtOrderid;
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/ol[1]/li[1]/div[2]/form[1]/div[1]/div[1]/button[1]/span[1]/span[1]")
	private WebElement txtBinformationContunue;
	
	public CheckOutPage(WebDriver d)
	{
		driver=d;
		PageFactory.initElements(d, this);
		
	}
	public void ClickOnBillingInformationcontinue()
	{
		txtBinformationContunue.click();
	}
	
	public void EnterShippingAddress(String fname,String mname,String lnmae,String company,String Add1,String Add2,String city,String state,int zipcode,String country,String telephone)
	{
		txtFname.sendKeys(fname);
		txtmname.sendKeys(mname);
		txtLname.sendKeys(lnmae);
		txtcname.sendKeys(company);
		txtAdd1.sendKeys(Add1);
		txtAdd2.sendKeys(Add2);
		txtcity.sendKeys(city);
		txtstate.sendKeys(state);
		txtzipcode.sendKeys(String.valueOf(zipcode));
		Select t=new Select(txtcountry);
		t.selectByVisibleText(country);
		txtTelephone.sendKeys(telephone);
		RadioButton.click();
		txtContinue.click();
	}
	public void clickOnShipingMethodContune()
	{
		txtShipingmethodContinue.click();
	}
	public void ClickOnMoneyOrderRadioBitton()
	{
		txtmoneyOrderbutton.click();
	}
	public void ClickOnPaymentInformationContunue()
	{
		txtPaymentInformationContunue.click();
	}
	public void ClickOnPlaceOrder()
	{
		txtPlaceOrder.click();
	}
	public void verifyOrderPlaced()
	{
		try
		{
			if(txtcnfOrderMessage.getText().contains("YOUR ORDER HAS BEEN RECEIVED."))
			{
				logger.info("Thank you for your purchase! Order id :"+txtOrderid.getText());
				Assert.assertTrue(true);
			}
			else
			{
				logger.info("order is not purchase purchase!--fail ");
				CaptureScreen(driver,"VerifyUserIsAbleToPurchase");
				Assert.assertTrue(false);
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception Message is :"+e.getMessage());
		}
	}
	
	
	
	
	
	
	
	

}
