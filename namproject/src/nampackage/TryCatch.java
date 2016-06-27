package nampackage;


import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TryCatch {
	WebDriver driver = new FirefoxDriver();
	
	
  @Test
  public void tryandcatch() {
	  driver.get("http://fva.test.com/");
	  
	  try {
		  WebElement element = driver.findElement(By.id("AdminAdminId1"));
		  if (element.isDisplayed()) {
			  element.sendKeys("abc");
		  }
	  }
	  catch (Exception e) {
		  System.out.println("abc");
	  }
	  finally {
		  driver.close();
	  }
  }
}
