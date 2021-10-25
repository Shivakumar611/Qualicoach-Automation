package pageobjects_Student;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class feedbackobject {



public WebDriver driver;

public feedbackobject(WebDriver driver) {
// TODO Auto-generated constructor stub
this.driver=driver;
}



public WebElement hover() {
return driver.findElement(By.xpath("//div[@cat-id='3'] /a /p[text()='Python Beginners']"));
}

public WebElement feed_click1() {
return driver.findElement(By.xpath("//div[@class='content'] / div[@id='accordion'] / div[6]"));

}

public WebElement feed_click2() {
return driver.findElement(By.xpath("//div[@class='content'] / div[@id='accordion'] / div[6] / div[1] / div / ul / li / a "));

}

public WebElement answer_ques() {
return driver.findElement(By.linkText("Answer the questions"));

}

}