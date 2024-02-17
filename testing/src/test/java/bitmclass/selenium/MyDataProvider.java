package bitmclass.selenium;

import org.testng.annotations.DataProvider;

public class MyDataProvider {

	@DataProvider(name = "user-data")
	Object[][] userData() {

		Object[][] data = new Object[][] { { "standard_user", "secret_sauce" }, { "locked_out_user", "secret_sauce" },
				{ "problem_user", "secret_sauce" }, { "performance_glitch_user", "secret_sauce" },
				{ "error_user", "secret_sauce" }, { "visual_user", "secret_sauce" }, };
		return data;
	}
	
	@DataProvider(name = "userData")
	public Object[][] getUserData(){
		return ExcelUtils.getData();
	}

}
