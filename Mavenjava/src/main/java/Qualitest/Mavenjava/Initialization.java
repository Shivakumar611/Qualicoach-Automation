 package Qualitest.Mavenjava;



import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

//import java.util.*;
public class Initialization {
	public WebDriver driver;
	
	public WebDriver DriverInit() {
		
	
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		driver.get("https://test.qualicoach.org");
		driver.manage().window().maximize();
		return driver;
	}
	
	public void DriverClose() {
		driver.close();
	}

}
