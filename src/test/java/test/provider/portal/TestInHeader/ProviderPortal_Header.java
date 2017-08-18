package test.provider.portal.TestInHeader;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProviderPortal_Header {
	public static WebElement element = null; 
  
	public static WebElement validOrder(WebDriver driver) {
		element = ElementsInHeader.Orders(driver);
		try {
			Thread.sleep(5000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		//Assert.assertTrue(element.isDisplayed()); 
		element.click();
		return element; 
	}
	public static WebElement validManage(WebDriver driver) {
		element = ElementsInHeader.Manage(driver);
		Assert.assertTrue(element.isDisplayed()); 
		element.click();
		
		return element; 
	}
	public static WebElement validVouchers(WebDriver driver) {
		element = ElementsInHeader.Vouchers(driver);
		Assert.assertTrue(element.isDisplayed()); 
		element.click();
		
		return element; 
	}
	public static WebElement validCheckout(WebDriver driver) {
	     element = ElementsInHeader.Checkout(driver);
	     Assert.assertTrue(element.isDisplayed()); 
		 element.click();
	     
	     return element; 
	}
	public static WebElement validMarkets(WebDriver driver) {
		element = ElementsInHeader.Markets(driver);
		Assert.assertTrue(element.isDisplayed());
		element.click();
		
		return element; 
	}
}
