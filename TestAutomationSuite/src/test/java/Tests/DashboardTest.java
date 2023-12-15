package Tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.CompaniesPage;
import Pages.DashboardPage;
import Pages.LoginPage;
import Pages.SalesPage;

public class DashboardTest extends TestBase{
	LoginPage loginPage;
	CompaniesPage companiesPage ;
	DashboardPage dashboardPage;
	SalesPage salespage;
	

	@BeforeClass
	public void beforeClass() {
		loginPage = new LoginPage(driver);
		companiesPage = new CompaniesPage(driver);
		dashboardPage = new DashboardPage(driver);
		salespage = new SalesPage(driver);
		

	}
	@BeforeMethod
	public void loginAndGoToCompanyDashboard(){
		loginPage.login("nahlamakhlouf1@gmail.com", "123456");
		companiesPage.goToCompanyDashboard("Automation");
	}
	@Test
	public void openSalesModule() {
		dashboardPage.openSalesModule();
		Assert.assertEquals(salespage.getPageTitle(), "فواتير المبيعات");
				
	}

}
