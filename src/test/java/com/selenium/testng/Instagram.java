package com.selenium.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Instagram {
	
	WebDriver w;
	
  @Test
  public void instagram() {
	  w.get("https://www.instagram.com/");
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
