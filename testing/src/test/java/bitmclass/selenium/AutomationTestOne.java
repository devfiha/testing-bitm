package bitmclass.selenium;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.Test;

public class AutomationTestOne {

	@Test
	public void resgisterTest() {

		WebDriver driver = new ChromeDriver();

		driver.get("https://automationexercise.com/");

		String actualTitle = driver.getTitle();
		String expectedTitle = "Automation Exercise";

		assertEquals(actualTitle, expectedTitle, "Titile is not ok");
		
		driver.findElement(By.linkText("Signup / Login")).click();
		
		WebElement name = driver.findElement(By.name("name"));
		name.sendKeys("Rakib Hasan Fahim");
		
		WebElement email = driver.findElement(RelativeLocator.with(By.name("email")).below(name));
		email.sendKeys("rhfiha@gmail.com");
		
		WebElement signUpBtn = driver.findElement(RelativeLocator.with(By.tagName("button")).below(email));
		signUpBtn.click();
		

	}

}
