package com.Eccomerce.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Eccomerce.TestCase.BaseClass;

import junit.framework.Assert;

public class MobileDetailsPage extends BaseClass{
 
	public WebDriver driver;
	@FindBy(xpath="//span[@id='product-price-1']")
	private WebElement txtPrice;
	
	
	public MobileDetailsPage(WebDriver d)
	 {
		 driver=d;
		 PageFactory.initElements(d, this);
		 
	 }
	public String getPriceOnProductDetailpage()
	{
		String priceafter=txtPrice.getText();
		return priceafter;
	}
	public void ComparePrice(String x1,String x2)
	{
		if(x1.equals(x2))
		{
			logger.info("price are same on both pages..");
			Assert.assertTrue(true);
		}
		else
		{
			logger.info("price are not same on both pages..");
			Assert.assertTrue(false);
		}
	}
}
