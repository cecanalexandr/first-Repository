package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Alexandru Cecan\\Selenium\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://facebook.com");
        driver.findElement(By.id("email")).sendKeys("5712772325");
		driver.findElement(By.partialLinkText("Forgot")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.findElement(By.name("pass")).sendKeys("11119999");
		driver.findElement(By.id("u_0_8")).click();
		Thread.sleep(2000);
		driver.close();
		
//		System.class.setProperty("webdrive.chrome.driver","C:\\Users\\Alexandru Cecan\\Selenium\\chromedriver.exe");
//         WebDriver driver =new ChromeDriver();
//         driver.navigate().to("http://newtours.);

	}
}
