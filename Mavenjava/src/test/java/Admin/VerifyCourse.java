package Admin;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Qualitest.Mavenjava.CreateCourse;
import Qualitest.Mavenjava.Initialization;

public class VerifyCourse {
	
	Initialization init=new Initialization();
	
	@Test
	public void VerifyUserTest() throws IOException {
		WebDriver driver=init.DriverInit();
		CreateCourse c=new CreateCourse(driver);
		c.getCreateCours();
	}

}
