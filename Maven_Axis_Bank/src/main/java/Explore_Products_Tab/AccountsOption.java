package Explore_Products_Tab;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountsOption {
	
	@FindBy (xpath = "((//div[@class='sLevel js-sLevel'])[1]//a)[1]")
	private WebElement savingAcccount;
	
	@FindBy (xpath = "((//div[@class='sLevel js-sLevel'])[1]//a)[2]")
	private WebElement silverLiningsProgram;
	
	@FindBy (xpath = "((//div[@class='sLevel js-sLevel'])[1]//a)[3]")
	private WebElement salaryAccount;
	
	@FindBy (xpath = "((//div[@class='sLevel js-sLevel'])[1]//a)[4]")
	private WebElement trustNgoSavingsAccount;
	
	@FindBy (xpath = "((//div[@class='sLevel js-sLevel'])[1]//a)[5]")
	private WebElement currentAccount;
	
	@FindBy (xpath = "((//div[@class='sLevel js-sLevel'])[1]//a)[6]")
	private WebElement publicProvidentFund;
	
	@FindBy (xpath = "((//div[@class='sLevel js-sLevel'])[1]//a)[7]")
	private WebElement axisDirectInvestAccount;
	
	@FindBy (xpath = "((//div[@class='sLevel js-sLevel'])[1]//a)[8]")
	private WebElement safeDepositLocker;
	
	@FindBy (xpath = "((//div[@class='sLevel js-sLevel'])[1]//a)[9]")
	private WebElement safeCustody;
	
	@FindBy (xpath = "((//div[@class='sLevel js-sLevel'])[1]//a)[10]")
	private WebElement pensionDisbursementAccount;
	
	@FindBy (xpath = "((//div[@class='sLevel js-sLevel'])[1]//a)[11]")
	private WebElement axisActive;
	
	@FindBy (xpath = "((//div[@class='sLevel js-sLevel'])[1]//a)[12]")
	private WebElement Pmjdy;
	
	private WebDriver driver;
//	private Actions action;
	private ArrayList<String> arrayList;
	
	//Variable Initialization
	public AccountsOption(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
//		action = new Actions(driver);
	}
	


	//Variable Use
   //Method For Click on Element	
	public void clickOnSavingAcccount() {
		savingAcccount.click();
	}
	
	public void clickOnSilverLiningsProgram() {
		silverLiningsProgram.click();
	}
	
	public void clickOnSalaryAccount() {
		salaryAccount.click();
	}
	
	public void clickOnTrustNgoSavingsAccount() {
		trustNgoSavingsAccount.click();
	}
	
	public void clickOnCurrentAccount() {
		currentAccount.click();
	}
	
	public void clickOnPublicProvidentFund() {
		publicProvidentFund.click();
	}
	
	public void clickOnAxisDirectInvestAccount() {
		axisDirectInvestAccount.click();
	}
	
	public void clickOnSafeDepositLocker() {
		safeDepositLocker.click();
	}
	
	public void clickOnSafeCustody() {
		safeCustody.click();
	}
	
	public void clickOnPensionDisbursementAccount() {
		pensionDisbursementAccount.click();
	}
	
	public void clickOnAxisActive() {
		axisActive.click();
	}
	
	public void clickOnPMJDY() {
		Pmjdy.click();
	}
	
	
	//Method For Get Text from options
	public String getTextOfSavingAcccount() {
		String text = savingAcccount.getText();
		return text;
	}
	
	public String getTextOfSilverLiningsProgram() {
		String text = silverLiningsProgram.getText();
		return text;
	}
	
	public String getTextOfSalaryAccount() {
		String text = salaryAccount.getText();
		return text;
	}
	
	public String getTextOfTrustNgoSavingsAccount() {
		String text = trustNgoSavingsAccount.getText();
		return text;
	}
	
	public String getTextOfCurrentAccount() {
		String text = currentAccount.getText();
		return text;
	}
	
	public String getTextOfPublicProvidentFund() {
		String text = publicProvidentFund.getText();
		return text;
	}
	
	public String getTextOfAxisDirectInvestAccount() {
		String text = axisDirectInvestAccount.getText();
		return text;
	}
	
	public String getTextOfSafeDepositLocker() {
		String text = safeDepositLocker.getText();
		return text;
	}
	
	public String getTextOfSafeCustody() {
		String text = safeCustody.getText();
		return text;
	}
	
	public String getTextOfPensionDisbursementAccount() {
		String text = pensionDisbursementAccount.getText();
		return text;
	}
	
	public String getTextOfAxisActive() {
		String text = axisActive.getText();
		return text;
	}
	
	public String getTextOfPMJDY() {
		String text = Pmjdy.getText();
		return text;
	}
	
	public void switchToChildBrowser() {
		arrayList = new ArrayList<String>(driver.getWindowHandles());
	    driver.switchTo().window(arrayList.get(1));
	}
	
	
	public void switchToParentBrowser() {
		arrayList = new ArrayList<String>(driver.getWindowHandles());
	    driver.switchTo().window(arrayList.get(0));
	}
	
	
	
	
	
	

}
