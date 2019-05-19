package com.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskTwo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Alexandru Cecan\\Selenium\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.amazon.com/");
		List<WebElement> listoflinks = driver.findElements(By.tagName("a"));
		System.out.println(listoflinks.size());
		int count=0;
		for (WebElement link:listoflinks) {
			String linkText=link.getText();
			if (!linkText.isEmpty()) {
				System.out.println(linkText);
				count++;
			}
			driver.quit();

		}
		System.out.println("Total number of links with text "+count);
	
		
	}

}

