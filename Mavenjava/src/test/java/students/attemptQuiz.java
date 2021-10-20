package students;





import java.io.IOException;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Qualitest.Mavenjava.Initialization;
import Qualitest.Mavenjava.LoginPage;
import pageobjects.quizobject;



@Test
public class attemptQuiz {

public void Quiz() throws IOException {
	Initialization init=new Initialization();
	WebDriver driver=init.DriverInit();
	LoginPage l=new LoginPage(driver);
	l.userlogin();
driver.manage().window().maximize();



quizobject qo=new quizobject(driver);
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("window.scrollBy(0,600)");
Actions a = new Actions(driver);
WebElement move =qo.hover();
a.moveToElement(move).click().build().perform();
qo.modulequiz().click();
qo.attemptquiz().click();
qo.startquiz().click();

}
}