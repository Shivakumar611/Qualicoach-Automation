package Qualitest.Mavenjava;


import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Initialization {
	
	public WebDriver driver;
	public Properties p = new Properties();

	/* MethodName=DriverInit()
	 * ReturnType=WebDriver 
	 * ParametersCount=0
	 * ParameterType=No parameter used 
	 * Description=To Initialize the Driver
	 */

	public WebDriver DriverInit() throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://test.qualicoach.org");
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
