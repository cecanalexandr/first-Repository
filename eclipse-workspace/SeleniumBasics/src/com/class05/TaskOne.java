package com.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskOne {

	private static boolean displayP;

	public static void main(String[] args) throws InterruptedException {
		 String userName ="standard_user";
		String password="secret_sauce";
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Alexandru Cecan\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
	
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
		driver.findElement(By.cssSelector("input[class='btn_action']")).click();
		Thread.sleep(3000);
		boolean logo =driver.findElement(By.cssSelector("div.peek")).isDisplayed();
		if(logo) {
			System.out.println("Robot logo is displayed");
			
		}else {
			System.out.println("Robot logo is NOT displayed");
		}
		WebElement product=driver.findElement(By.cssSelector("div.product_label"));
		String productText=product.getText();
		String expectedText="Products";
		if (displayP && productText.equals(expectedText)) {
			System.out.println("Element is displayed and texts is "+productText);
		}else {
			System.out.println("Element is NOT displayed OR textis NOT="+productText);
			driver.close();
		}
		driver.close();

		
	}




	}


