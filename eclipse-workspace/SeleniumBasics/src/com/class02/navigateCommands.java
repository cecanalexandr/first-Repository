package com.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigateCommands {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Alexandru Cecan\\Selenium\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.navigate().to("http://www.walmart.com");
		Thread.sleep(300);
		driver.navigate().to("https://www.google.com");
		Thread.sleep(300);

		driver.navigate().back();
		Thread.sleep(300);

		driver.navigate().forward();
		driver.navigate().refresh();
		driver.close();
	}

}
