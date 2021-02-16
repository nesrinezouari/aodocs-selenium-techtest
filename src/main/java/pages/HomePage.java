package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import selenium.driver.Browser;
import selenium.driver.WebDriverUtility;

public class HomePage {
private WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public DemoPage DemoPage() {
		clicklink("Request a demo");
		return new DemoPage(driver);
	}
	
	
	private void clicklink(String link)
	{
		driver.findElement(By.xpath("//a[text()='"+link+"']")).click();
	}

	
	
}
