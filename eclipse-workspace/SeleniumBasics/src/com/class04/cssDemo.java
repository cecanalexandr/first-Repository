package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssDemo {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Alexandru Cecan\\Selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
//    driver.get("https://www.saucedemo.com/");
//	driver.findElement(By.cssSelector("input[data-test='username']")).sendKeys("standard_user");
//	driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
//	driver.findElement(By.cssSelector("input[class=btn_action]")).click();
//	Thread.sleep(2000);
	
	driver.get("newtours.demoaut.com/");
	driver.findElement(By.cssSelector("input#email")).sendKeys("itsHov");
	driver.findElement(By.cssSelector("input[name^='passw']")).sendKeys("HELLLLLO");
	driver.findElement(By.cssSelector("input[name='confirmPassword']")).sendKeys("HELLLLLO");
	driver.findElement(By.cssSelector("input[name='register']")).click();
}
}
