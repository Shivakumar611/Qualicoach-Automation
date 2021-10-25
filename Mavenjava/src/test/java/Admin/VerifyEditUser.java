package Admin;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Qualitest.Admin.EditUser;
import Qualitest.Admin.Initialization;

public class VerifyEditUser {

	/* MethodName=EditUserTest
	 * ReturnType=void
	 * ParametersCount=0
	 * ParameterType=no
	 * Description=Method for verify EditUser
	 * Possible Exceptions="NullPointerException","NoSuchElementException",ElementNotIneractableException"
	 */
	
	Initialization init=new Initialization();
	
	@Test
	public void EditUserTest() throws IOException {
	// Driver Initialization and User Login from Generic Function
		WebDriver driver=init.DriverInit();
	//creating object of EditUser and calling function	
		EditUser E=new EditUser(driver);
		E.getEditUser();
		driver.close();
	}
}
