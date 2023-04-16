package Home_Page;

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

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Browser_Setup.Base;
import Log_In_Function.LogInTab;
import Personal_Tabs.ExploreProductTab;
import Utils.Utility;

public class VerifyExploreProductTab extends Base {
	
	WebDriver driver;
	ExploreProductTab exploreProductTab;
	LogInTab loginTab;
	SoftAssert soft;
	String testId ;
	
	static ExtentTest test;
	static ExtentHtmlReporter reporter;
	
	
	@Parameters ("browser")
	@BeforeTest
	public void openBrowser(String browserName ) {
		
		reporter = new ExtentHtmlReporter("test-output/ExtendReport/Extent.html");
    	ExtentReports extend = new ExtentReports();
    	extend.attachReporter(reporter);
    	
		System.out.println("VerifyExploreProductTab.Before Test");
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
		System.out.println("VerifyExploreProductTab.Before Class");
		loginTab = new LogInTab(driver);
		exploreProductTab = new ExploreProductTab(driver);
		soft = new SoftAssert();
	}
	
	
	@BeforeMethod
	public void launchWebApplication() {
		System.out.println("VerifyExploreProductTab.Before Method");
		driver.get("https://www.axisbank.com/");
		loginTab.clickOnClosedAdsButton();
	}
	
	
	@Test
	public void verifyTheTableNamePresentInExploreProductTab() {
		testId = "Test301";
		System.out.println("VerifyExploreProductTab.Test 1");
		String actualTableName = exploreProductTab.getTextOfRetailTable();
		String expectedTableName = "Retail";
		System.out.println(exploreProductTab.getTextOfRetailTable());
		
		String actualTableName1 = exploreProductTab.getTextOfAgriAndRuralTable();
		String expectedTableName1 = "Agri and Rural";
		System.out.println(exploreProductTab.getTextOfAgriAndRuralTable());
		
		soft.assertEquals(actualTableName, expectedTableName);
		soft.assertEquals(actualTableName1, expectedTableName1);
		soft.assertAll();
	}
	
	@Test
	public void verifyAllTheOptionsPresentInExploreProductTab() {
		testId = "Test302";
		System.out.println("VerifyExploreProductTab.Test 2");
		loginTab.clickOnClosedAdsButton();
		exploreProductTab.goToExploreProductTab();
		String actualOption1 = exploreProductTab.getTextOfAccounts();
		String expectedOption1 = "Accounts";
		System.out.println(exploreProductTab.getTextOfAccounts());
		String actualOption2 = exploreProductTab.getTextOfDeposits();
		String expectedOption2 = "Deposits";
		System.out.println(exploreProductTab.getTextOfDeposits());
		String actualOption3 = exploreProductTab.getTextOfCards();
		String expectedOption3 = "Cards";
		System.out.println(exploreProductTab.getTextOfCards());
		String actualOption4 = exploreProductTab.getTextOfLoans();
		String expectedOption4 = "Loans";
		System.out.println(exploreProductTab.getTextOfLoans());
		String actualOption5 = exploreProductTab.getTextOfForex();
		String expectedOption5 = "Forex";
		System.out.println(exploreProductTab.getTextOfForex());
		String actualOption6 = exploreProductTab.getTextOfInsurance();
		String expectedOption6 = "Insurance";
		System.out.println(exploreProductTab.getTextOfInsurance());
		String actualOption7 = exploreProductTab.getTextOfInvestments();
		String expectedOption7 = "Investments";
		System.out.println(exploreProductTab.getTextOfInvestments());
		String actualOption8 = exploreProductTab.getTextOfGovernmentProduct();
		String expectedOption8 = "Government Product";
		System.out.println(exploreProductTab.getTextOfGovernmentProduct());
		String actualOption9 = exploreProductTab.getTextOfStartASip();
		String expectedOption9 = "Start a SIP";
		System.out.println(exploreProductTab.getTextOfStartASip());
		String actualOption10 = exploreProductTab.getTextOfFastag();
		String expectedOption10 = "FASTag";
		System.out.println(exploreProductTab.getTextOfFastag());
		String actualOption11 = exploreProductTab.getTextOfFreechargePayLater();
		String expectedOption11 = "Freecharge Pay Later";
		System.out.println(exploreProductTab.getTextOfFreechargePayLater());
		
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
		
		soft.assertAll();
		
	}
	
	
	@AfterMethod
	public void logOutFromApplication(ITestResult result) throws IOException, InterruptedException {
		System.out.println("VerifyExploreProductTab.After Method");
		
		if(ITestResult.FAILURE == result.getStatus())
		{
			Utility.captureScreen(driver, testId);
		}
	}
	
	@AfterClass
	public void clearObject() {
		System.out.println("VerifyExploreProductTab.After Class");
		loginTab = null;
		exploreProductTab = null;
		soft = null ;
	}
	
	@AfterTest
    public void closedTheBrowser() {
    	System.out.println("VerifyExploreProductTab.Afetr Test");
    	driver.quit();
    	driver = null;
    	System.gc();
    }
	
//	@Test
//	public void verifyAllTheOptionsPresentInExploreProductTab() {
//		System.out.println("Test 1");
//		exploreProductTab.goToExploreProductTab();
//		exploreProductTab.getTextOfExploreProductsTabOptions();
//		String actualOptions = exploreProductTab.getTextOfExploreProductsTabOptions();
//		String expectedOptions = "Accounts,Deposits,Cards,Loans,Forex,Insurance,Investments,Government Product,Start a SIP,FASTag,Freecharge Pay Later,";
//		
//		soft.assertEquals(actualOptions, expectedOptions);
//	}
	
	

}
