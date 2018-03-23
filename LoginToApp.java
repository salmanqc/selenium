package com.edureka.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToApp {

	public static WebDriver driver =null;
	public static void main(String[] args) throws InterruptedException
	{
	   	   
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\skarim\\workspace\\Selenium\\Driver\\chromedriver.exe");
       driver = new ChromeDriver();

       driver.get("https://online.actitime.com/kushtia/login.do");
       //driver.navigate().to;("https://online.actitime.com/kushtia/login.do")
       WebElement username = driver.findElement(By.id("username"));
       username.sendKeys("kushtia");
       WebElement password = driver.findElement(By.name("pwd"));
       password.sendKeys("Za2aGyLa");
       WebElement loginBtn =driver.findElement(By.xpath("//div[text()='Login ']"));
       loginBtn.click();	   
       
       Thread.sleep(5000);
       //WebElement logoutLink =driver.findElement(By.linkText("Logout"));
       /*if(logoutLink.isDisplayed())
       {
    	   System.out.println("you are logged in successfully!!!");
       }
       else
    	   System.out.println("Login Failed");*/
       
       String title = driver.getTitle();
       if (title.equals("actiTIME - Enter Time-Track"))
       
    	   System.out.println("Pass -You have logged in successfully");
       
       else
              System.out.println("Fail - Login Failed");
       
	}
       
	}
