package com.class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class helloWorld {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Alexandru Cecan\\Selenium\\chromedriver.exe");
WebDriver driver =new ChromeDriver();

driver.get("http:Facebook.com");
//driver.get("http:google.com");
//		
 driver.findElement(By.name("email")).sendKeys("cecan.1991@mail.ru");
	Thread.sleep(300);

 driver.findElement(By.name("pass")).sendKeys("cecan1991");
	Thread.sleep(300);

	 driver.findElement(By.id("u_0_2")).click();
		Thread.sleep(300);

driver.close();
//System.setProperty("webdriver.gecko.driver","C:\\Users\\Alexandru Cecan\\Selenium\\geckodriver.exe");
//WebDriver driver =new FirefoxDriver();
//driver.get("http:CHELSEAFC.com");
//driver.close();
	}

}
