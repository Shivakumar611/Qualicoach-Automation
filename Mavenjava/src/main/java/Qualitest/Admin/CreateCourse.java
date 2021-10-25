package Qualitest.Admin;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class CreateCourse extends Gotoadmin {

	By courses = By.xpath("//ul[@class='nav nav-tabs'] /li[3]");
	By manage = By.xpath("//div[@class='span9'] /ul[@class='unstyled'] /li /a");
	By createNewuser = By.xpath("//div[@class='listing-actions course-listing-actions'] /a");

	public CreateCourse(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	/*MethodName=getCreateCours()
	 * ReturnType=void
	 * ParametersCount=0 
	 * ParameterType=No
	 * parameter used = no
	 * Description=Method for creating course
	 * Possible Exceptions="NullPointerException","NoSuchElementException","ElementNotIneractableException"
	 */

	public void getCreateCours() throws IOException {
		SoftAssert Assert = new SoftAssert();
		Properties p = new Properties();
		FileInputStream f1 = new FileInputStream(
				"C:\\Users\\Shivu\\git\\repository3\\Mavenjava\\src\\main\\java\\Qualitest\\Admin\\input.properties");
		p.load(f1);
		LoginPage l = new LoginPage(driver);
		l.GenericLogin(p.getProperty("admin"), p.getProperty("adminpass"));
		getDashboard();
		getAdminstration();
		try {
			driver.findElement(courses).click();
			driver.findElement(manage).click();
			driver.findElement(createNewuser).click();
		//sending coursename and short name
			driver.findElement(By.id("id_fullname")).sendKeys("Automation selenium12345");
			driver.findElement(By.id("id_shortname")).sendKeys("selenium java12345");
		//selecting dates of starting and ending from drop down menu
			WebElement drop1 = driver.findElement(By.id("id_startdate_day"));
			Select dropdown1 = new Select(drop1);
			dropdown1.selectByValue("6");
			WebElement drop2 = driver.findElement(By.id("id_startdate_month"));
			Select dropdown2 = new Select(drop2);
			dropdown2.selectByValue("6");
			WebElement drop3 = driver.findElement(By.id("id_startdate_year"));
			Select dropdown3 = new Select(drop3);
			dropdown3.selectByValue("2021");
		//disabling checkbox for end date
			driver.findElement(By.cssSelector("input#id_enddate_enabled")).click();
			System.out.println(driver.findElement(By.cssSelector("input#id_enddate_enabled")).isEnabled());
		//entering id number	
			driver.findElement(By.id("id_idnumber")).sendKeys("0010144");
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,500)");
		//
			driver.findElement(By.cssSelector("div#id_summary_editoreditable")).click();
			driver.findElement(By.cssSelector("div#id_summary_editoreditable"))
					.sendKeys("This course contains Selenium Java courses for Begineer's");
			js.executeScript("window.scrollBy(0,1000)");
			Assert.assertTrue(driver.findElement(By.cssSelector("input#id_saveanddisplay")).isDisplayed());
			driver.findElement(By.cssSelector("input#id_saveanddisplay")).click();
		} catch (Exception e) {
			System.out.println("Exception handled course alredy exists");
			

		}
		Assert.assertAll();
	}
}
