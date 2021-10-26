package Qualitest.Admin;


import java.io.IOException;
import java.util.Properties;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Initialization {
	
	public WebDriver driver;
	public Properties p = new Properties();
	private static Logger log = LogManager.getLogger(Initialization.class.getName());

	/* MethodName=DriverInit()
	 * ReturnType=WebDriver 
	 * ParametersCount=0
	 * ParameterType=No parameter used 
	 * Description=To Initialize the Driver
	 */

	public WebDriver DriverInit() throws IOException {
	
	// Driver Initialization 
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");
		driver = new ChromeDriver(options);
		driver.get("https://test.qualicoach.org");
		log.info("driver initilized");
		driver.manage().window().maximize();
		return driver;

	}
	
	/* MethodName=DriverClose()
	 * ReturnType=WebDriver 
	 * ParametersCount=0
	 * ParameterType=No parameter used 
	 * Description=To close the Driver
	 */

	public void DriverClose() {
		driver.close();
	}

}
