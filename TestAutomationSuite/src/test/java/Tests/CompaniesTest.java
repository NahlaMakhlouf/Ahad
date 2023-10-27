package Tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.LoginPage;
import Pages.CompaniesPage;

public class CompaniesTest extends TestBase {
	LoginPage loginPage;
	CompaniesPage companiesPage ;
	

	@BeforeClass
	public void beforeClass() {
		loginPage = new LoginPage(driver);
		companiesPage = new CompaniesPage(driver);

	}

	@BeforeMethod
	public void loginToAhad(){
    loginPage.login("nahlamakhlouf1@gmail.com", "123456");
}
	@Test
	public void browseYourCompanyAndAssertCompanyNameIsDisplayed() {
		companiesPage.browseCompany("Automation");
		Assert.assertTrue(companiesPage.isCompanyNameDisplayed("Automation"));
	}
}