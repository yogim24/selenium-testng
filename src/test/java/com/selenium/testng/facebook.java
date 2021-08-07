package com.selenium.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class facebook {
	WebDriver w;
  @Test(priority = 0,description = "test case for facebook ")
  public void facebook1 () {
	  w.get("https://www.facebook.com/");
  }
  @BeforeTest
  public void beforeTest() {
	  String projectPath=System.getProperty("user.dir");
	  String chromePath=projectPath+"\\BrowserDriver\\chromedriver.exe";
	  System.setProperty("webdriver.chrome.driver", chromePath);
	  w=new ChromeDriver();
  }

  @AfterTest
  public void afterTest() {
	  w.quit();
  }

}
