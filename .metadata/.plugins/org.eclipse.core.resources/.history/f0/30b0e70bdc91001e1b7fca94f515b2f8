package Tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import Pages.LoginPage;
import Utils.ExcelDataProvider;
import Pages.CompaniesPage;
import Pages.DashboardPage;

public class CompaniesTest extends TestBase {
	LoginPage loginPage;
	CompaniesPage companiesPage ;
	DashboardPage dashboardPage;
	

	@BeforeClass
	public void beforeClass() {
		loginPage = new LoginPage(driver);
		companiesPage = new CompaniesPage(driver);
		dashboardPage = new DashboardPage(driver);

	}
	@BeforeMethod
	public void loginToAhad(){
		loginPage.login("nahlamakhlouf1@gmail.com", "123456");
}
	@Test 
	public void goToCompanyDashboardAndAssertCompanyNameIsDisplayed() {
		companiesPage.goToCompanyDashboard("Automation");
		Assert.assertTrue(dashboardPage.isCompanyNameDisplayed("Automation"));
	}
}