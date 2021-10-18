package Qualitest.Mavenjava;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Admin_QualicoachTest {

	@Test
	public void DriverInit1()
	{
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
		//driver.findElement(By.className("administration")).click();
		//driver.findElement(By.xpath("//a[text()='Users']")).click();
	/*	driver.findElement(By.xpath("//div[@class='row'] /div[@class='span9'] /ul[@class='unstyled indented-list'] /li[3] /a[text()='Add a new user']")).click();
		driver.findElement(By.cssSelector("input[id='id_username']")).sendKeys("user22234");
		driver.findElement(By.cssSelector("span[data-passwordunmask='displayvalue']")).click();
		driver.findElement(By.cssSelector("input[id='id_newpassword']")).sendKeys("user22234");
		driver.findElement(By.xpath("//input[@id='id_firstname']")).sendKeys("user111111111");
		driver.findElement(By.xpath("//input[@id='id_lastname']")).sendKeys("222");
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("usertest@qt.com");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		driver.findElement(By.cssSelector("input[name='submitbutton']")).click();
	*/
		//driver.findElement(By.xpath("//div[@class='row'] /div[@class='span9'] /ul[@class='unstyled indented-list'] /li[1] /a[text()='Browse list of users']")).click();
		//driver.findElement(By.cssSelector("input[id='id_realname']")).sendKeys("Demo User");
		//driver.findElement(By.cssSelector("input[id='id_addfilter']")).click();
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,1000)");
	/*	driver.findElement(By.xpath("//*[@class='lastrow'] /td[6] /a[3]")).click();
		js.executeScript("window.scrollBy(0,1000)");
		WebElement drop=driver.findElement(By.id("id_country"));
		Select dropdown = new Select(drop);
		dropdown.selectByValue("IN");
		js.executeScript("window.scrollBy(0,1000)");
		driver.findElement(By.cssSelector("input[value='Update profile']")).click();
	*/
		/*delete
		 * driver.findElement(By.xpath("//*[@class='lastrow'] /td[6] /a[1]")).click();
		 
		driver.findElement(By.cssSelector("input[value='Delete']")).click();
		*/
		
		/*create course
		driver.findElement(By.xpath("//ul[@class='nav nav-tabs'] /li[3]")).click();
		driver.findElement(By.xpath("//div[@class='span9'] /ul[@class='unstyled'] /li /a")).click();
		driver.findElement(By.xpath("//div[@class='listing-actions course-listing-actions'] /a")).click();
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
		*/
		//for downloading and displaying reqd 22 to 30
		
		//driver.findElement(By.xpath("//li[@class='r1'] /div[@class='column c1'] /a")).click();
		driver.findElement(By.linkText("Names of resources completed")).click();
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		driver.findElement(By.xpath("//div[@class='centerpara'] /a /img[@alt='csv']")).click();
	}
	
	
}
