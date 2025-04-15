package testCases;


import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.LoginPage;
import pageObject.MyAccount;
import testBase.BaseClass;
import utilities.Excelutils;

public class TC003_loginDDT extends BaseClass {
	
	@Test(dataProvider="logindata",dataProviderClass = Excelutils.class)
	public void verify_loginDDT(String email,String pwd,String exp) {
		try {
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		hp.clickLogin();
		
		LoginPage lp=new LoginPage(driver);
		lp.inputEmail(email);
		lp.InputPassword(pwd);
		lp.clickLogin();
		
		MyAccount mc=new MyAccount(driver);
		boolean targetpage=mc.isMyAccountPageExists();
		
		if(exp.equalsIgnoreCase("valid")) {
			
		if(targetpage==true)
		{mc.clicklogout();
			Assert.assertTrue(true);
		}
		}
		else {
			Assert.assertFalse(false);
		}
		if(exp.equalsIgnoreCase("invalid")) {
			if(targetpage==true) {
				mc.clicklogout();
				Assert.assertFalse(false);
			}
		}
		else {
			Assert.assertTrue(true);
		}
		}
		catch(Exception e) {
			Assert.fail();
		}
		
	}

}
