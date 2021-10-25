package Admin;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Qualitest.Admin.CreateCourse;
import Qualitest.Admin.Initialization;

public class VerifyCourse {

	/* MethodName=VerifyUserTest
	 * ReturnType=void
	 * ParametersCount=0
	 * ParameterType=no
	 * Description=Method for verify Course
	 * Possible Exceptions="NullPointerException","NoSuchElementException",ElementNotIneractableException"
	 */
	
	Initialization init = new Initialization();

	@Test
	public void VerifyUserTest() throws IOException {
	// Driver Initialization and User Login from Generic Function
		WebDriver driver = init.DriverInit();
	// creating object of CreateCourse and calling function
		CreateCourse c = new CreateCourse(driver);
		c.getCreateCours();
		driver.close();
	}

}
