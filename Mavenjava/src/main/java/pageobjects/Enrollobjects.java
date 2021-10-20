package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Enrollobjects {

	public WebDriver driver;

	public Enrollobjects(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement hover() {
		return driver.findElement(By.xpath("//p[text()='ReadyAPI']"));
	}

	public WebElement enrollclick() {
		return driver.findElement(By.xpath("//*[@value='Enrol me']"));

	}

}