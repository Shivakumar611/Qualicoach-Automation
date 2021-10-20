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
import Qualitest.Mavenjava.Initialization;
import Qualitest.Mavenjava.LoginPage;
import pageobjects.certificateobject;

@Test
public class view_down_certificate {

	private static Logger log = LogManager.getLogger(feedbackTest.class.getName());

	/* MethodName=cert()
	 * ReturnType=void
	 * ParametersCount=0 
	 * ParameterType=No parameter used
	 * Description=Method for downloading certificate
	 * PageObject Name=feedbackobject
	 * Possible Exceptions="NullPointerException","ElementNotFoundException",ElementNotIneractableException"
	 */
	
	public void cert() throws IOException {
		SoftAssert Assert = new SoftAssert();

	// Driver Initialization and User Login from Generic Function
		Initialization init = new Initialization();
		WebDriver driver = init.DriverInit();
		
		
		LoginPage l = new LoginPage(driver);
		l.userlogincert();
		log.info("User Successfull Login");
		driver.manage().window().maximize();
		
	//Creating Objects of PageObject Class
		certificateobject co = new certificateobject(driver);
		
	//Handling Exceptions and forwarding download certificate
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)");
		
		try {
		Actions a = new Actions(driver);
		WebElement move = co.hover();
		a.moveToElement(move).click().build().perform();
		log.info("hoverd and clicked on course");
		co.certi_option().click();
		log.info("clicked on feedback");
		co.certi_option1().click();
		log.info("clicked on certificate");
		co.download_certi().click();
		log.info("clicked on download");
		
		}
		catch (NoSuchElementException e) {
			log.error("not element found");
			Assert.assertFalse(false);
		}
		catch (ElementNotVisibleException e){
			log.error("element not visible");
			Assert.assertFalse(false);
		}
		catch (Exception e) {
			log.error("error in downloading");
			System.out.println("error in downloading \n" +e);
		}
		Assert.assertAll();
	}
}