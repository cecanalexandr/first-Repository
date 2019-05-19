package com.class04;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathTaskTwo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		/*Open chrome browser
Go to “http://newtours.demoaut.com/”
Click on Register Link
Fill out all required info
Click Submit
		 * 
		 */
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Alexandru Cecan\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		Thread.sleep(2000);
		//C:\Users\Alexandru Cecan\eclipse-workspace\SeleniumBasics
		driver.findElement(By.xpath("//a[contains(text(),'REGISTER')]")).click();
		driver.findElement(By.cssSelector("input[name='firstName']")).sendKeys("a");
		driver.findElement(By.cssSelector("input[name='lastName']")).sendKeys("annnna");
		driver.findElement(By.cssSelector("input[name='phone']")).sendKeys("9615515511");
		driver.findElement(By.cssSelector("input#userName")).sendKeys("abcde");
		driver.findElement(By.cssSelector("input[name='address1']")).sendKeys("123 main st");
		driver.findElement(By.cssSelector("input[name='city']")).sendKeys("Annandale");
		driver.findElement(By.cssSelector("input[name='state']")).sendKeys("VA");
		driver.findElement(By.cssSelector("input[name='postalCode']")).sendKeys("11111");
		driver.findElement(By.cssSelector("input[type='image']")).click();
		Thread.sleep(3000);
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
//		
//		
//		driver.findElement(By.xpath("//a[contains(text(),'REGISTER')]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[contains(@id,'ma')]")).sendKeys("test123");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[starts-with(@name,'pass')]")).sendKeys("pass");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[starts-with(@name,'confirm')]")).sendKeys("pass");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[starts-with(@name,'reg')]")).click();
		

	}

}