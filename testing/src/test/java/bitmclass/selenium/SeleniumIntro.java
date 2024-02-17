package bitmclass.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumIntro {
	
	
	@Test
	private void webPageTest() throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://fullstackbd.com/");
		
//		WebElement search= driver.findElement(By.name("q"));
//		search.sendKeys("Rakib Hasan Fahim");
		
		driver.findElement(By.xpath("/html/body/app-root/app-home/app-banner/div/app-header/div/header/div/button")).click();
		driver.findElement(By.xpath("//a[@href='/about']")).click();
		
		
		Thread.sleep(6000);
		driver.quit();
		
	}

}
