package com.class06;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/*TC 1: Amazon Department List VerificationOpen chrome browserGo to “http:
 * //amazon.com/”Verify how many department options available.Print each departmentSelect ComputersQuit browser
 
*/
public class TaskOne {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Alexandru Cecan\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();

		driver.get("https://www.amazon.com/");
		WebElement dr=driver.findElement(By.cssSelector("select#searchDropdownBox"));
		Select select=new Select (dr);
		List<WebElement> allOptions=select.getOptions();
		System.out.println("# of departmentSelect " +allOptions.size());
		for(int i=0; i<allOptions.size(); i++) {
			String text=allOptions.get(i).getText();
			System.out.println(text);
		}
		select.selectByVisibleText("Computers");
		
		Thread.sleep(2000);
		driver.quit();

		

		
		
	}

}
