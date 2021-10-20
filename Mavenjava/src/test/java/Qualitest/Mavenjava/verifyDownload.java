package Qualitest.Mavenjava;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class verifyDownload {
	Initialization init=new Initialization();
	@Test
	public void DownloadTest() throws IOException
	{
		WebDriver driver=init.DriverInit();
		Download d=new Download(driver);
		d.getDownload();
		
	}
}
