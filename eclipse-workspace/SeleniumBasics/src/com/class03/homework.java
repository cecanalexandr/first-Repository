package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class homework {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Alexandru Cecan\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.facebook.com/");
//		driver.findElement(By.xpath("//input[@type= 'email']")).sendKeys("5712772325");
//		driver.findElement(By.xpath("//input[@id= 'pass']")).sendKeys("11119999");
//		driver.findElement(By.xpath("//input[@value= 'Log In']")).click();
//		
//		driver.close();
//		
		driver.get("newtours.demoaut.com/");
		driver.findElement(By.xpath("//a[contains(text(), 'REGISTER')]/@href")).click();
		driver.findElement(By.xpath("//input[@name= 'firstName']")).sendKeys("Alex");
		driver.findElement(By.xpath("//input[@name= 'lastName']")).sendKeys("Cecan");
		driver.findElement(By.xpath("//input[@name= 'phone']")).sendKeys("4109175578");
		driver.findElement(By.xpath("//input[@name= 'userName']']")).sendKeys("info@gmail.com");
		driver.findElement(By.xpath("//input[@name= 'address1']")).sendKeys("322 Main Ave ");
		
		driver.findElement(By.xpath("//input[@name= 'city']")).sendKeys("Springfield");
		driver.findElement(By.xpath("//input[@name= 'state']")).sendKeys("VA");
		driver.findElement(By.xpath("//input[@name= 'postalCode]")).sendKeys("22003");
		driver.findElement(By.xpath("//input[@name= 'register']")).click();
		driver.close();
		
		
	}

}
