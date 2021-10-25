package Qualitest.Admin;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

public class DeleteUser extends Gotoadmin {
	By users = By.xpath("//a[text()='Users']");
	By Edit = By.xpath(
			"//div[@class='row'] /div[@class='span9'] /ul[@class='unstyled indented-list'] /li[1] /a[text()='Browse list of users']");
	By textbox = By.cssSelector("input[id='id_realname']");
	By filter = By.cssSelector("input[id='id_addfilter']");
	By row = By.xpath("//*[@class='lastrow'] /td[6] /a[1]");
	By delete = By.cssSelector("input[value='Delete']");

	public DeleteUser(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	/*MethodName=getDelete()
	 * ReturnType=void
	 * ParametersCount=0 
	 * ParameterType=No
	 * parameter used = no
	 * Description=Method for deleting user
	 * Possible Exceptions="NullPointerException","NoSuchElementException","ElementNotIneractableException"
	 */
	public void getDelete() throws IOException {
		SoftAssert Assert = new SoftAssert();
		Properties p = new Properties();
		FileInputStream f1 = new FileInputStream(
				"C:\\Users\\Shivu\\git\\repository3\\Mavenjava\\src\\main\\java\\Qualitest\\Mavenjava\\input.properties");
		p.load(f1);

		LoginPage l = new LoginPage(driver);
		l.GenericLogin(p.getProperty("admin"), p.getProperty("adminpass"));
		getDashboard();
		getAdminstration();
		try {
			driver.findElement(users).click();
			driver.findElement(Edit).click();
			driver.findElement(textbox).sendKeys("userquali123");
			driver.findElement(filter).click();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1000)");
			driver.findElement(row).click();
			driver.findElement(delete).click();
		} catch (Exception e) {
			System.out.println("Exception handled");

		}
		Assert.assertAll();

	}
}
