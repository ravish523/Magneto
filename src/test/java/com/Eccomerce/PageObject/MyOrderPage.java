package com.Eccomerce.PageObject;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Eccomerce.TestCase.BaseClass;

public class MyOrderPage extends BaseClass {
	
	public WebDriver driver;
	@FindBy(xpath="//tbody/tr[1]/td[6]/span[1]/a[1]")
	private WebElement txtVieworder;
	@FindBy(xpath="//tbody/tr[1]/td[6]/span[1]/a[2]")
	private WebElement txtReorder;
	@FindBy(xpath="//a[contains(text(),'Print Order')]")
	private WebElement txtPrintorder;
	
	public MyOrderPage(WebDriver d)
	{
		driver=d;
		PageFactory.initElements(d, this);
	}
	public void ClickOnViewOrder()
	{
		txtVieworder.click();
	}
	public void ClickOnReorder()
	{
		txtReorder.click();
	}
	public void ClickOnPrintOrder()
	{
		txtPrintorder.click();
	}
	public void SaveOrderDetails() throws AWTException, InterruptedException
	{
		for(String id:driver.getWindowHandles())
		{
			logger.info("window id:"+id);
			logger.info("window id:"+driver.switchTo().window(id).getTitle());
			driver.switchTo().window(id);
		try
		{
		Robot robo=new Robot();
		robo.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		robo.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		logger.info("order pdf is saved in default location...pass");
		}
		catch(Exception e)
		{
			System.out.println("Exception message :"+e.getMessage());
			e.printStackTrace();
			
		}
		break;
		}
	}
	
	

}
