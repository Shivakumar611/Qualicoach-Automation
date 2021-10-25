package Qualitest.Admin;

import org.openqa.selenium.By;

public class Gotoadmin extends Initialization {

	By userbutton = By.className("userbutton");
	By dashboard = By.id("actionmenuaction-1");
	By administration = By.className("administration");

	public void getDashboard() throws NullPointerException {

		try {
			driver.findElement(userbutton).click();
			driver.findElement(dashboard).click();
		} 
		catch (Exception e) {
			System.out.println("Elemnt not found\n");
		}
	}

	public void getAdminstration() throws NullPointerException {
		try {
			driver.findElement(administration).click();
		} 
		catch (Exception e) {
			System.out.println("Elemnt not found\n");
		}

	}

}
