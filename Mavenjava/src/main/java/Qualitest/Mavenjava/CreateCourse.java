package Qualitest.Mavenjava;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CreateCourse extends Gotoadmin {

	By courses=By.xpath("//ul[@class='nav nav-tabs'] /li[3]");
	By manage=By.xpath("//div[@class='span9'] /ul[@class='unstyled'] /li /a");
	By createNewuser=By.xpath("//div[@class='listing-actions course-listing-actions'] /a");
	
	
	public CreateCourse(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	    

	public void getCreateCours() throws IOException {
		
		Properties p=new Properties();
		FileInputStream f1=new FileInputStream("C:\\Users\\Shivu\\git\\repository\\Mavenjava\\src\\main\\java\\Qualitest\\Mavenjava\\input.properties");
		p.load(f1);
		LoginPage l=new LoginPage(driver);
		l.GenericLogin("admin73","Admin@6100");
		getDashboard();
		getAdminstration();
		
		driver.findElement(courses).click();
		driver.findElement(manage).click();
		driver.findElement(createNewuser).click();
		driver.findElement(By.id("id_fullname")).sendKeys("Automation selenium");
		driver.findElement(By.id("id_shortname")).sendKeys("selenium java");
		WebElement drop1=driver.findElement(By.id("id_startdate_day"));
		Select dropdown1 = new Select(drop1);
		dropdown1.selectByValue("6");
		WebElement drop2=driver.findElement(By.id("id_startdate_month"));
		Select dropdown2 = new Select(drop2);
		dropdown2.selectByValue("6");
		WebElement drop3=driver.findElement(By.id("id_startdate_year"));
		Select dropdown3 = new Select(drop3);
		dropdown3.selectByValue("2021");
		driver.findElement(By.cssSelector("input#id_enddate_enabled")).click();
		System.out.println(driver.findElement(By.cssSelector("input#id_enddate_enabled")).isEnabled());
		driver.findElement(By.id("id_idnumber")).sendKeys("001");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		driver.findElement(By.cssSelector("div#id_summary_editoreditable")).click();
		driver.findElement(By.cssSelector("div#id_summary_editoreditable")).sendKeys("This course contains Selenium Java courses for Begineer's");
		js.executeScript("window.scrollBy(0,1000)");
		driver.findElement(By.cssSelector("input#id_saveanddisplay")).click();
	}
}
