package Qualitest.Mavenjava;


import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

//import java.io.FileInputStream;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
	
public class UserEnroll extends Gotoadmin {
	 
//Using 	
	By users=By.xpath("//a[text()='Users']");
	By addnewuser=By.xpath("//div[@class='row'] /div[@class='span9'] /ul[@class='unstyled indented-list'] /li[3] /a[text()='Add a new user']");
	By username=By.cssSelector("input[id='id_username']");
	By password=By.cssSelector("input[id='id_newpassword']");
	By fname=By.xpath("//input[@id='id_firstname']");
	By lname=By.xpath("//input[@id='id_lastname']");
	By email=By.cssSelector("input[name='email']");
	By submit=By.cssSelector("input[name='submitbutton']");
	
	
	
	public UserEnroll(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}



	public void getUserEnroll() throws IOException {
		
		Properties p=new Properties();
		FileInputStream f1=new FileInputStream("C:\\Users\\Shivu\\git\\repository3\\Mavenjava\\src\\main\\java\\Qualitest\\Mavenjava\\input.properties");
		p.load(f1);
		LoginPage l=new LoginPage(driver);
		l.GenericLogin(p.getProperty("admin"),p.getProperty("adminpass"));
		getDashboard();
		getAdminstration();
		
		driver.findElement(users).click();
		driver.findElement(addnewuser).click();
		driver.findElement(username).sendKeys(p.getProperty("username1"));
		driver.findElement(By.cssSelector("span[data-passwordunmask='displayvalue']")).click();
		driver.findElement(password).sendKeys(p.getProperty("password1"));
		driver.findElement(fname).sendKeys(p.getProperty("fname1"));
		driver.findElement(lname).sendKeys(p.getProperty("lname1"));
		driver.findElement(email).sendKeys(p.getProperty("email1"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		driver.findElement(submit).click();
		
		
	}
}
