package com.Eccomerce.PageObject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.Eccomerce.TestCase.BaseClass;

public class MobilePage extends BaseClass{

	
	public WebDriver driver;
	@FindBy(xpath="//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/select[1]")
	 private WebElement txtMobileSort;
	 @FindBy(xpath="//*[@class='product-name']")
	 private List<WebElement> ProductName;
	 @FindBy(xpath="//span[@id='product-price-1']")
		private WebElement txtPrice;
	 @FindBy(xpath="//img[@id='product-collection-image-1']")
	 private WebElement txtsoni;
	 @FindBy(xpath="//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/ul[1]/li[1]/div[1]/div[3]/button[1]/span[1]/span[1]")
	 private WebElement xperiaAddtoCart;
	 @FindBy(xpath="//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/ul[1]/li[1]/div[1]/div[3]/ul[1]/li[2]/a[1]")
	 private WebElement txtAddCompareXperia;
	 
	 @FindBy(xpath="//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/ul[1]/li[2]/div[1]/div[3]/ul[1]/li[2]/a[1]")
	 private WebElement txtAddCompareIphone;
	 
	 @FindBy(xpath="//button[@title='Compare']")
	 private WebElement txtCompare;
	 @FindBy(xpath="//a[contains(text(),'Clear All')]")
	 private WebElement txtClearCompare;
	 @FindBy(xpath="//a[@title='Sony Xperia']")
	 private WebElement txtXperia;
	 @FindBy(xpath="//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/ul[1]/li[2]/div[1]/h2[1]/a[1]")
	 private WebElement txtIPhone;
	 @FindBy(xpath="//a[contains(text(),'Sony Xperia')]")
	 private WebElement txtpopupxperia;
	 @FindBy(xpath="//a[contains(text(),'IPhone')]")
	 private WebElement txtpopupIphone;
	 @FindBy(xpath="//span[contains(text(),'Close Window')]")
	 private WebElement txtClosePopup;
	
	
	 
	 public MobilePage(WebDriver d)
	 {
		 driver=d;
		 PageFactory.initElements(d, this);
		 
	 }
	 public void verifyMobilePageAfterClickedOnMobile()
	 {
		 try
		 {
			 if(driver.getTitle().contains("Mobile"))
			 {
				 logger.info("mobile page opned sucessfully..");
				 Assert.assertTrue(true);
			 }
			 else
			 {
				 logger.info("mobile page is not opned sucessfully..");
				 CaptureScreen(driver,"MobileSortedByName") ;
				 Assert.assertTrue(false);
			 }
		 }
		 catch(Exception e)
		 {
			 System.out.println("Exception message :"+e.getMessage());
		 }
	 }
	 public void SortByName(String name)
	 {
		 Select t=new Select(txtMobileSort);
		 t.selectByVisibleText(name);
	 }
	 public void getProductName()
	 {
		 ArrayList<String> originalList=new ArrayList<String>();
		 for(WebElement ele:ProductName)
		 {
			 originalList.add(ele.getText());
		 }
		 System.out.println(originalList);
	 }
	 public void CheckProdectSortedByName()
	 {
		 try
		 {
		 ArrayList<String> originalList=new ArrayList<String>();
		 ArrayList<String> tempList=new ArrayList<String>();
		 for(WebElement ele:ProductName)
		 {
			 originalList.add(ele.getText());
			 tempList.add(ele.getText());
		 }
		 Collections.sort(tempList);
		 System.out.println(originalList);
		 System.out.println("after sorting.."+tempList);
		 if(originalList.equals(tempList))
		 {
			 logger.info("products are in sorted order by name..");
			 Assert.assertTrue(true);
		 }
		 else
		 {
			 logger.info("products are not in sorted order by name..");
			 Assert.assertTrue(false);
			 
		 }
		 }
		 catch(Exception e)
		 {
			 System.out.println("Exception message :"+e.getMessage());
		 }
	 }
	 public String getPriceOnProductpage()
		{
		 
		 logger.info("calculating price before...");
			String pricebefore=txtPrice.getText();
			return pricebefore;
//		 }
//		 catch(Exception e)
//		 {
//			 System.out.println("exception message"+e.getMessage());
//		 }
		 
		}
	 public void ClickOnXperia()
	 {
		 txtsoni.click();
	 }
	 public void ClickOnXperiaAddToCart()
	 {
		 xperiaAddtoCart.click();
	 }
	 public void ClickOnXperiaAddCompare()
	 {
		 txtAddCompareXperia.click(); 
	 }
	 public void ClickOnIphoneAddCompare()
	 {
		 txtAddCompareIphone.click();
	 }
	 public void ClickOnCompare()
	 {
		 txtCompare.click();
	 }
	 public void CickOnClearCompare()
	 {
		 txtClearCompare.click();
	 }
	 public String Xperiatext()
	 {
		 String mainmobile1=txtXperia.getText();
		 return mainmobile1;
	 }
	 public String Iphonetext()
	 {
		 String mainmobile2=txtIPhone.getText();
		 return mainmobile2;
	 }
	 public String Xperiatextpopup()
	 {
		 String popupmobile1=txtpopupxperia.getText();
		 return popupmobile1;
	 }
	 public String Iphonetextpopup()
	 {
		 String popupmobile2=txtpopupIphone.getText();
		 return popupmobile2;
	 }
	 public void SwitchToWindow()
	 {
		 String id=driver.getWindowHandle();
		 System.out.println(driver.switchTo().window(id).getTitle());
		 driver.switchTo().window(id);
		 
		 
//		 Set<String> ids=driver.getWindowHandles();
//		 for(String id:ids)
//		 {
//			 System.out.println(id);
//			 System.out.println(driver.switchTo().window(id).getTitle());
//			 driver.switchTo().window(id);
//		 }
	 }
	 public void CompareMobilePresent(String s1,String s2)
	 {
		 try{
			 if(s1.equals(s2)==true)
			 {
				 logger.info("both mobile are present in compare popup...pass");
				 Assert.assertTrue(true);
			 }
			 else
			 {
				 CaptureScreen(driver,"VerifyCompareProduct");
				 logger.info("both mobile are not present in compare popup...fail");
				 Assert.assertTrue(false);
			 }
			 
			 
		 }
		 catch(Exception e)
		 {
			 System.out.println("exception message :"+e.getMessage());
		 }
	 }
	 public void ClickOnCloseCompare()
	 {
		 txtClosePopup.click();
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
