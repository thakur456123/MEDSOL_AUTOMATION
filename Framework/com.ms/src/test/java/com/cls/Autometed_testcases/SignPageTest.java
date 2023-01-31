package com.cls.Autometed_testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cls.pages.SignPage;
import com.ms.qa.base.TestBase;

public class SignPageTest extends TestBase {
	
	SignPage signPage;
	
	
	public SignPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		signPage = new SignPage();	
	}

	@Test
	public void loginTest(){
	  signPage.SignPages(prop.getProperty("username"),prop.getProperty("password"));
	}
	
}
