package org.lo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.webdriver.WebDriverBrowser;

public class NewTest {
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bharani\\eclipse-workspace\\Test\\driver\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  
	  driver.get("https://www.facebook.com/");
	  
	  PageFactory.initElements(driver, Getteer.class);
	  
	  Getteer.userename.sendKeys("hi");
	  Getteer.password.sendKeys("42343");
	  Getteer.btn.click();
	  
	  
	  
  }
}
