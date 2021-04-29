package com.Eccomerce.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.Eccomerce.TestCase.BaseClass;

public class MobileShopingDetails extends BaseClass {


	public WebDriver driver;
	@FindBy(xpath="//tbody/tr[1]/td[4]/input[1]")
	private WebElement txtQntaty;
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/table[1]/tbody[1]/tr[1]/td[4]/button[1]/span[1]/span[1]")
	private WebElement txtUpdateCart;
	@FindBy(xpath="//p[contains(text(),'* The maximum quantity allowed for purchase is 500')]")
	private WebElement txtqnttyError;
	@FindBy(xpath="//span[contains(text(),'Empty Cart')]")
	private WebElement txtEmptyCart;
	@FindBy(xpath="//h1[contains(text(),'Shopping Cart is Empty')]")
	private WebElement txtemptyverify;
	
	public MobileShopingDetails(WebDriver d)
	 {
		 driver=d;
		 PageFactory.initElements(d, this); 
	 }
	
	public void Addqntatity(int x)
	{
		txtQntaty.clear();
		txtQntaty.sendKeys(String.valueOf(x));
	}
	public void ClickOnUpdate()
	{
		txtUpdateCart.click();
	}
	public void VerifyMaxQantityError()
	{
		try
		{
			if(txtqnttyError.getText().contains("* The maximum quantity allowed for purchase is 500"))
			{
				logger.info("not allow more than 500");
				Assert.assertTrue(true);
			}
			else
			{
				CaptureScreen(driver,"VerifyAddMoreProduct");
				logger.info("allow more than 500");
				Assert.assertTrue(false);
			}
			
		}
		catch(Exception e)
		{
			System.out.println("Exception message "+e.getMessage());
		}
	}
	public void ClickOnEmptycart()
	{
		txtEmptyCart.click();
	}
	public void VerifyEmptyCartMessage()
	{
		try
		{
			System.out.println(txtemptyverify.getText());
			if(txtemptyverify.getText().contains("SHOPPING CART IS EMPTY"))
			{
				logger.info("Shopping Cart is Empty--pass");
				Assert.assertTrue(true);
			}
			else
			{
				CaptureScreen(driver,"VerifyAddMoreProduct");
				logger.info("Shopping Cart is not  Empty---fail");
				Assert.assertTrue(false);
			}
			
		}
		catch(Exception e)
		{
			System.out.println("Exception message "+e.getMessage());
		}
	}
	
	
}
