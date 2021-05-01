package com.Eccomerce.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Eccomerce.TestCase.BaseClass;

import junit.framework.Assert;

public class MyWishlistpage extends BaseClass{
	
public WebDriver driver;
	
	@FindBy(xpath="//span[contains(text(),'Share Wishlist')]")
	private WebElement txtshareWishlist;
	@FindBy(xpath="//textarea[@id='email_address']")
	private WebElement txtemailshare;
	@FindBy(xpath="//textarea[@id='message']")
	private WebElement txtmessageshare;
	@FindBy(xpath="//span[contains(text(),'Share Wishlist')]")
	private WebElement txtshartoemail;
	@FindBy(xpath="//span[contains(text(),'Your Wishlist has been shared.')]")
	private WebElement txtshareWishListcnf;
	@FindBy(xpath="//span[contains(text(),'Add to Cart')]")
	private WebElement txtAddToCart;
	
	
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
	 public void verifycnfirmationShareWishList()
	 {
		 try
		 {
			 if(txtshareWishListcnf.getText().contains("Your Wishlist has been shared."))
			 {
				 logger.info("Wishlist has been shared sucessfully....Pass");
				 Assert.assertTrue(true);
			 }
			 else
			 {
				 logger.info("Wishlist has not been shared sucessfully....Pass");
				 CaptureScreen(driver,"VerifyCreateAccountWishlist");
				 Assert.assertTrue(false);
			 }
			 
		 }
		 catch(Exception e)
		 {
			 System.out.println("Exception message :"+e.getMessage());
		 }
	 }
	 public void ClickOnAddToCart()
	 {
		 txtAddToCart.click();
	 }

}
