package com.Eccomerce.TestCase;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.Eccomerce.PageObject.AccountMainHomePage;
import com.Eccomerce.PageObject.CreateAccountAndLoginPage;
import com.Eccomerce.PageObject.MagnetoHomePage;
import com.Eccomerce.PageObject.MyOrderPage;

public class TC_007 extends BaseClass{
	
	@Test
	public void SavePreviousOrderInPdf() throws InterruptedException, AWTException
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
		mop.ClickOnViewOrder();
		Thread.sleep(2000);
		mop.ClickOnPrintOrder();
		Thread.sleep(2000);
		//mop.SaveOrderDetails();
		Thread.sleep(2000);
		
	}

}
