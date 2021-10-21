package Qualitest.Mavenjava;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

public class Download extends Gotoadmin{

 public Download(WebDriver driver) {
		// TODO Auto-generated constructor stub
	 this.driver=driver;
	}

public void getDownload() throws IOException{
	SoftAssert Assert = new SoftAssert();
	Properties p=new Properties();
	FileInputStream f1=new FileInputStream("C:\\Users\\Shivu\\git\\repository3\\Mavenjava\\src\\main\\java\\Qualitest\\Mavenjava\\input.properties");
	p.load(f1);
	LoginPage l=new LoginPage(driver);
	l.GenericLogin(p.getProperty("admin"),p.getProperty("adminpass"));
		getDashboard();
	 
	 	try {
		driver.findElement(By.linkText("Names of resources completed")).click();
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		driver.findElement(By.xpath("//div[@class='centerpara'] /a /img[@alt='csv']")).click();
	 	}catch(Exception e) {
	 		System.out.println("Exception handled"+e);
	 	}
	 	
	 	Assert.assertAll();
		
	}
}
