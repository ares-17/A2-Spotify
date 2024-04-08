
//File risulta attualmente aggiornato per webdriver chrome headless!
package com.example.TesiIntegrazioneProgettoEsterno;

import java.util.concurrent.TimeUnit;

import org.junit.*;

import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.chrome.ChromeOptions;

public class ExampleOfSearch {
private static WebDriver driver;
private boolean acceptNextAlert = true;
private static StringBuffer verificationErrors = new StringBuffer();

	  @Before
	  public void setUp() throws Exception {
		
		  // Init chromedriver
		  //String chromeDriverPath = "/home/runner/work/A2-Spotify/A2-Spotify/chromedriver_v94_linux64/chromedriver";
		  //System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		  WebDriverManager.chromedriver().setup();
		  System.setProperty("webdriver.chrome.whitelistedIps", "");
		  ChromeOptions options = new ChromeOptions();
		  options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1200","--no-sandbox","--ignore-certificate-errors");
		  driver = new ChromeDriver(options);  
		  
		  
		  
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }
  @Test
  public void testExampleOfSearch() throws Exception {
    driver.get("http://localhost:4200/");
    driver.findElement(By.xpath("//*[@x448533202421-x-test-tpl-1]//*[@x448533202421-x-test-hook-29]//*[@x448624268039-x-test-tpl-1]//*[@x448627084077-x-test-tpl-3]//*[@x448627084077-x-test-hook-4][1]//*[@x448627084077-x-test-hook-5]")).click();
    driver.findElement(By.xpath("//*[@x448533202421-x-test-tpl-1]//*[@x448533202421-x-test-hook-29]//*[@x448624268039-x-test-tpl-1]//*[@x448627084077-x-test-tpl-3]//*[@x448627084077-x-test-hook-4][2]//*[@x448627084077-x-test-hook-5]")).click();
    driver.findElement(By.xpath("//*[@x448533202421-x-test-tpl-1]//*[@x448533202421-x-test-hook-29]//*[@x448624268039-x-test-tpl-3]//*[@x448624897747-x-test-tpl-2]//*[@x448594643043-x-test-tpl-1]//*[@x448594643043-x-test-hook-3]//*[@x448605300685-x-test-tpl-1]//*[@x448605300685-x-test-hook-4]")).click();
    driver.findElement(By.xpath("//*[@x448533202421-x-test-tpl-1]//*[@x448533202421-x-test-hook-29]//*[@x448624268039-x-test-tpl-3]//*[@x448624897747-x-test-tpl-2]//*[@x448594643043-x-test-tpl-1]//*[@x448594643043-x-test-hook-3]//*[@x448605300685-x-test-tpl-1]//*[@x448605300685-x-test-hook-4]")).clear();
    driver.findElement(By.xpath("//*[@x448533202421-x-test-tpl-1]//*[@x448533202421-x-test-hook-29]//*[@x448624268039-x-test-tpl-3]//*[@x448624897747-x-test-tpl-2]//*[@x448594643043-x-test-tpl-1]//*[@x448594643043-x-test-hook-3]//*[@x448605300685-x-test-tpl-1]//*[@x448605300685-x-test-hook-4]")).sendKeys("mecna");
    driver.findElement(By.xpath("//*[@x448533202421-x-test-tpl-1]//*[@x448533202421-x-test-hook-29]//*[@x448624268039-x-test-tpl-3]//*[@x448624897747-x-test-tpl-2]//*[@x448594643043-x-test-tpl-1]//*[@x448594643043-x-test-hook-14][6]//*[@x448545732489-x-test-tpl-1]")).click();
  }


 @After
	  public void tearDown() throws Exception {
	    driver.quit();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
	  }

	  private boolean isElementPresent(By by) {
	    try {
	      driver.findElement(by);
	      return true;
	    } catch (NoSuchElementException e) {
	      return false;
	    }
	  }

	  private boolean isAlertPresent() {
	    try {
	      driver.switchTo().alert();
	      return true;
	    } catch (NoAlertPresentException e) {
	      return false;
	    }
	  }

	  private String closeAlertAndGetItsText() {
	    try {
	      Alert alert = driver.switchTo().alert();
	      String alertText = alert.getText();
	      if (acceptNextAlert) {
	        alert.accept();
	      } else {
	        alert.dismiss();
	      }
	      return alertText;
	    } finally {
	      acceptNextAlert = true;
	    }
	  }

}
