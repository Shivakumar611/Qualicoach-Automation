package Admin;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Qualitest.Mavenjava.Initialization;
import Qualitest.Mavenjava.UserEnroll;

public class VerifyEnroll  {

	/* MethodName=AddUserTest
	 * ReturnType=driver
	 * ParametersCount=0
	 * ParameterType=no
	 * Description=Method for verify adding user
	 * Possible Exceptions="NullPointerException","NoSuchElementException",ElementNotIneractableException"
	 */
	
	
	@Test
	public void AddUserTest() throws IOException
	{
	// Driver Initialization and User Login from Generic Function
		Initialization init=new Initialization();
		WebDriver driver=init.DriverInit();
	//creating object of UserEnroll and calling function	
		UserEnroll e=new UserEnroll(driver);
		e.getUserEnroll();
		driver.close();
	}
}
