package com.Eccomerce.TestCase;

import org.testng.annotations.Test;

import com.Eccomerce.PageObject.MagnetoHomePage;
import com.Eccomerce.PageObject.MobilePage;

public class TC_004 extends BaseClass{
	
	@Test
	public void VerifyCompareProduct() throws InterruptedException
	{
		MagnetoHomePage mhp=new MagnetoHomePage(driver);
		mhp.ClickOnMobile();
		Thread.sleep(2000);
		MobilePage mp=new MobilePage(driver);
		mp.ClickOnIphoneAddCompare();
		Thread.sleep(2000);
		mp.ClickOnXperiaAddCompare();
		Thread.sleep(3000);
//		mp.CickOnClearCompare();
//		driver.switchTo().alert().accept();
		mp.ClickOnCompare();
		logger.info("t1");
		Thread.sleep(2000);
		String mainMobile1=mp.Xperiatext();
		System.out.println(mainMobile1);
		logger.info("t2");
		Thread.sleep(2000);
		String mainMobile2=mp.Iphonetext();
		System.out.println(mainMobile2);
		logger.info("t3");
		Thread.sleep(2000);
		mp.SwitchToWindow();
		logger.info("t4");
		Thread.sleep(2000);
		String popupMobile1=mp.Xperiatextpopup();
		System.out.println(popupMobile1);
		logger.info("t5");
		Thread.sleep(2000);
		String popupMobile2=mp.Iphonetextpopup();
		System.out.println(popupMobile2);
		logger.info("t6");
		Thread.sleep(2000);
		mp.CompareMobilePresent(mainMobile1, popupMobile1);
		Thread.sleep(2000);
		mp.CompareMobilePresent(mainMobile2, popupMobile2);
		Thread.sleep(2000);
		mp.ClickOnCloseCompare();
		
		
		
	}

}
