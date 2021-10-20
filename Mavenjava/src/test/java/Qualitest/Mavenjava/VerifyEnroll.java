package Qualitest.Mavenjava;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class VerifyEnroll  {

	
	
	
	@Test
	public void AddUserTest() throws IOException
	{
		Initialization init=new Initialization();
		WebDriver driver=init.DriverInit();
		UserEnroll e=new UserEnroll(driver);
		e.getUserEnroll();
		driver.close();
	}
}
