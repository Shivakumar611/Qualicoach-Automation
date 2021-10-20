package students;

import java.io.IOException;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Qualitest.Mavenjava.Initialization;
import Qualitest.Mavenjava.LoginPage;
import pageobjects.certificateobject;



@Test
public class view_down_certificate {


public void cert() throws IOException {
	Initialization init=new Initialization();
	WebDriver driver=init.DriverInit();
	LoginPage l=new LoginPage(driver);
	l.userlogincert();
driver.manage().window().maximize();
certificateobject co=new certificateobject(driver);
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("window.scrollBy(0,600)");
Actions a = new Actions(driver);
WebElement move =co.hover();
a.moveToElement(move).click().build().perform();
co.certi_option().click();
co.certi_option1().click();
co.download_certi().click();
}
}