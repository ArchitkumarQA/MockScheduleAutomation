package Testcase;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PageObject.Base;
import PageObject.DataValues;
import PageObject.Login;

public class TestCase {

	Base b = new Base();
	Login log = new Login();
	DataValues data = new DataValues();
	@BeforeClass()
	public void setup()
	{
		b.setUp();
	}
	@Test(priority=1)
	public void verifyLoginPage()
	{
		Assert.assertEquals(log.verify_loginPage(), "Cengage Sign In");
	}
	@Test(priority=2)
	public void runTestLogin()
	{
		log.login();
		Assert.assertEquals(log.verify_if_successfull_login(), "Instructor Resource Center");
		System.out.println("Successfull login");
		b.closeup();
	}
}
