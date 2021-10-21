package students;

import java.io.IOException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Qualitest.Mavenjava.Initialization;
import Qualitest.Mavenjava.LoginPage;
import pageobjects.studentProfObj;

@Test
public class stu_profileTest {

	private static Logger log = LogManager.getLogger(stu_profileTest.class.getName());

	/*
	 * MethodName=studentProfile() 
	 * ReturnType=void 
	 * ParametersCount=0
	 * ParameterType=No
	 * Description=Method for editing user information
	 * PageObject Name=studentProfObj Possible
	 * Exceptions="NullPointerException","ElementNotFoundException","ElementNotIneractableException"
	 */

	public void studentProfile() throws IOException {

		SoftAssert Assert = new SoftAssert();
	
	// Driver Initialization and User Login from Generic Function
		Initialization init = new Initialization();
		WebDriver driver = init.DriverInit();
		
		
		LoginPage l = new LoginPage(driver);
		l.userlogin();
		log.info("User Successfull Login");
		driver.manage().window().maximize();
		
	//Creating Objects of PageObject Class and performing User edit
		studentProfObj sp = new studentProfObj(driver);
		
		try {
		sp.userclick().click();
		log.info("clicked on user button");
		sp.profileclick().click();
		log.info("clicked on Profile");
		sp.editProfclick().click();
		log.info("clicked on editProfile");
		sp.erasename().clear();
		log.info("clicked on Firstname");
		sp.addname().sendKeys("Dhoni");
		log.info("sent first name to text feild");
		sp.updateclick().click();
		log.info("clicked on update profile");
		}
		catch (NoSuchElementException e) {
			log.error("not element found");
			
		}
		catch (ElementNotVisibleException e){
			log.error("element not visible");
			
		}
		catch (Exception e) {
			log.error("error in updateprofile");
			System.out.println("no button found for feedback \n" +e);
		}
		Assert.assertAll();
		driver.close();

	}
}
