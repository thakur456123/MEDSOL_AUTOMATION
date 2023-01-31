package com.cls.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ms.qa.base.TestBase;


public class SigninPage extends TestBase {
	

	

	
		
		//Page Factory - OR:
		@FindBy(id="email")
		WebElement Emailid;
		
		@FindBy(name="password")
		WebElement password;
		
		@FindBy(xpath="//input[@type='submit']")
		WebElement loginBtn;
		
		
		//Initializing the Page Objects:
		public SigninPage(){
			PageFactory.initElements(driver, this);
		}
		
		//Actions:
		//public String validateLoginPageTitle(){
		//	return driver.getTitle();
		//}
		
		
		
		public HomePage login(String un, String pwd){
			Emailid.sendKeys(un);
			password.sendKeys(pwd);
			loginBtn.click();
			    	JavascriptExecutor js = (JavascriptExecutor)driver;
			    	js.executeScript("arguments[0].click();", loginBtn);
			    	
			return new HomePage();
		}
		
	}


