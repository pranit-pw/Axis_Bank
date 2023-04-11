package Explore_Products_Tab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DepositsOption {
	
	
	//Variable Dclaration
	@FindBy(xpath = "((//div[@class='sLevel js-sLevel'])[1]//li)[14]//a")
	private WebElement digitalFixedDeposit;
	
	@FindBy(xpath = "((//div[@class='sLevel js-sLevel'])[1]//li)[15]//a")
	private WebElement fixedDeposits;
	
	@FindBy(xpath = "((//div[@class='sLevel js-sLevel'])[1]//li)[16]//a")
	private WebElement recurringDeposits;
	
	@FindBy(xpath = "((//div[@class='sLevel js-sLevel'])[1]//li)[17]//a")
	private WebElement taxSaverFixedDeposit;
	
	@FindBy(xpath = "((//div[@class='sLevel js-sLevel'])[1]//li)[18]//a")
	private WebElement fixedDepositPlus;
	
	@FindBy(xpath = "((//div[@class='sLevel js-sLevel'])[1]//li)[19]//a")
	private WebElement autoFixedDeposit;
	
	private WebDriver driver;
	
	//Variable Initialization
	public DepositsOption(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	
	//Variable Use
	//Methods For get Text of Options
	public String getTextOfDigitalFixedDeposit() {
		String text = digitalFixedDeposit.getText();
		return text;
	}
	
	public String getTextOfFixedDeposits() {
		String text = fixedDeposits.getText();
		return text;
	}
	
	public String getTextOfRecurringDeposits() {
		String text = recurringDeposits.getText();
		return text;
	}
	
	public String getTextOfTaxSaverFixedDeposit() {
		String text = taxSaverFixedDeposit.getText();
		return text;
	}
	
	public String getTextOfFixedDepositPlus() {
		String text = fixedDepositPlus.getText();
		return text;
	}
	
	public String getTextOfAutoFixedDeposit() {
		String text = autoFixedDeposit.getText();
		return text;
	}
	
	
	
	//Methods for Click on option
	public void clickOnDigitalFixedDeposit() {
		digitalFixedDeposit.click();
	}
	
	public void clickOnFixedDeposits() {
		fixedDeposits.click();
	}
	
	public void clickOnRecurringDeposits() {
		recurringDeposits.click();
	}
	
	public void clickOnTaxSaverFixedDeposit() {
		taxSaverFixedDeposit.click();
	}
	
	public void clickOnFixedDepositPlus() {
		fixedDepositPlus.click();
	}
	
	public void clickOnAutoFixedDeposit() {
		autoFixedDeposit.click();
	}
	
}
