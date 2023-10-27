package Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageBase {
	public WebDriver driver ;
	public Actions action;
	public WebDriverWait driverWait ;
	
	public PageBase( WebDriver driver ) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

		action= new Actions(driver);
		driverWait = new WebDriverWait(driver, Duration.ofSeconds(240));
		
		
	}

}
