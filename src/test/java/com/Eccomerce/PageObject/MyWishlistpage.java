package com.Eccomerce.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyWishlistpage {
	
public WebDriver driver;
	
	@FindBy(xpath="//span[contains(text(),'Share Wishlist')]")
	private WebElement txtshareWishlist;
	@FindBy(xpath="//textarea[@id='email_address']")
	private WebElement txtemailshare;
	@FindBy(xpath="//textarea[@id='message']")
	private WebElement txtmessageshare;
	@FindBy(xpath="//span[contains(text(),'Share Wishlist')]")
	private WebElement txtshartoemail;
	
	 public MyWishlistpage(WebDriver d)
	 {
		 driver=d;
		 PageFactory.initElements(d, this);
	 }
	 public void ClickOnShareWishList()
	 {
		 txtshareWishlist.click();
	 }
	 public void EnterDetailsToShare(String email,String message)
	 {
		 txtemailshare.sendKeys(email);
		 txtmessageshare.sendKeys(message);
		 
	 }
	 public void ClickOnShareButton()
	 {
		 txtshartoemail.click();
	 }

}
