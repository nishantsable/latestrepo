package aa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class vv {

	public WebDriver driver;
	 
	  @Parameters("browser")
	 
	  @BeforeClass
	 
	  // Passing Browser parameter from TestNG xml
	 
	  public void beforeTest(String browser) {
	 
	  // If the browser is Firefox, then do this
	 
	  if(browser.equalsIgnoreCase("firefox")) {
		  System.setProperty("webdriver.chrome.driver", "C:\\personal\\chromedriver_win32\\chromedriver.exe");
		  driver = new ChromeDriver();
	 
	  // If browser is IE, then do this	  
	 
	  }else if (browser.equalsIgnoreCase("ie")) { 
	 
		  // Here I am setting up the path for my IEDriver
	 
		  System.setProperty("webdriver.firefox.marionette", "C:\\personal\\geckodriver-v0.15.0-win64\\geckodriver.exe");
	 
		  driver = new FirefoxDriver();
	 
	  } 
	 
	  // Doesn't the browser type, lauch the Website
	 
	  
	 
	  }
	 
	  // Once Before method is completed, Test method will start
	 
	  @Test
	  public void login() throws InterruptedException {
		  
		  driver.get("http://www.store.demoqa.com"); 
	 
		driver.findElement(By.xpath(".//*[@id='account']/a")).click();
	 
	    driver.findElement(By.id("log")).sendKeys("testuser_1");
	 
	    driver.findElement(By.id("pwd")).sendKeys("Test@123");
	 
	    driver.findElement(By.id("login")).click();
	 
		}  
	 
	  @AfterClass public void afterTest() {
	 
			driver.quit();
	 
		}
	 
	}