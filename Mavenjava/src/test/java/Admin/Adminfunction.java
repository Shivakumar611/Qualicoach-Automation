package Admin;

import java.io.IOException;

import org.testng.annotations.Test;

import Qualitest.Mavenjava.Initialization;

public class Adminfunction extends Initialization {

//Generalized object creation
	VerifyLogin v1 = new VerifyLogin();
	VerifyEnroll v2 = new VerifyEnroll();
	VerifyEditUser v3 = new VerifyEditUser();
	VerifyDeleteUser v4 = new VerifyDeleteUser();
	VerifyCourse v5 = new VerifyCourse();
	verifyDownload v6 = new verifyDownload();

	//@Test
	public void AdminTest() throws IOException, InterruptedException {
	//Generalized function calls
		v1.firstTest("admin73", "Admin@6100");

		v2.AddUserTest();

		v3.EditUserTest();

		v4.VerifyDeleteTest();

		v5.VerifyUserTest();

		v6.DownloadTest();

	}

}
