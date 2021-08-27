package Demo.E2EProject;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.LandingPage;
import pageObjects.Login;
import resources.Base;

public class ValidateTittleTest extends Base
{
	public WebDriver driver;
	LandingPage lp;
	public static Logger log =LogManager.getLogger(Base.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException {
		
		
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
	}
	@Test
	public void verifyAppTittle() throws IOException 
	{
		
		
		 lp=new LandingPage(driver);
		
		//lp.popupmessage().click();
		String expectedText=lp.pageText().getText();
		Assert.assertEquals(expectedText, "FEATURED COURSES");
		log.info("verified the text");
		
	}
	
	@Test
	public void verifyHeader() throws IOException 
	{
		
		
		 lp=new LandingPage(driver);
		
		
		String expectedText=lp.getHeader().getText();
		Assert.assertEquals(expectedText, "AN ACADEMY TO LEARN EVERYTHING ABOUT TESTING");
		log.info("verified the text");
		
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
		
	}
}
