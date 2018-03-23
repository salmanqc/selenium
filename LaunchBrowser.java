package com.edureka.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {

  public static WebDriver driver =null;
	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\skarim\\workspace\\Selenium\\Driver\\chromedriver.exe");
	      driver = new ChromeDriver();
	       
	       //System.setProperty("webdriver.FireFox.driver", "C:\\Users\\skarim\\workspace\\Selenium\\Driver\\geckodriver.exe");
	       //driver = new WebDriver();

	       
	       //driver.get("https://www.facebook.com/");
	       driver.navigate().to("https://www.google.com/");
	       
	       driver.findElement(By.name("q")).sendKeys("test");
           driver.findElement(By.name("btnG")).click();
           
	       String title =driver.getTitle();
	       System.out.println(title);
	       
	       String url =driver.getCurrentUrl();
	       System.out.println(url);
	       
	       String browserId = driver.getWindowHandle();
	       System.out.println(browserId);
	       
	       try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	       driver.close();
	}

}
