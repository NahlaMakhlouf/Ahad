package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import Pages.CompaniesPage;
import Pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;


public class TestBase {
	public WebDriver driver;
	LoginPage loginPage;
	CompaniesPage companiesPage;

	@BeforeSuite 
	public void beforeSuite() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ahad-fe.ahadtest.com/auth/login");
		//driver.get("https://prelive.ahadtest.com/auth/login");
		
	}
	
		
	
//	@AfterSuite
//	public void afterSuite() {
//		driver.quit();
//	}

}
