import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import bitmclass.selenium.MyDataProvider;

public class Swag {

	

	@Test(dataProviderClass =MyDataProvider.class,dataProvider = "userData")
	private void saucedemo(String username, String password) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");

		driver.manage().window().maximize();

		driver.findElement(By.id("user-name")).sendKeys(username);

		driver.findElement(By.id("password")).sendKeys(password);

		WebElement loginBtn = driver.findElement(By.id("login-button"));
		loginBtn.click();

//		driver.findElement(By.id("react-burger-menu-btn")).click();
//		
//		WebElement logout = driver.findElement(By.id("logout_sidebar_link"));

		Thread.sleep(6000);

		driver.quit();
	}

}
