package Explore_Products_Tab;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Browser_Setup.Base;
import Log_In_Function.LogInTab;
import Personal_Tabs.ExploreProductTab;
import Utils.Utility;

public class VerifyAccountsOption extends Base {
	
	WebDriver driver;
	LogInTab loginTab;
	AccountsOption accountOption;
	ExploreProductTab exploreProductTab;
	SoftAssert soft;
	String testId;
	
	
	@Parameters ("browser")
	@BeforeTest
	public void openBrowser(String browserName ) {
    	System.out.println("VerifyAccountsOption.Before Test");
    	
    	if(browserName.equals("Chrome"))
    	{
    		driver = openChromeBrowser();
    	}
    	
    	if(browserName.equals("Firefox"))
    	{
    		driver = openFirefoxBrowser();
    	}
    	
    	if(browserName.equals("Edge"))
    	{
    		driver = openEdgeBrowser();
    	}
    	
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS) ;
	}
	
	
	@BeforeClass
	public void createPomObject() {
		System.out.println("VerifyAccountsOption.Before Class");
		loginTab = new LogInTab(driver);
		exploreProductTab = new ExploreProductTab(driver);
		accountOption = new AccountsOption(driver);
		soft = new SoftAssert();
	}
	
	@BeforeMethod
	public void launchWebApplication() {
		System.out.println("Before Method");
		driver.get("https://www.axisbank.com/");
		loginTab.clickOnClosedAdsButton();
	}
	
	
	@Test (priority = 1)
	public void verifyAllTheOptionsPresentInAccountsOption() {
		testId = "Test101";
		System.out.println("VerifyAccountsOption.Test 1");
		exploreProductTab.goToExploreProductTab();
		exploreProductTab.moveToAccounts();
		String actualOption1 = accountOption.getTextOfSavingAcccount();
		String expectedOption1 = "Savings Account";
		System.out.println(accountOption.getTextOfSavingAcccount());
		String actualOption2 = accountOption.getTextOfSilverLiningsProgram();
		String expectedOption2 = "Silver Linings ProgramNew";
		System.out.println(accountOption.getTextOfSilverLiningsProgram());
		String actualOption3 = accountOption.getTextOfSalaryAccount();
		String expectedOption3 = "Salary Account";
		System.out.println(accountOption.getTextOfSalaryAccount());
		String actualOption4 = accountOption.getTextOfTrustNgoSavingsAccount();
		String expectedOption4 = "Trust/ NGO Savings Account";
		System.out.println(accountOption.getTextOfTrustNgoSavingsAccount());
		String actualOption5 = accountOption.getTextOfCurrentAccount();
		String expectedOption5 = "Current Account";
		System.out.println(accountOption.getTextOfCurrentAccount());
		String actualOption6 = accountOption.getTextOfPublicProvidentFund();
		String expectedOption6 = "Public Provident Fund (PPF)New";
		System.out.println(accountOption.getTextOfPublicProvidentFund());
		String actualOption7 = accountOption.getTextOfAxisDirectInvestAccount();
		String expectedOption7 = "AxisDirect Invest Account";
		System.out.println(accountOption.getTextOfAxisDirectInvestAccount());
		String actualOption8 = accountOption.getTextOfSafeDepositLocker();
		String expectedOption8 = "Safe Deposit Locker";
		System.out.println(accountOption.getTextOfSafeDepositLocker());
		String actualOption9 = accountOption.getTextOfSafeCustody();
		String expectedOption9 = "Safe Custody";
		System.out.println(accountOption.getTextOfSafeCustody());
		String actualOption10 = accountOption.getTextOfPensionDisbursementAccount();
		String expectedOption10 = "Pension Disbursement Account";
		System.out.println(accountOption.getTextOfPensionDisbursementAccount());
		String actualOption11 = accountOption.getTextOfAxisActive();
		String expectedOption11 = "Axis Active";
		System.out.println(accountOption.getTextOfAxisActive());
		String actualOption12 = accountOption.getTextOfPMJDY();
		String expectedOption12 = "PMJDY";
		System.out.println(accountOption.getTextOfPMJDY());
		
		soft.assertEquals(actualOption1, expectedOption1);
		soft.assertEquals(actualOption2, expectedOption2);
		soft.assertEquals(actualOption3, expectedOption3);
		soft.assertEquals(actualOption4, expectedOption4);
		soft.assertEquals(actualOption5, expectedOption5);
		soft.assertEquals(actualOption6, expectedOption6);
		soft.assertEquals(actualOption7, expectedOption7);
		soft.assertEquals(actualOption8, expectedOption8);
		soft.assertEquals(actualOption9, expectedOption9);
		soft.assertEquals(actualOption10, expectedOption10);
		soft.assertEquals(actualOption11, expectedOption11);
		soft.assertEquals(actualOption12, expectedOption12);
		
		soft.assertAll();
		
	}
	
	@Test (priority = 2)
	public void verifyTheSavingAccountOptionPresentInAccountsOption() {
		testId = "Test102";
		System.out.println("VerifyAccountsOption.Test 2");
		exploreProductTab.goToExploreProductTab();
		exploreProductTab.moveToAccounts();
		accountOption.clickOnSavingAcccount();
		String actualURL = driver.getCurrentUrl();
		String expextedURL = "https://www.axisbank.com/retail/accounts/savings-account";
		System.out.println(driver.getCurrentUrl());
		
		soft.assertEquals(actualURL, expextedURL);
		soft.assertAll();
	}
	
	@Test (priority = 3)
	public void verifyTheSilverLiningsProgramOptionPresentInAccountsOption() {
		testId = "Test103";
		System.out.println("VerifyAccountsOption.Test 3");
		exploreProductTab.goToExploreProductTab();
		exploreProductTab.moveToAccounts();
		accountOption.clickOnSilverLiningsProgram();
		String actualURL = driver.getCurrentUrl();
		String expextedURL = "https://www.axisbank.com/silver-linings-program?cta=homepage-main-menu-silver-linings-program";
		System.out.println(driver.getCurrentUrl());
		
		soft.assertEquals(actualURL, expextedURL);
		soft.assertAll();
	}
	
	
	@Test (priority = 4)
	public void verifyTheSalaryAccountOptionPresentInAccountsOption() {
		testId = "Test104";
		System.out.println("VerifyAccountsOption.Test 4");
		exploreProductTab.goToExploreProductTab();
		exploreProductTab.moveToAccounts();
		accountOption.clickOnSalaryAccount();
		String actualURL = driver.getCurrentUrl();
		String expextedURL = "https://www.axisbank.com/retail/accounts/salary-account";
		System.out.println(driver.getCurrentUrl());
		
		soft.assertEquals(actualURL, expextedURL);
		soft.assertAll();
	}
	
	
	@Test (priority = 5)
	public void verifyTheTrustNgoSavingsAccountOptionPresentInAccountsOption() {
		testId = "Test105";
		System.out.println("VerifyAccountsOption.Test 5");
		exploreProductTab.goToExploreProductTab();
		exploreProductTab.moveToAccounts();
		accountOption.clickOnTrustNgoSavingsAccount();
		String actualURL = driver.getCurrentUrl();
		String expextedURL = "https://www.axisbank.com/retail/accounts/trust-ngo-institutional-savings-account";
		System.out.println(driver.getCurrentUrl());
		
		soft.assertEquals(actualURL, expextedURL);
		soft.assertAll();
	}
	
	
	@Test (priority = 11)
	public void verifyTheCurrentAccountOptionPresentInAccountsOption() {
		testId = "Test106";
		System.out.println("VerifyAccountsOption.Test 6");
		exploreProductTab.goToExploreProductTab();
		exploreProductTab.moveToAccounts();
		accountOption.clickOnCurrentAccount();
		String actualURL = driver.getCurrentUrl();
		String expextedURL = "https://www.axisbank.com/business-banking/current-account";
		System.out.println(driver.getCurrentUrl());
		
		soft.assertEquals(actualURL, expextedURL);
		
		driver.navigate().back();
		soft.assertAll();
	}
	
	
	@Test (priority = 7)
	public void verifyThePublicProvidentFundOptionPresentInAccountsOption() {
		testId = "Test107";
		System.out.println("VerifyAccountsOption.Test 7");
		exploreProductTab.goToExploreProductTab();
		exploreProductTab.moveToAccounts();
		accountOption.clickOnPublicProvidentFund();
		String actualURL = driver.getCurrentUrl();
		String expextedURL = "https://www.axisbank.com/retail/investment/public-provident-fund-ppf?cta=accounts-megamenu";
		System.out.println(driver.getCurrentUrl());
		
		soft.assertEquals(actualURL, expextedURL);
		soft.assertAll();
	}
	
	
	@Test (priority = 12)
	public void verifyTheAxisDirectInvestAccountOptionPresentInAccountsOption() {
		testId = "Test108";
		System.out.println("VerifyAccountsOption.Test 8");
		exploreProductTab.goToExploreProductTab();
		exploreProductTab.moveToAccounts();
		accountOption.clickOnAxisDirectInvestAccount();
		accountOption.switchToChildBrowser();
		String actualURL = driver.getCurrentUrl();
		String expextedURL = "https://digitalaccount.axisdirect.in/register";
		System.out.println(driver.getCurrentUrl());
		
		soft.assertEquals(actualURL, expextedURL);
		
		driver.close();
		accountOption.switchToParentBrowser();

		soft.assertAll();
	}
	
	
	@Test (priority = 9)
	public void verifyTheSafeDepositLockerOptionPresentInAccountsOption() {
		testId = "Test109";
		System.out.println("VerifyAccountsOption.Test 9");
		exploreProductTab.goToExploreProductTab();
		exploreProductTab.moveToAccounts();
		accountOption.clickOnSafeDepositLocker();
		String actualURL = driver.getCurrentUrl();
		String expextedURL = "https://www.axisbank.com/retail/accounts/safe-deposit-locker/features-benefits";
		System.out.println(driver.getCurrentUrl());
		
		soft.assertEquals(actualURL, expextedURL);
		soft.assertAll();
	}
	
	
	@Test (priority = 10)
	public void verifyTheSafeCustodyOptionPresentInAccountsOption() {
		testId = "Test110";
		System.out.println("VerifyAccountsOption.Test 10");
		exploreProductTab.goToExploreProductTab();
		exploreProductTab.moveToAccounts();
		accountOption.clickOnSafeCustody();
		String actualURL = driver.getCurrentUrl();
		String expextedURL = "https://www.axisbank.com/retail/accounts/safe-custody";
		System.out.println(driver.getCurrentUrl());
		
		soft.assertEquals(actualURL, expextedURL);
		soft.assertAll();
	}
	
	
	@Test(priority = 6)
	public void verifyThePensionDisbursementAccountOptionPresentInAccountsOption() {
		testId = "Test111";
		System.out.println("VerifyAccountsOption.Test 11");
		exploreProductTab.goToExploreProductTab();
		exploreProductTab.moveToAccounts();
		accountOption.clickOnPensionDisbursementAccount();
		String actualURL = driver.getCurrentUrl();
		String expextedURL = "https://www.axisbank.com/retail/accounts/pension-disbursement-account";
		System.out.println(driver.getCurrentUrl());
		
		soft.assertEquals(actualURL, expextedURL);
		soft.assertAll();
	}
	
	
	@Test (priority = 13)
	public void verifyTheAxisActiveOptionPresentInAccountsOption() {
		testId = "Test112";
		System.out.println("VerifyAccountsOption.Test 12");
		exploreProductTab.goToExploreProductTab();
		exploreProductTab.moveToAccounts();
		accountOption.clickOnAxisActive();
		String actualURL = driver.getCurrentUrl();
		String expextedURL = "https://www.axisbank.com/axisactive/index";
		System.out.println(driver.getCurrentUrl());
		
		soft.assertEquals(actualURL, expextedURL);
		
		driver.navigate().back();
		soft.assertAll();
	}
	
	
	@Test (priority = 8)
	public void verifyThePMJDYOptionPresentInAccountsOption() {
		testId = "Test113";
		System.out.println("VerifyAccountsOption.Test 13");
		exploreProductTab.goToExploreProductTab();
		exploreProductTab.moveToAccounts();
		accountOption.clickOnPMJDY();
		String actualURL = driver.getCurrentUrl();
		String expextedURL = "https://www.axisbank.com/retail/accounts/savings-account/pradhan-mantri-jan-dhan-yojana-(pmjdy)/features-benefits";
		System.out.println(driver.getCurrentUrl());
		
		soft.assertEquals(actualURL, expextedURL);
		soft.assertAll();
	}
	
	
	@AfterMethod
	public void logOutFromApplication(ITestResult result) throws WebDriverException, IOException, InterruptedException {
		System.out.println("VerifyAccountsOption.After Method");
		
		if(ITestResult.FAILURE == result.getStatus())
		{
			Utility.captureScreen(driver, testId);
		}
	}
	
	
	@AfterClass
	public void clearObject() {
		System.out.println("VerifyAccountsOption.Afetr Class");
		loginTab = null;
		exploreProductTab = null;
		accountOption = null;
		soft = null;
	}
	
	
	@AfterTest
    public void closedTheBrowser() {
    	System.out.println("VerifyAccountsOption.Afetr Test");
    	driver.quit();
    	driver = null;
    	System.gc();
    }
}
