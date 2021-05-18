package com.Eccomerce.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.Eccomerce.TestCase.BaseClass;

public class ShopingCartPage extends BaseClass {
	
	public WebDriver driver;
	
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[1]/button[1]/span[1]/span[1]")
	private WebElement txtProccedCheckOut;
	@FindBy(xpath="//tbody/tr[1]/td[4]/input[1]")
	private WebElement txtcartqnty;
	@FindBy(xpath="//tbody/tr[1]/td[4]/button[1]/span[1]")
	private WebElement txtUpdate;
	@FindBy(xpath="//input[@id='coupon_code']")
	private WebElement txtcouponCode;
	
	@FindBy(xpath="//span[contains(text(),'Apply')]")
	private WebElement txtapplyCoupon;
	@FindBy(xpath="//tbody/tr[1]/td[2]/span[1]")
	private WebElement txtAmmountBeforeCoupon;
	@FindBy(xpath="//span[contains(text(),'-$25.00')]")
	private WebElement txtdiscntamnt;
	
	public ShopingCartPage(WebDriver d)
	{
		driver=d;
		PageFactory.initElements(d, this);
	}
	public void ClickOnProccedToCheckOut()
	{
		txtProccedCheckOut.click();
	}
	public void UpdateQntaty(int num)
	{
		txtcartqnty.clear();
		txtcartqnty.sendKeys(String.valueOf(num));
	}
	public void ClickOnUpdateQntaty()
	{
		try{
		txtUpdate.click();
		}
		catch(Exception e)
		{
			System.out.println("message"+e.getMessage());
		}
	}
	public void EnterCouponCode(String cupon)
	{
		txtcouponCode.sendKeys(cupon);
	}
	public void ClickOnApplyCoupon()
	{
		txtapplyCoupon.click();
	}
	public double AmountVerification() throws InterruptedException
	{
		String bamnt=txtAmmountBeforeCoupon.getText();
		String sSubTot = bamnt.replaceAll("\\$", " "); 
		double afterc=Double.parseDouble(sSubTot);
		double dicu=(afterc*0.05);
		return dicu;
	}
	public void CompareAmoutAfterCoupon(double x) throws InterruptedException
	{
		String damnt=txtdiscntamnt.getText();
		System.out.println(damnt);
		String sdSubTot = damnt.replaceAll("\\$"," "); 
		System.out.println(sdSubTot);
		String sdoSubTot = damnt.replaceAll("\\-"," "); 
		System.out.println(sdoSubTot);
		double afterc=Double.parseDouble(sdoSubTot);
		System.out.println(afterc);
		if(x==afterc)
		{
			System.out.println("test case pass..");
			Assert.assertTrue(true);
		}
		else
		{
			System.out.println("test case failed..");
			Assert.assertTrue(false);
		}
	}

}
