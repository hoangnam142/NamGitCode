package nampackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NamTest2 {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://fva.test.com/monitoring");
		WebElement LoginID = driver.findElement(By.id("AdminAdminId"));
		LoginID.sendKeys("admin");
		WebElement Password = driver.findElement(By.id("AdminPassword"));
		Password.sendKeys("admin");
		driver.findElement(By.cssSelector("button.btn.btn-warning")).click();
		
		//enter monitoring tab
		WebElement action = driver.findElement(By.id("search-computer"));
		action.sendKeys("a");
		
		driver.findElement(By.name("search")).click();
		WebElement box = driver.findElement(By.cssSelector("div.modal-body"));
		if (box.isDisplayed()) {
			driver.switchTo().alert().accept();
		}
}
}
