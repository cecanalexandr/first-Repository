package com.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {

	public static void main(String[] args) {
		// Check all Years of Experiance radio buttons are clickable
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Alexandru Cecan\\Selenium\\chromedriver.exe");
         WebDriver driver=new ChromeDriver();
 		driver.manage().window().fullscreen();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
        List<WebElement> exp=driver.findElements(By.xpath("//input[@name='exp']"));
        //System.out.println(exp.size());
        
        for (WebElement webElement : exp) {
        	System.out.println(webElement.getText());
        	if (webElement.isEnabled()) {
        		
        	}
			
		}
        
        
        
        
	}

}
