package com.Eccomerce.TestCase;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import com.Eccomerce.Utilities.Xutil;

public class demoInterview{
	
	@Test
	public void DemoTest() throws IOException, EncryptedDocumentException, InvalidFormatException
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=2;j++)
			{

				String value=Xutil.getCellData("./TestData/TestCase.xlsx", "login", i, j);
				System.out.print(" -1- "+value+" -1- ");
				Xutil.setCellData("./TestData/TestCase.xlsx", "login", i, 3, "pass");
				System.out.println(" fffffffffffffff............");
				String value2=Xutil.getCellData("./TestData/TestCase.xlsx", "login", i, 3);
				System.out.print(" -2- "+value2+" -2- ");
			}
			System.out.println(" ");
			
		}
		
		
	   
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	 
}
