package pageobjects;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class Enrollobjects {

public WebDriver driver;

public Enrollobjects(WebDriver driver) {
// TODO Auto-generated constructor stub
this.driver=driver;
}



public WebElement hover() {
return driver.findElement(By.xpath("//div[@cat-id='3'] /a /p[text()='API Automation using REST Assured (Beginners)']"));
}

public WebElement enrollclick() {
return driver.findElement(By.xpath("//*[@value='Enrol me']"));



}


}