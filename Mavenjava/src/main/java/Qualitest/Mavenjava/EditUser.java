package Qualitest.Mavenjava;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class EditUser extends Gotoadmin {

	By users = By.xpath("//a[text()='Users']");
	By Edit = By.xpath("//div[@class='row'] /div[@class='span9'] /ul[@class='unstyled indented-list'] /li[1] /a[text()='Browse list of users']");
	By textbox = By.cssSelector("input[id='id_realname']");
	By filter = By.cssSelector("input[id='id_addfilter']");
	By row = By.xpath("//*[@class='lastrow'] /td[6] /a[3]");
	By update = By.cssSelector("input[value='Update profile']");

	public EditUser(WebDriver driver) {
		this.driver = driver;
	}

	public void getEditUser() {
		LoginPage l = new LoginPage(driver);
		l.GenericLogin("admin73", "Admin@6100");
		getDashboard();
		getAdminstration();
		driver.findElement(users).click();
		driver.findElement(Edit).click();
		driver.findElement(textbox).sendKeys("Demo User");
		driver.findElement(filter).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		driver.findElement(row).click();
		js.executeScript("window.scrollBy(0,1000)");
		WebElement drop = driver.findElement(By.id("id_country"));
		Select dropdown = new Select(drop);
		dropdown.selectByValue("IN");
		js.executeScript("window.scrollBy(0,1000)");
		driver.findElement(update).click();

	}

}
