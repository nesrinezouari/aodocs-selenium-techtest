package base;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.openqa.selenium.WebDriver;

import pages.GooglePage;
import pages.HomePage;
import selenium.driver.Browser;
import selenium.driver.WebDriverUtility;

@TestInstance(Lifecycle.PER_CLASS)
public class BasesTests {

	private WebDriver webdriver;
	protected HomePage homepage;
	protected GooglePage googlepage;

	@BeforeAll
	public void setup() throws InterruptedException {
		WebDriverUtility wbdriverutility = new WebDriverUtility();
		this.webdriver = wbdriverutility.getWebDriver(Browser.CHROME);
		googlepage = new GooglePage(webdriver);
		homepage = googlepage.HomePage();
	}

	@BeforeEach
	public void gohome() {

	}

}
