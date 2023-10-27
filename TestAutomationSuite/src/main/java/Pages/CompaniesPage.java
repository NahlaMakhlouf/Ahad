package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CompaniesPage extends PageBase{

	public CompaniesPage(WebDriver driver) {
		super(driver);
		
	}
	private By welcomeBackToaster = By.xpath("//div[@class='Toastify__toast-icon Toastify--animate-icon Toastify__zoom-enter']");
//	private By companiesTab = By.xpath("//a[@class='nav-link text-active-primary me-6 active']");
	
	public boolean isWelcomeBackToasterDisplayed() {
		 driverWait.until(ExpectedConditions.visibilityOfElementLocated(welcomeBackToaster));
		 return true;
	}
	
	public void browseCompany(String company_Name) {
		driverWait.until(ExpectedConditions.visibilityOfElementLocated(
						By.xpath("//div[@class='pt-10 fs-2'][text()='" + company_Name + "']")))
				.click();

	}
	public boolean isCompanyNameDisplayed(String company_Name) {
		driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='" + company_Name + "']")));
		return true;
	}

}
 