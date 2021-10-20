package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class studentProfObj {



public WebDriver driver;

public studentProfObj(WebDriver driver) {
// TODO Auto-generated constructor stub
this.driver=driver;
}

public WebElement userclick() {
return driver.findElement(By.xpath("//*[@class='userbutton']"));

}

public WebElement profileclick() {
return driver.findElement(By.xpath("//*[@data-title='profile,moodle']"));

}

public WebElement editProfclick() {
return driver.findElement(By.xpath("//a[contains(text(),'Edit profile')]"));

}

public WebElement erasename() {
return driver.findElement(By.xpath("//*[@id='id_firstname']"));

}

public WebElement addname() {
return driver.findElement(By.xpath("//*[@id='id_firstname']"));

}

public WebElement updateclick() {
return driver.findElement(By.xpath("//*[@value='Update profile']"));

}
}
