package pageobjects;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class certificateobject {



public WebDriver driver;

public certificateobject(WebDriver driver) {
// TODO Auto-generated constructor stub
this.driver=driver;
}

public WebElement hover() {
return driver.findElement(By.xpath("//div[@cat-id='3'] /a /p[text()='ISTQB-ISEB']"));
}

public WebElement certi_option() {
return driver.findElement(By.xpath("//div[@class='content'] / div[@id='accordion'] / div[8] "));

}

public WebElement certi_option1() {
return driver.findElement(By.xpath("//div[@class='content'] / div[@id='accordion'] / div[8] / div[2] / div / ul / li / a "));

}

public WebElement download_certi() {
return driver.findElement(By.xpath("//div[@role='main'] /div / div / form / div / input[@type='submit']"));

}
}