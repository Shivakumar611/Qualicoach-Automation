package Qualitest.Mavenjava;

import java.io.IOException;

import org.testng.annotations.Test;

public class Adminfunction extends Initialization{
	VerifyLogin v1=new VerifyLogin();
	VerifyEnroll v2=new VerifyEnroll();
	VerifyEditUser v3=new VerifyEditUser();
	VerifyDeleteUser v4=new VerifyDeleteUser();
	 VerifyCourse v5=new  VerifyCourse();
	 verifyDownload v6=new verifyDownload();
	
	@Test
	public void AdminTest() throws IOException {
		
		v1.firstTest("admin73", "Admin@6100");
		
		v2.AddUserTest();
		
		v3.EditUserTest();
	
		v4.VerifyDeleteTest();
		
		v5.VerifyUserTest();
		
		v6.DownloadTest();
		
	} 
	
}
