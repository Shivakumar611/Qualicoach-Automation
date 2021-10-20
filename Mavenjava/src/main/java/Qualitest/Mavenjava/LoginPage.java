package Qualitest.Mavenjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends Initialization {
	By username = By.name("username");
	By Password = By.name("password");
	By submit = By.id("loginbtn");

	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public void GenericLogin(String user, String pass) {

		try {
		driver.findElement(username).sendKeys(user);
		driver.findElement(Password).sendKeys(pass);
		driver.findElement(submit).click();
		System.out.println("Generic Test case passed");}
		catch(Exception e) {
		System.out.println("Invalid login");
		}

	}

	public void userlogincert() {
		driver.get("https://test.qualicoach.org/ ");
		driver.findElement(By.id("username")).sendKeys("user88");
		driver.findElement(By.id("password")).sendKeys("User@9146");
		driver.findElement(By.id("loginbtn")).click();
	}

	public void userlogin() {
		driver.get("https://test.qualicoach.org/ ");
		driver.findElement(By.id("username")).sendKeys("user94");
		driver.findElement(By.id("password")).sendKeys("User@7014");
		driver.findElement(By.id("loginbtn")).click();
	}

}
