package Pages;
//variables
//locators
//constructor
//actions

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends PageBase {

	public LoginPage(WebDriver driver) {
		super(driver);	
	}
	
	private By email_Input = By.id("email_input");
	private By password_Input = By.id("password_input");
	private By login_Btn = By.id("kt_sign_in_submit");
	
	
	public void login(String email , String password) {
		
	driver.findElement(email_Input).sendKeys(email);
	driver.findElement(password_Input).sendKeys(password);
	driver.findElement(login_Btn).click();

	
}
	
	

}
