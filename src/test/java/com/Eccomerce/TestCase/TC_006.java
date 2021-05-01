package com.Eccomerce.TestCase;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

import com.Eccomerce.PageObject.AccountMainHomePage;
import com.Eccomerce.PageObject.CheckOutPage;
import com.Eccomerce.PageObject.CreateAccountAndLoginPage;
import com.Eccomerce.PageObject.MagnetoHomePage;
import com.Eccomerce.PageObject.MyWishlistpage;
import com.Eccomerce.PageObject.ShopingCartPage;

public class TC_006 extends BaseClass{
	
	@Test
	public void VerifyUserIsAbleToPurchase() throws InterruptedException
	{
		String add=RandomStringUtils.randomAlphabetic(5);
		MagnetoHomePage mhp=new MagnetoHomePage(driver);
		mhp.ClickOnMyAccount();
		CreateAccountAndLoginPage caalp=new CreateAccountAndLoginPage(driver);
		caalp.LoginToApplication("kaki3@gmail.com", "kaka@321");
		Thread.sleep(2000);
		AccountMainHomePage amhp=new AccountMainHomePage(driver);
		amhp.ClickOnMyWishList();
		Thread.sleep(2000);
		MyWishlistpage mwlp=new MyWishlistpage(driver);
		Thread.sleep(2000);
		mwlp.ClickOnAddToCart();
		Thread.sleep(2000);
		ShopingCartPage scp=new ShopingCartPage(driver);
		scp.ClickOnProccedToCheckOut();
		Thread.sleep(2000);
		CheckOutPage  cop=new CheckOutPage(driver);
	    //cop.EnterShippingAddress(add, add, add, add, add, add, add, add, 824113, "India","9430822576");
		cop.ClickOnBillingInformationcontinue();
		Thread.sleep(2000);
		cop.clickOnShipingMethodContune();
		Thread.sleep(2000);
		cop.ClickOnMoneyOrderRadioBitton();
		Thread.sleep(2000);
		cop.ClickOnPaymentInformationContunue();
		Thread.sleep(2000);
		cop.ClickOnPlaceOrder();		
		Thread.sleep(2000);
		cop.verifyOrderPlaced();
		Thread.sleep(2000);
				
		
	}
	

}
