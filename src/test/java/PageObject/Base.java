package PageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {

	public static WebDriver driver ;
	
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\architkumar\\WebDriver_Chrome\\ChromeDriver79\\chromedriver.exe");
		
		  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
	}
	
	public void closeup()
	{
		driver.close();
	}

}
