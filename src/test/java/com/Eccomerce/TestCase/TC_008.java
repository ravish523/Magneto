package com.Eccomerce.TestCase;

import org.testng.annotations.Test;

import com.Eccomerce.PageObject.AccountMainHomePage;
import com.Eccomerce.PageObject.CheckOutPage;
import com.Eccomerce.PageObject.CreateAccountAndLoginPage;
import com.Eccomerce.PageObject.MagnetoHomePage;
import com.Eccomerce.PageObject.MyOrderPage;
import com.Eccomerce.PageObject.ShopingCartPage;

public class TC_008 extends BaseClass{
	
	@Test
	public void Reorder() throws InterruptedException
	{
		MagnetoHomePage mhp=new MagnetoHomePage(driver);
		mhp.ClickOnMyAccount();
		CreateAccountAndLoginPage caalp=new CreateAccountAndLoginPage(driver);
		caalp.LoginToApplication("kaki3@gmail.com", "kaka@321");
		Thread.sleep(2000);
		AccountMainHomePage amhp=new AccountMainHomePage(driver);
		amhp.ClickOnMyOrder();
		Thread.sleep(2000);
		MyOrderPage mop=new MyOrderPage(driver);
		mop.ClickOnReorder();
		Thread.sleep(2000);
		ShopingCartPage scp=new ShopingCartPage(driver);
		scp.UpdateQntaty(8);
		Thread.sleep(2000);
		scp.ClickOnUpdateQntaty();
		Thread.sleep(2000);
		scp.ClickOnProccedToCheckOut();
		Thread.sleep(2000);
		CheckOutPage cop=new CheckOutPage(driver);
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
		
		
		
	}

}
