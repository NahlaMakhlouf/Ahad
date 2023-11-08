package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SalesPage extends PageBase {

	public SalesPage(WebDriver driver) {
		super(driver);
	}

	private By salesPageTitle = By.xpath("//h1[@class='d-flex  align-items-center text-dark fw-bolder my-1 fs-3']");
	private By addNewSalesPageTitle = By.xpath("//div[@class=\"d-flex justify-content-center px-10 py-3 fs-6 \"] ");
	private By actionsBtn = By.id("actionsButton");
	private By addNewSalesBtn = By.id("add-sale-button");

	private By invoiceStatusToggle = By.id("invoice_status");
	private By invoiceNumberField = By.id("invoice number");
	private By invoiceDateField = By.id("invoice_date_id");
	private By paymentDateField = By.id("payment_date_id");
	private By clientField = By.xpath("//input[@id ='react-select-2-input']");
	private By productField = By.xpath("//input[@id ='react-select-3-input']");
	private By vatRateField = By.xpath("//input[@id ='react-select-8-input']");
	private By saveAsDraftBtn = By.id("save_button");
	private By saveIssuedInvoiceBtn = By.id("approve_button");
	private By approveBtn = By.id("modal_approve");

	public String getPageTitle() {
		return driverWait.until(ExpectedConditions.visibilityOfElementLocated(salesPageTitle)).getText();
	}

	public void openAddNewSales() {
		driverWait.until(ExpectedConditions.visibilityOfElementLocated(actionsBtn)).click();
		driverWait.until(ExpectedConditions.elementToBeClickable(addNewSalesBtn)).click();

	}

	public String getAddNewSalesPageTitle() {
		return driverWait.until(ExpectedConditions.visibilityOfElementLocated(addNewSalesPageTitle)).getText();
	}

	public void addNewDraftInvoice(String invoiceDate, String client, String product, String vatRate)
			throws InterruptedException {
		driver.findElement(invoiceDateField).sendKeys(invoiceDate);
		driver.findElement(invoiceDateField).sendKeys(Keys.ENTER);

		driver.findElement(clientField).sendKeys(client);
		Thread.sleep(2000);
		driver.findElement(clientField).sendKeys(Keys.ENTER);

		driver.findElement(productField).sendKeys(product);
		Thread.sleep(3000);
		driver.findElement(productField).sendKeys(Keys.ENTER);

		driver.findElement(vatRateField).sendKeys(vatRate);
		Thread.sleep(3000);
		driver.findElement(vatRateField).sendKeys(Keys.ENTER);

		driver.findElement(saveAsDraftBtn).click();
	}
	
	public void addNewIssuedInvoice(String invoiceNumber,String invoiceDate, String client, String product, String vatRate)
			throws InterruptedException {
		driverWait.until(ExpectedConditions.visibilityOfElementLocated(invoiceStatusToggle)).click();
		driverWait.until(ExpectedConditions.elementToBeClickable(invoiceNumberField)).sendKeys(invoiceNumber);
		driver.findElement(invoiceDateField).sendKeys(invoiceDate);
		driver.findElement(invoiceDateField).sendKeys(Keys.ENTER);
		driver.findElement(clientField).sendKeys(client);
		Thread.sleep(2000);
		driver.findElement(clientField).sendKeys(Keys.ENTER);
		driver.findElement(productField).sendKeys(product);
		Thread.sleep(3000);
		driver.findElement(productField).sendKeys(Keys.ENTER);
		driver.findElement(vatRateField).sendKeys(vatRate);
		Thread.sleep(3000);
		driver.findElement(vatRateField).sendKeys(Keys.ENTER);
		driver.findElement(saveIssuedInvoiceBtn).click();
		driverWait.until(ExpectedConditions.elementToBeClickable(approveBtn)).click();
	}

}
