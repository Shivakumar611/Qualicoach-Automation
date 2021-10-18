package Qualitest.Mavenjava;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class DeleteUser extends Gotoadmin {
	By users=By.xpath("//a[text()='Users']");
	By Edit=By.xpath("//div[@class='row'] /div[@class='span9'] /ul[@class='unstyled indented-list'] /li[1] /a[text()='Browse list of users']");
	By textbox=By.cssSelector("input[id='id_realname']");
	By filter=By.cssSelector("input[id='id_addfilter']");
	By row=By.xpath("//*[@class='lastrow'] /td[6] /a[1]");
	By delete=By.cssSelector("input[value='Delete']");
	 public DeleteUser(WebDriver driver) {
		// TODO Auto-generated constructor stub
		 this.driver=driver;
	}
	public void getDelete() {
		 LoginPage l=new LoginPage(driver);
			l.GenericLogin("admin73","Admin@6100");
			getDashboard();
			getAdminstration();
			driver.findElement(users).click();
			driver.findElement(Edit).click();
			driver.findElement(textbox).sendKeys("Veena K M");
			driver.findElement(filter).click();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1000)");
			driver.findElement(row).click();
			driver.findElement(delete).click();
			
			
	 }
}
