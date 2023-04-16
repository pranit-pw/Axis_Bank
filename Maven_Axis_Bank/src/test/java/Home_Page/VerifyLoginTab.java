package Home_Page;

import org.testng.annotations.Test;

import Browser_Setup.Base;
import Log_In_Function.LogInTab;
import Utils.Utility;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class VerifyLoginTab extends Base {
	
	WebDriver driver;
	LogInTab loginTab;
	String testId ;
	
	
	@Parameters ("browser")
	@BeforeTest
	public void openBrowser(String browserName ) {
    	System.out.println("VerifyLoginTab.Before Test");
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
		System.out.println("VerifyLoginTab.Before Class");
		loginTab = new LogInTab(driver);
	}
	
	
	@BeforeMethod
	public void launchWebApplication() {
		System.out.println("VerifyLoginTab.Before Method");
		driver.get("https://www.axisbank.com/");
		loginTab.clickOnClosedAdsButton();
	}
	
	@Test
	public void verifyAllTheOptionsPresentInLoginTab() {
		testId = "Test401";
		System.out.println("VerifyLoginTab.Test 1");
		loginTab.openLoginTab();
		System.out.println(loginTab.getTextOfInternetBanking());
		System.out.println(loginTab.getTextOfCMSAndPaymentSolution());
		System.out.println(loginTab.getTextOfCards());
		System.out.println(loginTab.getTextOfEDGERewards());
		System.out.println(loginTab.getTextOfRemitMoney());
		System.out.println(loginTab.getTextOfPowerAccess());
		System.out.println(loginTab.getTextOfFastag());
	}
	
	
	@AfterMethod
	public void logOutFromApplication(ITestResult result) throws WebDriverException, IOException, InterruptedException {
		System.out.println("VerifyLoginTab.Afetr Method");
		
		if(ITestResult.FAILURE == result.getStatus())
		{
			Utility.captureScreen(driver, testId);
		}
	}
	
	
	@AfterClass
	public void clearObject() {
		System.out.println("VerifyLoginTab.After Class");
		loginTab = null;
	}
	
	
	@AfterTest
    public void closedTheBrowser() {
    	System.out.println("VerifyLoginTab.Afetr Test");
    	driver.quit();
    	driver = null;
    	System.gc();
    }

	
	

}
