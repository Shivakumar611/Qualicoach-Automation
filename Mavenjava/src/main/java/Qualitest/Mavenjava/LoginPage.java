package Qualitest.Mavenjava;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.testng.annotations.Test;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver;

public class LoginPage extends Initialization{
	 By username=By.name("username");
	 By Password=By.name("password");
	 By submit=By.id("loginbtn");
	
	 public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	
	
	
	
	
	public  void GenericLogin(String user,String pass)
	{
		
		
		driver.findElement(username).sendKeys(user);
		driver.findElement(Password).sendKeys(pass);
		driver.findElement(submit).click();
		System.out.println("Generic Test case passed");
		
	}
	
}
