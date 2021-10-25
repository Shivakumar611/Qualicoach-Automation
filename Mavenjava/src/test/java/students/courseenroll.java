package students;

import java.io.IOException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Qualitest.Admin.Initialization;
import Qualitest.Admin.LoginPage;
import pageobjects_Student.Enrollobjects;


@Test
public class courseenroll {

	public static Logger log = LogManager.getLogger(courseenroll.class.getName());
	
	/* MethodName=enrollTest()
	 * ReturnType=void
	 * ParametersCount=0 
	 * ParameterType=No parameter used
	 * Description=Method for Enrollment to the Course From Users
	 * PageObject Name=Enrollobjects
	 * Possible Exceptions="NullPointerException","ElementNotFoundException",ElementNotIneractableException"
	 */
	
	public void enrollTest() throws IOException {

		SoftAssert Assert = new SoftAssert();
	
	//Driver Initialization and User Login from Generic Function
		
		Initialization init = new Initialization();
		WebDriver driver = init.DriverInit();
		
		LoginPage l = new LoginPage(driver);
		l.userlogin();
		log.info("User loged in");

		driver.manage().window().maximize();
	
	//Creating Objects of PageObject Class
		Enrollobjects en = new Enrollobjects(driver);
		log.info("Enroll page object created");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)");
		log.info("Scrolled down");
	
	//Handling Exceptions and Performing Hover and Enrolling to Course
		
		try {
			Actions a = new Actions(driver);
			WebElement move = en.hover();
			a.moveToElement(move).click().build().perform();
			log.info("clicked on course");
		}
		catch (Exception e) {
			
			System.out.println("not a valid course so:" + e);
		}
		
		try {
			en.enrollclick().click();
			log.info("enrolled to course");
		}
		catch (Exception e) {
			
			System.out.println("Alredy enrolled to the course : \n ");
			//Logs.error("Alredy enrolled to the course");
		}
		
		Assert.assertAll();
		driver.close();

	}//End Of Method
}//End of Class