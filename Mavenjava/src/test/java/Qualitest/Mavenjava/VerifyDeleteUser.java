package Qualitest.Mavenjava;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

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
