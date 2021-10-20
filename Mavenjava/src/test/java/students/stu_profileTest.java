package students;

import java.io.IOException;



import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Qualitest.Mavenjava.Initialization;
import Qualitest.Mavenjava.LoginPage;
import pageobjects.studentProfObj;



@Test
public class stu_profileTest {





public void studentProfile() throws IOException {
	Initialization init=new Initialization();
	WebDriver driver=init.DriverInit();
	LoginPage l=new LoginPage(driver);
	l.userlogin();
driver.manage().window().maximize();

studentProfObj sp=new studentProfObj(driver);
sp.userclick().click();
sp.profileclick().click();
sp.editProfclick().click();
sp.erasename().clear();
sp.addname().sendKeys("Sarvesh");
sp.updateclick().click();



}
}
