package com.Eccomerce.TestCase;

import org.testng.annotations.Test;

import com.Eccomerce.PageObject.MagnetoHomePage;
import com.Eccomerce.PageObject.MobilePage;

public class MobileListSortedByName extends BaseClass {
	
	@Test
	public void MobileSortedByName() throws InterruptedException
	{
		MagnetoHomePage mhp=new MagnetoHomePage(driver);
		mhp.ClickOnMobile();
		MobilePage mp=new MobilePage(driver);
		mp.verifyMobilePageAfterClickedOnMobile();
		mp.SortByName("Name");
		Thread.sleep(2000);
		mp.getProductName();
		mp.CheckProdectSortedByName();
	}

	
}
