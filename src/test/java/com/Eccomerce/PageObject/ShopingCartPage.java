package com.Eccomerce.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Eccomerce.TestCase.BaseClass;

public class ShopingCartPage extends BaseClass {
	
	public WebDriver driver;
	
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[1]/button[1]/span[1]/span[1]")
	private WebElement txtProccedCheckOut;
	
	public ShopingCartPage(WebDriver d)
	{
		driver=d;
		PageFactory.initElements(d, this);
	}
	public void ClickOnProccedToCheckOut()
	{
		txtProccedCheckOut.click();
	}

}
