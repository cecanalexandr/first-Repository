package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseContains {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Alexandru Cecan\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.saucedemo.com/");
//		  driver.findElement(By.xpath("//input[starts-with(@id,'user-name')]")).sendKeys("standard_user");    
//		  driver.findElement(By.xpath("//input[starts-with(@id,'password')]")).sendKeys("secret_sauce");    
//		  driver.findElement(By.xpath("//input[starts-with(@value,'LOGI')]")).click();  
//		  Thread.sleep(3000);
//		  driver.close();
		
		driver.get("https://www.facebook.com/");
	    driver.findElement(By.xpath("//input[starts-with(@id,'ema')]")).sendKeys("5712772325");
	    driver.findElement(By.xpath("//input[starts-with(@id,'pa')]")).sendKeys("11119999");
	    driver.findElement(By.xpath("//a[contains(text(),'account?')]")).click();
	    
	    driver.findElement(By.xpath("//input[starts-with(@value,'Log')]")).click();
	    Thread.sleep(2000);
	    driver.close();

		  
	}

}
