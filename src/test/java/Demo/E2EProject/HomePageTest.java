package Demo.E2EProject;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.Login;
import resources.Base;



public class HomePageTest extends Base{
	public WebDriver driver;
	public static Logger log =LogManager.getLogger(Base.class.getName());
	@BeforeTest
	public void initialize() throws IOException {

		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
	}

	@Test(dataProvider = "getData")
	public void basePageNavigation(String username, String password, String text) throws IOException {
		
		driver.get(prop.getProperty("url"));
		log.info("navigated to homepage");

		LandingPage lp = new LandingPage(driver);

		//lp.popupmessage().click();
		lp.loginLink().click();

		Login l = new Login(driver);
		l.getUsername().sendKeys(username);
		l.getPassword().sendKeys(password);
		// System.out.println(text);

		l.getLoginButton().click();
	}

	@DataProvider
	public Object[][] getData() {

		Object[][] data = new Object[2][3];
		// always make sure that array size provided corectly as indexing start from 0
		// for 2 rows 3 columns.
		// row 0
		data[0][0] = "restricateduser@jh.com";
		data[0][1] = "22424242";
		data[0][2] = "invalidUser";

		// row 1

		data[1][0] = "unrestricated user";
		data[1][1] = "88787878";
		data[1][2] = "validUser";

		return data;
		
	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
