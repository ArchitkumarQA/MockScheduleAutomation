package PageObject;

import org.openqa.selenium.By;

public class Login extends Base {

	By InstID = By.id("emailId");
	By InstPassword = By.id("password");
	By Signin = By.xpath("//button[contains(text(),'Sign In')]");
	By IRS = By.xpath("//h2[contains(text(),'Instructor Resource Center')]");

	public String verify_loginPage() {
		driver.get(DataValues.url);
		String title = driver.getTitle();
		System.out.println(title);
		return title;
	}

	public void login() {
		driver.findElement(InstID).sendKeys(DataValues.instusername);
		driver.findElement(InstPassword).sendKeys(DataValues.instpassword);
		driver.findElement(Signin).click();
	}
    public String verify_if_successfull_login()
    {
    	String s= driver.findElement(IRS).getText();
    	return s;
    	
    }
}
