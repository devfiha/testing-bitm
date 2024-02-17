package helloFahim;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestFahim {
	
	@Test
	private void helloTest() throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		WebElement search = driver.findElement(By.name("q"));
		
		search.sendKeys("Hello Bangladesh ");
				
		
		Thread.sleep(2000);
		
		driver.quit();
		

	}

}
