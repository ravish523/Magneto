package com.Eccomerce.TestCase;

import java.io.IOException;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

import com.Eccomerce.PageObject.AccountMainHomePage;
import com.Eccomerce.PageObject.CreateAccountAndLoginPage;
import com.Eccomerce.PageObject.CreatingAccountFormPage;
import com.Eccomerce.PageObject.MagnetoHomePage;
import com.Eccomerce.PageObject.MyWishlistpage;
import com.Eccomerce.PageObject.TVHomePage;

public class TC_005 extends BaseClass{
	
	@Test
	public void VerifyCreateAccountWishlist() throws InterruptedException, IOException
	{
		String add=RandomStringUtils.randomAlphabetic(5);
		MagnetoHomePage mhp=new MagnetoHomePage(driver);
		mhp.ClickOnMyAccount();
		CreateAccountAndLoginPage calp=new CreateAccountAndLoginPage(driver);
		calp.ClickOnCreateAccount();
		Thread.sleep(2000);
		CreatingAccountFormPage cafp=new CreatingAccountFormPage(driver);
		cafp.EnterDetailsInCreatingAccountForm(add, "kumar", "ranjdan", add+"@23gmail.com", "kumar@1234", "kumar@1234");
	    cafp.ClickOnRegister();
	    Thread.sleep(2000);
	    AccountMainHomePage amhp=new AccountMainHomePage(driver);
	    amhp.verifyAccountCreated();
	    amhp.ClickOnTv();
	    Thread.sleep(2000);
	    TVHomePage tvhp=new TVHomePage(driver);
	    tvhp.ClickOnLG_LCD_WishList();
	    Thread.sleep(2000);
	    MyWishlistpage mwlp=new MyWishlistpage(driver);
	    mwlp.ClickOnShareWishList();
	    mwlp.EnterDetailsToShare("ravishkr54@gmail.com", "demo");
	    mwlp.ClickOnShareButton();
	    mwlp.verifycnfirmationShareWishList();
	    
	    
	    
	    
	}

}
