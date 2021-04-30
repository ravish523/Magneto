package com.Eccomerce.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TVHomePage {
	
	public WebDriver driver;
	
	@FindBy(xpath="//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[1]/div[1]/div[3]/ul[1]/li[1]/a[1]")
	private WebElement txtAddWishlistLGlcd;
	
	 public TVHomePage(WebDriver d)
	 {
		 driver=d;
		 PageFactory.initElements(d, this);
	 }
	 
	 public void ClickOnLG_LCD_WishList()
	 {
		 txtAddWishlistLGlcd.click();
	 }

}
