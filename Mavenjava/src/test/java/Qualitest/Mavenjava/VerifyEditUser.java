package Qualitest.Mavenjava;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class VerifyEditUser {

	Initialization init=new Initialization();
	
	@Test
	public void EditUserTest() throws IOException {
		
		WebDriver driver=init.DriverInit();
		EditUser E=new EditUser(driver);
		E.getEditUser();
		driver.close();
	}
}
