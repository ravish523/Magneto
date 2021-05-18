package com.Eccomerce.TestCase;

import org.testng.annotations.Test;

import com.Eccomerce.PageObject.MagnetoHomePage;
import com.Eccomerce.PageObject.MobilePage;
import com.Eccomerce.PageObject.ShopingCartPage;

public class TC_009 extends BaseClass{
	
	@Test
	public void VerifyCoupon() throws InterruptedException
	{
		MagnetoHomePage mhp=new MagnetoHomePage(driver);
		mhp.ClickOnMobile();
		MobilePage mp=new MobilePage(driver);
		mp.ClickOnAddToCartIphone();
		ShopingCartPage scp=new ShopingCartPage(driver);
		Thread.sleep(2000);
		double amnt=scp.AmountVerification();
		Thread.sleep(2000);
		System.out.println(amnt);
		scp.EnterCouponCode("GURU50");
		Thread.sleep(2000);
		scp.ClickOnApplyCoupon();
		Thread.sleep(2000);
		scp.CompareAmoutAfterCoupon(amnt);
		Thread.sleep(2000);
		
	}

}
