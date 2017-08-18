package test.provider.portal.TestInHeader;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ElementsInHeader {
  public static WebElement element = null; 
  
  public static WebElement Orders(WebDriver driver) {
	   
	 element = driver.findElement(By.xpath("//a[@href='#order/all']")); 
	 return element;
  }
  public static WebElement Manage(WebDriver driver) {
	  element = driver.findElement(By.xpath("//a[@href='#manage/retailer']")); 
	  return element; 
  }
  public static WebElement Vouchers(WebDriver driver) {
	  element = driver.findElement(By.xpath("//a[@href='#vouchers']")); 
	  return element; 
  }
  public static WebElement Checkout(WebDriver driver) {
	  element = driver.findElement(By.xpath("//a[@href='#checkout']")); 
	  return element; 
  }
  public static WebElement Markets(WebDriver driver) {
	  element = driver.findElement(By.xpath("//a[@href='#markets']")); 
	  return element; 
  }
  
  public static WebElement marketDropdown(WebDriver driver) {
	  element = driver.findElement(By.xpath("//select[@ng-change='updateSelectedMarket()']")); 
	  return element; 
  }
  

  
  
  
  
  
}
