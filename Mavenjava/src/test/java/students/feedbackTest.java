package students;

import java.io.IOException;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Qualitest.Mavenjava.Initialization;
import Qualitest.Mavenjava.LoginPage;
import pageobjects.feedbackobject;



@Test
public class feedbackTest {





public void feedback() throws IOException {
	Initialization init=new Initialization();
	WebDriver driver=init.DriverInit();
	LoginPage l=new LoginPage(driver);
	l.userlogin();
feedbackobject fo=new feedbackobject(driver);
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("window.scrollBy(0,600)");
Actions a = new Actions(driver);
WebElement move =fo.hover();
a.moveToElement(move).click().build().perform();
fo.feed_click1().click();
fo.feed_click2().click();
fo.answer_ques().click();

}
}
