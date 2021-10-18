package Qualitest.Mavenjava;



import org.apache.commons.codec.binary.Base32;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class VerifyLogin{
	Initialization init=new Initialization();
	
 public static Logger log =LogManager.getLogger(Base32.class.getName());
 //(dataProvider="getData")
	@Test
	public void firstTest(String user,String pass) {
		
		WebDriver driver=init.DriverInit();
		LoginPage l=new LoginPage(driver);
		l.GenericLogin(user,pass);
		//log.info(submit);
		//init.DriverClose();
		driver.close();
	}
	
	//@DataProvider
	public  Object[][] getData()
	{
		
		Object[][] data=new Object[2][2];
		data[0][0]="admin73";
		data[0][1]="Admin@6100";
		data[1][0]="Admin7345";
		data[1][1]="Admin@6100";
		//data[2][0]="admin73";
		//data[2][1]="Admin@6100";
		return data;

	}
	
}
