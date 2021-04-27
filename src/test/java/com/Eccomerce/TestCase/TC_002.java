package com.Eccomerce.TestCase;

import org.testng.annotations.Test;

import com.Eccomerce.PageObject.MagnetoHomePage;
import com.Eccomerce.PageObject.MobileDetailsPage;
import com.Eccomerce.PageObject.MobilePage;

public class TC_002 extends BaseClass{
	
	@Test
	public void VerifyCostOfProduct() throws InterruptedException
	{
		MagnetoHomePage mhp=new MagnetoHomePage(driver);
		mhp.ClickOnMobile();
		MobilePage mp=new MobilePage(driver);
		mp.verifyMobilePageAfterClickedOnMobile();
		logger.info("price before");
		String pricebefor=mp.getPriceOnProductpage();
		System.out.println(pricebefor);
		Thread.sleep(2000);
		logger.info("click on xperia..");
		mp.ClickOnXperia();
		Thread.sleep(2000);
		MobileDetailsPage mdp=new MobileDetailsPage(driver);
		logger.info("price after");
		String priceafter=mdp.getPriceOnProductDetailpage();
		logger.info("compare price before afters");
		Thread.sleep(2000);
		mdp.ComparePrice(pricebefor, priceafter);
		
	}

}
