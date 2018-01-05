package aa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class fedf {
	
	
	@Test
	
	public void ff() {
		
	//	webdriver.firefox.marionette
		
		System.setProperty("webdriver.firefox.marionette", "C:\\personal\\geckodriver-v0.15.0-win64\\geckodriver.exe");
		 
		 WebDriver	  driver = new FirefoxDriver();
	 
		
	 
		
		  driver.get("http://toolsqa.com/selenium-webdriver/testng-multi-browser-cross-browser/");
		
		
		
		
	}
	
	

}
