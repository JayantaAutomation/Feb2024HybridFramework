package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.SignUpPage;

public class LoginPageTest extends TestBase{
	LoginPage loginPage;
	SignUpPage signUpPage;
	HomePage homepage;

	public LoginPageTest(){
		super();
	}

	@BeforeMethod
	public void setup(){
		initialization();
		loginPage = new LoginPage();
	}


	@Test (priority=1)
	public void loginPageTitleTest(){
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "#1 Free CRM Power Up your Entire Business Free Forever");
	}

	@Test(priority=2)
	public void crmLogoImageTest(){
		boolean flag = loginPage.validateCRMImage();
		Assert.assertTrue(flag);
	}

	@Test(priority=3)
	public void crmSIgnUpButtonTest(){
		boolean flag = loginPage.validateCRMSignUpbutton();
		Assert.assertTrue(flag);
	}

	@Test(priority=4)
	public void crmSignUpPageTest(){
		signUpPage = loginPage.validateCRMloginPage();
	}
	
	@Test(priority=5)
	public void loginTest(){
		signUpPage = loginPage.validateCRMloginPage();
		homepage = loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
	}


	@AfterMethod
	public void tearDown(){
		driver.quit();

	}
}
