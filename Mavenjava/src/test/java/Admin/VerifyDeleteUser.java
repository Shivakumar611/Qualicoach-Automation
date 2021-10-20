package Admin;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Qualitest.Mavenjava.DeleteUser;
import Qualitest.Mavenjava.Initialization;

public class VerifyDeleteUser {
	
	/* MethodName=VerifyDeleteTest
	 * ReturnType=void
	 * ParametersCount=0
	 * ParameterType=no
	 * Description=Method for verify DeleteUser
	 * Possible Exceptions="NullPointerException","NoSuchElementException",ElementNotIneractableException"
	 */
	
	Initialization init=new Initialization();
	
	@Test
	public void VerifyDeleteTest() throws IOException {
	// Driver Initialization and User Login from Generic Function
		WebDriver driver=init.DriverInit();
	//creating object of DeleteUser and calling function
		DeleteUser d=new DeleteUser(driver);
		d.getDelete();
		driver.close();
	}
}
