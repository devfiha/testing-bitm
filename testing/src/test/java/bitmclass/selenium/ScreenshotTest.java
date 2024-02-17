package bitmclass.selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScreenshotTest {
	
	@Test
	private void screenShot() throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		
		File screenShotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		try {
			FileHandler.copy(screenShotFile, new File("./Screenshots/SeleniumScreenshot\" + System.currentTimeMillis() +\".png") );
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		driver.close();
	}

}
