package test.provider.portal.TestNG;

import static org.testng.Assert.assertEquals;

import org.eclipse.jetty.util.log.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import test.provider.portal.TestInHeader.ProviderPortal_Header;
import test.provider.portal.TestLogInPage.ValidationOfLogInPage;

public class ProviderPortalTest {
	WebDriver driver = new ChromeDriver(); 
	ValidationOfLogInPage VP = new ValidationOfLogInPage(); 
	
	@BeforeSuite
	public void getBrowser() {
		String browser = "https://stage-provider-portal.urb-it.com/"; 
		driver.get(browser);
		Reporter.log("Browser launched");
		driver.manage().window().maximize();
	}
	@AfterSuite 
	  public void closeBrowser() {
		  driver.close();
		  driver.quit();
	  }
	
  @Test
  public void testLogInValidation() {
	  System.out.println("check if log-in user is valid");
	  ValidationOfLogInPage.username(driver);
	  ValidationOfLogInPage.password(driver); 
	  ValidationOfLogInPage.submitBTN(driver);
	  Reporter.log("Log-in successfull"); 
  }
  @Test
  public void testHeaderValidation() {
	  ProviderPortal_Header.validOrder(driver); 
	  ProviderPortal_Header.validManage(driver); 
  }
  
  
  
  
  
}
