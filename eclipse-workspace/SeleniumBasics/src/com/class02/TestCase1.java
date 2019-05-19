package com.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Alexandru Cecan\\Selenium\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get( "https://www.amazon.com/");
		System.out.println(driver.getTitle());
		String title =driver.getTitle();
		if(title.equalsIgnoreCase("amazon")) {
			System.out.println("this is the right title");
		}
		else {
			System.out.println("this is not the right adrres");
			driver.close();
		}

	}

}
