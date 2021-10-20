package Admin;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Qualitest.Mavenjava.EditUser;
import Qualitest.Mavenjava.Initialization;

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
