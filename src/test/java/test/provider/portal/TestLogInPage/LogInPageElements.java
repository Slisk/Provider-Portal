package test.provider.portal.TestLogInPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LogInPageElements {
	public static WebElement element = null; 
	
	 public static WebElement username(WebDriver driver) {
		  element = driver.findElement(By.id("username")); 
		  return element;  
	  }
	  public static WebElement password(WebDriver driver) {
		 element = driver.findElement(By.id("password"));
		 return element; 
	  }
	  public static WebElement submitBTN(WebDriver driver){
		  element = driver.findElement(By.id("submit-btn"));
		  return element; 
	  }

  }


