package Demo.E2EProject;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.LandingPage;
import resources.Base;

public class NavigationBarTest extends Base
{
	public WebDriver driver;
	public static Logger log =LogManager.getLogger(Base.class.getName());
	@BeforeTest
	public void initialize() throws IOException {
		
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
	}
	
	@Test
	public void navigationBar() throws IOException {
		
		
		LandingPage lp=new LandingPage(driver);
		
		//lp.popupmessage().click();
		
		boolean panel=lp.nagigation().isDisplayed();
		Assert.assertTrue(panel);
		log.info("navigation bar displayed");
		
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
	}

	
}
