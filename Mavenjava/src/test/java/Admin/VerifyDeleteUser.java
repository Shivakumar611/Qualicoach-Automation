package Admin;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Qualitest.Mavenjava.DeleteUser;
import Qualitest.Mavenjava.Initialization;

public class VerifyDeleteUser {
	Initialization init=new Initialization();
	@Test
	public void VerifyDeleteTest() throws IOException {
		WebDriver driver=init.DriverInit();
		DeleteUser d=new DeleteUser(driver);
		d.getDelete();
		driver.close();
	}
}
