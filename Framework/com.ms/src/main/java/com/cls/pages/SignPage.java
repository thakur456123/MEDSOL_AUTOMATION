package com.cls.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ms.qa.base.TestBase;

public class SignPage extends TestBase {
	
	
		
		@FindBy(id="email")
		WebElement Emailid;
		
		@FindBy(name="password")
		WebElement Password;
		
		@FindBy(xpath="//input[@type='submit']")
		WebElement loginBtn;
		
		public SignPage(){
			PageFactory.initElements(driver, this);
		}
		
		public  void SignPages(String username, String password){
			Emailid.sendKeys(username);
			Password.sendKeys(password);
			loginBtn.click();
			return;
	}
}
