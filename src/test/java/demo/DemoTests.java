package demo;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import base.BasesTests;
import pages.DemoPage;

public class DemoTests extends BasesTests {

	private DemoPage demopage;
	private String firstname = "nesrine";
	private int length = 10;
	private boolean useLetters = true;
	private boolean useNumbers = false;
	private String generatedmail = RandomStringUtils.random(length, useLetters, useNumbers);
	private static final String expectederrormsglastname = "Please complete this required field.";
	private static final String expectederrormsgemail = "Email must be formatted correctly.";
	private static final String expectederrormsgcompany = "Please complete this required field.";
	private static final String expectederrormsgcountry = "Please select an option from the dropdown menu.";
	private static final String expectederrormsgrequest = "Please complete this required field.";
	private static final String expectederrormsghearabout = "Please select an option from the dropdown menu.";
	private static final String expectederrormsgform = "Please complete all required fields.";
	private static final String companysize = "0-4 employees";

	@Test
	public void demotest() {
		demopage = homepage.DemoPage();
		demopage.setfirstname(firstname);
		demopage.setlastname(" ");
		demopage.setemail(generatedmail);
		demopage.selectcampanysize(companysize);

		String actualerrormsgemail = demopage.getlastemailerrormsg();
		Assertions.assertEquals(expectederrormsgemail, actualerrormsgemail);
		String actualerrormsglasname = demopage.getlastnameerrormsg();
		Assertions.assertEquals(expectederrormsglastname, actualerrormsglasname);
		demopage.submitform();
		String actualerrormsgcompany = demopage.getcompanyerrormsg();
		Assertions.assertEquals(expectederrormsgcompany, actualerrormsgcompany);
		String actualerrormsgcountry = demopage.getcountryerrormsg();
		Assertions.assertEquals(expectederrormsgcountry, actualerrormsgcountry);
		String actualerrormsgrequest = demopage.getrequesterrormsg();
		Assertions.assertEquals(expectederrormsgrequest, actualerrormsgrequest);
		String actualerrormsghearabout = demopage.gethearabouterrormsg();
		Assertions.assertEquals(expectederrormsghearabout, actualerrormsghearabout);
		String actualerrormsgform = demopage.getformerrormsg();
		Assertions.assertEquals(expectederrormsgform, actualerrormsgform);

	}

}
