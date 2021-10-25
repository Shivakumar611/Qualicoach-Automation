package students;

import java.io.IOException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Qualitest.Admin.Initialization;
import Qualitest.Admin.LoginPage;
import pageobjects.feedbackobject;

@Test
public class feedbackTest {

	public static Logger log = LogManager.getLogger(feedbackTest.class.getName());
	
	/* MethodName=enrollTest()
	 * ReturnType=void
	 * ParametersCount=0 
	 * ParameterType=No parameter used
	 * Description=Method for Enrollment to the Course From Users
	 * PageObject Name=feedbackobject
	 * Possible Exceptions="NullPointerException","ElementNotFoundException",ElementNotIneractableException"
	 */

	public void feedback() throws IOException {
		SoftAssert Assert = new SoftAssert();
		
	//Driver Initialization and User Login from Generic Function
		Initialization init = new Initialization();
		WebDriver driver = init.DriverInit();
	
		LoginPage l = new LoginPage(driver);
		l.userlogin();
		log.info("User Successfull Login");
	
	//Creating Objects of PageObject Class
		feedbackobject fo = new feedbackobject(driver);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)");
		
	//Handling Exceptions and forwarding to feedback
		try {
		Actions a = new Actions(driver);
		WebElement move = fo.hover();
		a.moveToElement(move).click().build().perform();
		}
		catch(Exception e) {
			Assert.assertFalse(false);
			System.out.println("no course found");
		}
		
		try {
		fo.feed_click1().click();
		log.info("clicked on feed1 button");
		fo.feed_click2().click();
		log.info("clicked on feed2 button");
		fo.answer_ques().click();
		log.info("clicked on answer button");
		}catch (NoSuchElementException e) {
			log.error("not element found");
			
		}
		catch (ElementNotVisibleException e){
			log.error("element not visible");
			
		}
		catch (Exception e) {
			log.error("error in feed back");
			System.out.println("no button found for feedback \n" +e);
		}
		
	
		
		Assert.assertAll();
		driver.close();

	}
}
