package test.provider.portal.TestLogInPage;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertTrue;

import java.sql.DriverPropertyInfo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class ValidationOfLogInPage  {
static LogInPageElements LE = new LogInPageElements();   
public static WebElement element = null; 

  public static WebElement username(WebDriver driver) {
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	  LogInPageElements.username(driver).sendKeys("johan.admin@urbit.com"); 
	  return element;  
  }
  public static WebElement password(WebDriver driver) {
	 LogInPageElements.password(driver).sendKeys("Jmm929110");
	 return element; 
  }
  public static WebElement submitBTN(WebDriver driver){
	  
	  LogInPageElements.submitBTN(driver).click(); 
	  try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	  return element; 
  }

  	

}
