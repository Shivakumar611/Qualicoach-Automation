package students;

import java.io.IOException;

import org.testng.annotations.Test;

public class AaUserFunctiontest {
	// Generalized object creation

	attemptQuiz a1 = new attemptQuiz();
	courseenroll a2 = new courseenroll();
	feedbackTest a3 = new feedbackTest();
	stu_profileTest a4 = new stu_profileTest();
	view_down_certificate a5 = new view_down_certificate();

	//@Test
	public void UserTest() throws IOException, InterruptedException {

		// Generalized function calls
		a2.enrollTest();
		a1.Quiz();

		a3.feedback();

		a4.studentProfile();

		a5.cert();

	}
}
