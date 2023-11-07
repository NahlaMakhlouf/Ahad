package Tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.CompaniesPage;
import Pages.DashboardPage;
import Pages.LoginPage;
import Pages.SalesPage;

public class SalesTest extends TestBase {
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
		dashboardPage.openSalesModule();
	}
	@Test
	public void openAddNewSalesAndAssertPageTitle() {
		salespage.openAddNewSales();
		Assert.assertEquals(salespage.getAddNewSalesPageTitle(), "إضافة فاتورة مبيعات");
	}
	
	@Test
	public void addNewSalesDraftInvoice() throws InterruptedException {
		salespage.openAddNewSales();
		salespage.addNewDraftInvoice("01/11/2023","Nahla","product1", "SA_SA_S050");
	}
	
	@Test
	public void addNewSalesIssuedInvoice() throws InterruptedException {
		salespage.openAddNewSales();
		salespage.addNewIssuedInvoice("sales001","01/11/2023","Nahla","product1", "SA_SA_S050");
	}
	
	
	
	

}
