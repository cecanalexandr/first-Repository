package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class paraBank {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Alexandru Cecan\\Selenium\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://parabank.parasoft.com/parabank/register.htm;jsessionid=37D2027BAD718D720F71C78CE081E4DC");
		Thread.sleep(3000);

		driver.findElement(By.id("customer.firstName")).sendKeys("Alex");
		driver.findElement(By.id("customer.lastName")).sendKeys("Cecan");
		driver.findElement(By.id("customer.address.street")).sendKeys("4950 sunset lane");
		driver.findElement(By.id("customer.address.city")).sendKeys("Annandale");
		driver.findElement(By.id("customer.address.state")).sendKeys("VA");
		driver.findElement(By.id("customer.address.zipCode")).sendKeys("22003");
		driver.findElement(By.id("customer.phoneNumber")).sendKeys("5712772325");
		driver.findElement(By.id("customer.ssn")).sendKeys("1100110012");
		driver.findElement(By.id("customer.username")).sendKeys("cecanalexandr233");
		driver.findElement(By.id("customer.password")).sendKeys("11112222Alexandru");
		driver.findElement(By.id("repeatedPassword")).sendKeys("11112222Alexandru");
		
		driver.findElement(By.xpath("//input[@value='Register']")).click();
		Thread.sleep(9000);

		//driver.findElement(By.linkText("Log Out")).click();
		driver.findElement(By.partialLinkText("Out")).click();
		driver.close();
		
	}

	
	}


