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

import Qualitest.Mavenjava.Initialization;
import Qualitest.Mavenjava.LoginPage;
import pageobjects.quizobject;

@Test
public class attemptQuiz {

	private static Logger log = LogManager.getLogger(attemptQuiz.class.getName());

	/*
	 * MethodName=Quiz() 
	 * ReturnType=void 
	 * ParametersCount=0 
	 * ParameterType=No
	 * parameter used = no
	 * Description=Method for attempting quiz
	 * PageObject Name=quizobject Possible
	 * Exceptions="NullPointerException","NoSuchElementException","ElementNotIneractableException"
	 */

	public void Quiz() throws IOException {
		
	//Creating objects of Asserts and Initializing driver
		
		SoftAssert Assert = new SoftAssert();
		
		Initialization init = new Initialization();
		WebDriver driver = init.DriverInit();
		
		driver.manage().window().maximize();

		LoginPage l = new LoginPage(driver);
		l.userlogin();
		log.info("User Successfull Login");

	// Creating Objects of PageObject Class

		quizobject qo = new quizobject(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)");

	// Handling Exceptions and Performing Hover and attempting quiz

		Actions a = new Actions(driver);
		WebElement move = qo.hover();
		
		try {
			a.moveToElement(move).click().build().perform();
			
		} catch (Exception e) {
		
			log.error("No course found");
			System.out.println("course not found");
		}
		
		// qo.modulequiz().click();
		
		try {

			qo.attemptquiz().click();

		} catch (Exception e) {
			
			log.error("no Attempt quiz button found and 3 attempts are over");
			System.out.println("alredy attempted quiz");
		}
		
		try {
			
			// qo.startquiz().click();
			
		} catch (Exception e) {
			
			log.error("No start button found");
			System.out.println("alredy attempted quiz");
			
		}
		
		Assert.assertAll();
		driver.close();
	}
}