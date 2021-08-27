package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
public	WebDriver driver;
private	By popup=By.xpath("//button[contains(text(),'NO THANKS')]");
private	By signin=By.xpath("//span[contains(text(),'Login')]");
private	By coursesText=By.xpath("//h2[contains(text(),'Featured Courses')]");

private	By headerText=By.xpath("//h3[contains(text(),'An Academy to')]");
	
private	By navigationPanel=By.xpath("//nav[@class='navbar-collapse collapse']");
	
	public LandingPage(WebDriver driver) {
		this.driver=driver;
	}

	public WebElement loginLink() {
		return driver.findElement(signin);
	}
	
	public WebElement popupmessage() {
		return driver.findElement(popup);
	}

	public WebElement pageText() {
		return driver.findElement(coursesText);
	}
	
	public WebElement nagigation() {
		return driver.findElement(navigationPanel);
	}
	
	public WebElement getHeader() {
		return driver.findElement(headerText);
	}
}
