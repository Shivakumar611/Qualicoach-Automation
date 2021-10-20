package Admin;

import java.io.IOException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Qualitest.Mavenjava.Initialization;
import Qualitest.Mavenjava.LoginPage;
import students.stu_profileTest;


public class VerifyLogin{

	
	
	/* MethodName=firstTest
	 * ReturnType=driver
	 * ParametersCount=2
	 * ParameterType=String,String
	 * Description=Method for verify login with valid and invalid login
	 * Possible Exceptions="NullPointerException","NoSuchElementException",ElementNotIneractableException"
	 */
	
 
	@Test(dataProvider="getData")
	public void firstTest(String user,String pass) throws IOException {
	//Driver Initialization and User Login from Generic Function
		Initialization init=new Initialization();
		WebDriver driver=init.DriverInit();
	
		LoginPage l=new LoginPage(driver);
		l.GenericLogin(user,pass);
		
		driver.close();
	}
	
	@DataProvider
	public  Object[][] getData()
	{
		
		Object[][] data=new Object[2][2];
		//for valid credentials login
		data[0][0]="admin73";
		data[0][1]="Admin@6100";
		//for invalid credentials login
		data[1][0]="Admin7345";
		data[1][1]="Admin@6100";
		return data;

	}
	
}
