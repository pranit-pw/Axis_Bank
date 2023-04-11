package Explore_Products_Tab;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
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

public class VerifyDepositsOption extends Base {
	
	WebDriver driver;
	LogInTab loginTab;
	ExploreProductTab exploreProductTab;
	AccountsOption accountOption;
	DepositsOption depositsOption;
	SoftAssert soft;
	
	
	@Parameters ("browser")
	@BeforeTest
	public void openBrowser(String browserName ) {
    	System.out.println("VerifyDepositsOption.Before Test");
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
		System.out.println("VerifyDepositsOption.Before Class");
		loginTab = new LogInTab(driver);
		exploreProductTab = new ExploreProductTab(driver);
		accountOption = new AccountsOption(driver);
		depositsOption = new DepositsOption(driver);
		soft = new SoftAssert();
	}
	
	
	@BeforeMethod
	public void launchApplication() {
		System.out.println("VerifyDepositsOption.Before Method");
		driver.get("https://www.axisbank.com/");
		loginTab.clickOnClosedAdsButton();
	}
	
	
	@Test (priority = 1)
	public void verifyAllTheOptionPresentInDepositsOption() {
		System.out.println("VerifyDepositsOption.Test 1");
		exploreProductTab.goToExploreProductTab();
		exploreProductTab.moveToDeposits();
		String actualOption1 = depositsOption.getTextOfDigitalFixedDeposit();
		String expectedOption1 = "Digital Fixed DepositNew";
		System.out.println(depositsOption.getTextOfDigitalFixedDeposit());
		String actualOption2 = depositsOption.getTextOfFixedDeposits();
		String expectedOption2 = "Fixed Deposits";
		System.out.println(depositsOption.getTextOfFixedDeposits());
		String actualOption3 = depositsOption.getTextOfRecurringDeposits();
		String expectedOption3 = "Recurring Deposits";
		System.out.println(depositsOption.getTextOfRecurringDeposits());
		String actualOption4 = depositsOption.getTextOfTaxSaverFixedDeposit();
		String expectedOption4 = "Tax Saver Fixed Deposit";
		System.out.println(depositsOption.getTextOfTaxSaverFixedDeposit());
		String actualOption5 = depositsOption.getTextOfFixedDepositPlus();
		String expectedOption5 = "Fixed Deposit Plus";
		System.out.println(depositsOption.getTextOfFixedDepositPlus());
		String actualOption6 = depositsOption.getTextOfAutoFixedDeposit();
		String expectedOption6 = "Auto Fixed Deposit";
		System.out.println(depositsOption.getTextOfAutoFixedDeposit());
		
		soft.assertEquals(actualOption1, expectedOption1);
		soft.assertEquals(actualOption2, expectedOption2);
		soft.assertEquals(actualOption3, expectedOption3);
		soft.assertEquals(actualOption4, expectedOption4);
		soft.assertEquals(actualOption5, expectedOption5);
		soft.assertEquals(actualOption6, expectedOption6);
		
		soft.assertAll();
		
	}
	
	
	@Test (priority = 2)
	public void verifyTheDigitalFixedDepositOptionPresentInDepositsOption() {
		System.out.println("VerifyDepositsOption.Test 2");
		exploreProductTab.goToExploreProductTab();
		exploreProductTab.moveToDeposits();
		depositsOption.clickOnDigitalFixedDeposit();
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://www.axisbank.com/retail/deposits/digital-fixed-deposit/features-benefits";
		System.out.println(driver.getCurrentUrl());
		
		soft.assertEquals(actualURL, expectedURL);
		soft.assertAll();
		
	}
	
	
	@Test (priority = 3)
	public void verifyTheFixedDepositsOptionPresentInDepositsOption() {
		System.out.println("VerifyDepositsOption.Test 3");
		exploreProductTab.goToExploreProductTab();
		exploreProductTab.moveToDeposits();
		depositsOption.clickOnFixedDeposits();
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://www.axisbank.com/retail/deposits/fixed-deposits";
		System.out.println(driver.getCurrentUrl());
		
		soft.assertEquals(actualURL, expectedURL);
		soft.assertAll();
		
	}
	
	@Test (priority = 4)
	public void verifyTheRecurringDepositsOptionPresentInDepositsOption() {
		System.out.println("VerifyDepositsOption.Test 4");
		exploreProductTab.goToExploreProductTab();
		exploreProductTab.moveToDeposits();
		depositsOption.clickOnRecurringDeposits();
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://www.axisbank.com/retail/deposits/recurring-deposits";
		System.out.println(driver.getCurrentUrl());
		
		soft.assertEquals(actualURL, expectedURL);
		soft.assertAll();
		
	}
	
	@Test (priority = 5)
	public void verifyTheTaxSaverFixedDepositOptionPresentInDepositsOption() {
		System.out.println("VerifyDepositsOption.Test 5");
		exploreProductTab.goToExploreProductTab();
		exploreProductTab.moveToDeposits();
		depositsOption.clickOnTaxSaverFixedDeposit();
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://www.axisbank.com/retail/deposits/tax-saver-fixed-deposit";
		System.out.println(driver.getCurrentUrl());
		
		soft.assertEquals(actualURL, expectedURL);
		soft.assertAll();
		
	}
	
	@Test (priority = 6)
	public void verifyTheFixedDepositPlusOptionPresentInDepositsOption() {
		System.out.println("VerifyDepositsOption.Test 6");
		exploreProductTab.goToExploreProductTab();
		exploreProductTab.moveToDeposits();
		depositsOption.clickOnFixedDepositPlus();
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://www.axisbank.com/retail/deposits/fixed-deposit-plus";
		System.out.println(driver.getCurrentUrl());
		
		soft.assertEquals(actualURL, expectedURL);
		soft.assertAll();
		
	}
	
	@Test (priority = 7)
	public void verifyTheAutoFixedDepositOptionPresentInDepositsOption() {
		System.out.println("VerifyDepositsOption.Test 7");
		exploreProductTab.goToExploreProductTab();
		exploreProductTab.moveToDeposits();
		depositsOption.clickOnAutoFixedDeposit();
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://www.axisbank.com/retail/deposits/auto-fixed-deposit";
		System.out.println(driver.getCurrentUrl());
		
		soft.assertEquals(actualURL, expectedURL);
		soft.assertAll();
		
	}
	
	@AfterMethod
	public void logOutFromApplication() {
		System.out.println("After Method");
	}
	
	@AfterClass
	public void clearObject() {
		System.out.println("After Class");
		loginTab = null;
		exploreProductTab = null;
		accountOption = null;
		depositsOption = null;
		soft = null;
	}
	
	@AfterTest
	public void closedTheBrowser() {
		System.out.println("After Test");
		driver.quit();
		driver = null;
		System.gc();
	}
	
	
	

}
