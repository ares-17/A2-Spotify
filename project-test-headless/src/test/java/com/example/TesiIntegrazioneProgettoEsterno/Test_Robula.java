
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

public class Test_Robula{
private static WebDriver driver;
private boolean acceptNextAlert = true;
private static StringBuffer verificationErrors = new StringBuffer();

	  @Before
	  public void setUp() throws Exception {
		
		  // Init chromedriver
		  //String chromeDriverPath = "/home/runner/work/Tesi-StrumentoGenerale/Tesi-StrumentoGenerale/chromedriver_v94_linux64/chromedriver";
		  //System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		  WebDriverManager.chromedriver().setup();
		  System.setProperty("webdriver.chrome.whitelistedIps", "");
		  ChromeOptions options = new ChromeOptions();
		  options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1200","--no-sandbox","--ignore-certificate-errors");
		  driver = new ChromeDriver(options);  
		  
		  
		  
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }
  @Test
  public void test_loc_Robula_release_1_1() throws Exception{
    driver.get("http://localhost:4200/");
    Thread.sleep(5000);
    driver.findElement(By.xpath("//input[1][@value='']")).click();
    driver.findElement(By.xpath("//input[1][@value='']")).clear();
    driver.findElement(By.xpath("//input[1][@value='']")).sendKeys("odoobnb@gmail.com");
    driver.findElement(By.xpath("//input[1][@aria-describedby='password-error']")).click();
    driver.findElement(By.xpath("//input[1][@aria-describedby='password-error']")).clear();
    driver.findElement(By.xpath("//input[1][@aria-describedby='password-error']")).sendKeys("provaprova93");
    driver.findElement(By.xpath("//span[1][@class='Type__TypeElement-goli3j-0 dmuHFl sc-hKwDye fXzRSj']")).click();
    driver.findElement(By.xpath("//a[1][@href='/search']")).click();
    driver.findElement(By.xpath("//input[1]")).sendKeys("marco");
    driver.findElement(By.xpath("//input[1]")).sendKeys(Keys.ENTER);
    driver.findElement(By.xpath("//as-album-track[1]/as-media-table-row[1]/as-track-main-info[1]/div[2]/div[2]/a[1]")).click();
    Thread.sleep(5000);
    assertEquals("Marco Mengoni",driver.findElement(By.xpath("//h2[@class='media-title ellipsis-one-line']")).getText());
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