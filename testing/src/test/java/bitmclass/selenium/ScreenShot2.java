package bitmclass.selenium;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.time.LocalDateTime;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class ScreenShot2 {

	@Test
	private void screenShot() throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		LocalDateTime dt = LocalDateTime.now();
		String filename = dt.toString();
		filename = filename.replace(":", "-").replace(".", "-");
		String project = "BITM3";
		
//		filename = "./screeshot/" +project+"-"+filename+".png";
		
//		File screenShot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		Date date = new Date(2024, 1, 5);
		FileHandler.copy(source, new File("./screeshot/BITM-3" + date +  + System.currentTimeMillis() + ".png"));
        System.out.println("the Screenshot is taken");
		
//		try {
//			FileHandler.copy(screenShot, new File(filename));
//		} catch (IOException e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}


        
        driver.close();
		
		
	}
}
