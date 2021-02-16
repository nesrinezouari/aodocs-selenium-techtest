package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GooglePage {

	private WebDriver driver;
	private By googlesearchfield = By.xpath("//input[@class='gLFyf gsfi']");

	public GooglePage(WebDriver driver) {
		this.driver = driver;
	}

	public HomePage HomePage() {
		driver.navigate().to("https://www.google.com");
		driver.switchTo().frame(0);
		var admi = driver.findElement(By.xpath("//span[contains(text(),'I agree')]"));
		admi.click();

		searchgoogle("AODocs");
		clicklink("www.aodocs.com");
		return new HomePage(driver);
	}

	private void clicklink(String string) {
		driver.findElement(By.xpath("//*[text()='"+ string +"']")).click();

	}

	public void searchgoogle(String string)

	{
		WebElement WebElement = driver.findElement(googlesearchfield);
		WebElement.sendKeys(string);
		WebElement.sendKeys(Keys.RETURN);
	}

}