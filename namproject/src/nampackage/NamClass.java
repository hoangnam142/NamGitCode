package nampackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class NamClass {
	
	public static void main(String[] args) {
		
		
	WebDriver driver = new FirefoxDriver();
	String url = "http://newtours.demoaut.com/";
	String expectedTitle = "Welcome: Mercury Tours";
	String actualTitle = "";
	
	driver.get(url);
	actualTitle = driver.getTitle();
	if(actualTitle.contentEquals(expectedTitle)){
	   System.out.println("Title chinh xac");
	}else{
		System.out.println("Title khong chinh xac");
	}
	driver.close();
	}
}

