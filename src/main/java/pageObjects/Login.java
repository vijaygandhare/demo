package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
	
public	WebDriver driver;
	
private	By username=By.id("user_email");
private	By password=By.cssSelector("#user_password");
private	By butttonLogin=By.name("commit");
	
	public Login(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement getUsername() {
		
		return driver.findElement(username);
	}
public WebElement getPassword() {
		
		return driver.findElement(password);
	}

public WebElement getLoginButton() {
	
	return driver.findElement(butttonLogin);
	 
}

}
