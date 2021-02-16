package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoPage {

	private WebDriver driver;
	private By firstnamefield= By.id("firstname-384ed391-59a1-4016-bc91-62bb1307edb2_9710");
	private By lastnamefield= By.id("lastname-384ed391-59a1-4016-bc91-62bb1307edb2_9710");
	private By emailfield=By.id("email-384ed391-59a1-4016-bc91-62bb1307edb2_9710");
	private By companysizefield=By.id("company_size__c-384ed391-59a1-4016-bc91-62bb1307edb2_9710");
	private By submitbutton=By.xpath("//input[@class='hs-button primary large']");
	
	private By lastnameerrormsg=By.xpath("//label[@data-reactid='.hbspt-forms-0.1:$0.1:$lastname.3.$0.0']");
	private By emailerrormsg=By.xpath("//label[@data-reactid='.hbspt-forms-0.1:$1.1:$email.3.$0.0']");
	private By companynameerrormsg=By.xpath("//label[@data-reactid='.hbspt-forms-0.1:$2.1:$company.3.$0.0']");
	private By countryerrormsg=By.xpath("//label[@data-reactid='.hbspt-forms-0.1:$3.1:$country.3.$0.0']");
	private By requesterrormsg=By.xpath("//label[@data-reactid='.hbspt-forms-0.1:$5.1:$your_request__c.3.$0.0']");
	private By hearabouterrormsg=By.xpath("//label[@data-reactid='.hbspt-forms-0.1:$6.1:$how_did_you_hear_about_us_.3.$0.0']");
	private By formerrormsg= By.xpath("//label[@data-reactid='.hbspt-forms-0.4.0.0.0']");
	
	public  DemoPage(WebDriver driver)
	{
		this.driver= driver;
	}
	
	public void setfirstname(String username)
	{
		findElementafterwait(firstnamefield).sendKeys(username);
	}

	public void setlastname(String lastname) {
		findElementafterwait(lastnamefield).sendKeys(lastname);
		
	}
	public void setemail(String email) {
		findElementafterwait(emailfield).sendKeys(email);
		
	}
	public String getlastnameerrormsg() {
		String text=findElementafterwait(lastnameerrormsg).getAttribute("innerText");
		return text;
		
	}

	public String getlastemailerrormsg() {
		String text=findElementafterwait(emailerrormsg).getAttribute("innerText");
		return text;
	}
	
	public void selectcampanysize(String option)
	{
	Select dropdownelement = finddropdownelement();
	dropdownelement.selectByVisibleText(option);
	}
	
	public String getcompanyerrormsg() {
		String text=findElementafterwait(companynameerrormsg).getAttribute("innerText");
		return text;
	}
	public String getcountryerrormsg() {
		String text=findElementafterwait(countryerrormsg).getAttribute("innerText");
		return text;
	}
	public String getrequesterrormsg() {
		String text=findElementafterwait(requesterrormsg).getAttribute("innerText");
		return text;
	}
	public String gethearabouterrormsg() {
		String text=findElementafterwait(hearabouterrormsg).getAttribute("innerText");
		return text;
	}
	public String getformerrormsg() {
		String text=findElementafterwait(formerrormsg).getAttribute("innerText");
		return text;
	}
	private Select finddropdownelement()
	{
		 return new Select(findElementafterwait(companysizefield));
	}
	public void submitform()
	{
		findElementafterwait(submitbutton).sendKeys(Keys.ENTER);
	}

	public WebElement findElementafterwait(By element)
	{
		  WebDriverWait w = new WebDriverWait(driver,3);
	      // presenceOfElementLocated condition
	      w.until(ExpectedConditions.presenceOfElementLocated (element));
	     WebElement wbelement= driver.findElement(element);
	      return wbelement;
		
	}
	

	
}
