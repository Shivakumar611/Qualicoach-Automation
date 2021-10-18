package Qualitest.Mavenjava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class demooo {

	
		@Test
		public void DriverInit1() {
			System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
			WebDriver  driver=new ChromeDriver();
			driver.get("https://test.qualicoach.org");
			driver.manage().window().maximize();

			driver.findElement(By.name("username")).sendKeys("Admin55");

			//password

			driver.findElement(By.name("password")).sendKeys("Admin@6155");

			driver.findElement(By.id("loginbtn")).click();
			driver.findElement(By.className("userbutton")).click();
			driver.findElement(By.id("actionmenuaction-1")).click();
			List<WebElement> names=driver.findElements(By.className("cell c0"));
			for (WebElement name : names)
			{
				if (name.getText().equalsIgnoreCase("Grades of resources")) {
					
					driver.findElement(By.xpath("//td[class='cell c5 lastcol']"));
				}
			}
		}

}
