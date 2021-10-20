package students;

import java.io.IOException;




import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Qualitest.Mavenjava.Initialization;
import Qualitest.Mavenjava.LoginPage;
import pageobjects.Enrollobjects;



@Test
public class courseenroll {





public void enrollTest() throws IOException {

	Initialization init=new Initialization();
	WebDriver driver=init.DriverInit();
	LoginPage l=new LoginPage(driver);
	l.userlogin();

driver.manage().window().maximize();



Enrollobjects en=new Enrollobjects(driver);
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("window.scrollBy(0,600)");
Actions a = new Actions(driver);
WebElement move =en.hover();
a.moveToElement(move).click().build().perform();
en.enrollclick().click();

}
}