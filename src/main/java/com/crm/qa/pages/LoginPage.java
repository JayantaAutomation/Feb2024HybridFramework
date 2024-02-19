package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{

	//Page Factory -  OR:
	@FindBy(xpath="//a[contains(text(),'Sign Up')]")
	WebElement signUpBtn;

	@FindBy(xpath="//div[@class='rd-navbar-panel']//span[2]")
	WebElement crmlogo;
	
	@FindBy(xpath ="//input[@placeholder='Email']")
	WebElement email;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement password;
	
	@FindBy(xpath="//div[@class='ui fluid large blue submit button']")
	WebElement loginBtn;

	//Initializing the Page Objects:
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	//Actions:
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}

	public boolean validateCRMImage(){
		return crmlogo.isDisplayed();
	}

	public boolean validateCRMSignUpbutton() {
		return signUpBtn.isEnabled();
	}

	public SignUpPage validateCRMloginPage() {
		signUpBtn.click();
		return new SignUpPage();
	}
	
	public HomePage login(String em, String pwd) {
		email.sendKeys(em);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new HomePage();
		
	}

}
