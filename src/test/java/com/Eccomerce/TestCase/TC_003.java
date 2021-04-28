package com.Eccomerce.TestCase;

import org.testng.annotations.Test;

import com.Eccomerce.PageObject.MagnetoHomePage;
import com.Eccomerce.PageObject.MobilePage;
import com.Eccomerce.PageObject.MobileShopingDetails;

public class TC_003 extends BaseClass{
	
	@Test
	public void VerifyAddMoreProduct()
	{
		MagnetoHomePage mhp=new MagnetoHomePage(driver);
		mhp.ClickOnMobile();
		MobilePage mp=new MobilePage(driver);
		mp.ClickOnXperiaAddToCart();
		MobileShopingDetails msd=new MobileShopingDetails(driver);
		msd.Addqntatity(1000);
		msd.ClickOnUpdate();
		msd.VerifyMaxQantityError();
		msd.ClickOnEmptycart();
		msd.VerifyEmptyCartMessage();
		
		
	}

}
