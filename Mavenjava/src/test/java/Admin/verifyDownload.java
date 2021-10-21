package Admin;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Qualitest.Mavenjava.Download;
import Qualitest.Mavenjava.Initialization;

public class verifyDownload {
	
	/* MethodName=DownloadTest
	 * ReturnType=void
	 * ParametersCount=0
	 * ParameterType=no
	 * Description=Method for verify Download
	 * Possible Exceptions="NullPointerException","NoSuchElementException",ElementNotIneractableException"
	 */
	
	Initialization init=new Initialization();
	
	@Test
	public void DownloadTest() throws IOException
	{
	// Driver Initialization and User Login from Generic Function
		WebDriver driver=init.DriverInit();
	//creating object of Download and calling function
		Download d=new Download(driver);
		d.getDownload();
		driver.close();
	}
}
