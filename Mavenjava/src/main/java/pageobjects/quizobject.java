package pageobjects;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class quizobject {



public WebDriver driver;

public quizobject(WebDriver driver) {
// TODO Auto-generated constructor stub
this.driver=driver;
}

public WebElement hover() {
return driver.findElement(By.xpath("//div[@cat-id='3'] /a /p[text()='API Automation using REST Assured (Beginners)']"));
}

public WebElement modulequiz() {
return driver.findElement(By.id("next-activity-link"));

}

public WebElement attemptquiz() {
return driver.findElement(By.xpath("//*[@value='Attempt quiz now']"));

}

public WebElement startquiz() {
return driver.findElement(By.xpath("//*[@value='Start attempt']"));

}
}
