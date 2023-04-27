package Log_In_Function;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInTab {
	
	//Variable Declaration
	@FindBy (xpath = "//div[@class='loginClk jsloginClk']")
	private WebElement logInTab;
	
	@FindBy (xpath = "//a[@class='accTitle'][1]")
	private WebElement internetBanking;
	
	@FindBy (xpath = "//a[@class='accTitle'][2]")
	private WebElement cmsAndPaymentSolution;
	
	@FindBy (xpath = "//a[@class='accTitle'][3]")
	private WebElement cards;
	
	@FindBy (xpath = "//a[@class='accTitle'][4]")
	private WebElement powerAccess;
	
	@FindBy (xpath = "//a[@class='accTitle'][5]")
	private WebElement remitMoney;
	
	
	@FindBy (xpath = "//a[@class='accTitle'][6]")
	private WebElement edgeRewards;
	
	@FindBy (xpath = "//a[@class='accTitle'][7]")
	private WebElement fastag;
	
	@FindBy (xpath = "//h3[@id='PersonalLbl']")
	private WebElement personal;
	
	@FindBy (xpath = "//h3[@id='corporateLbl']")
	private WebElement corporate;
	
	@FindBy (xpath = "(//a[text() ='Login'])[1]")
	private WebElement personalLoginButton;
	
	@FindBy (xpath = "(//a[text() ='Login'])[3]")
	private WebElement corporateLoginButton;
	
	@FindBy (xpath = "(//a[text() ='Register'])[1]")
	private WebElement registerButton;
	
	@FindBy (xpath = "//span[text()='X']")
	private WebElement closedAdsButton ;
	
	
	private WebDriver driver;
	private Actions action;
	
	//Variable Initialization
	public LogInTab (WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		action = new Actions(driver);
	}
	
	
	//Variable Use
	public void openLoginTab() {
		action.moveToElement(logInTab).perform();
	}
	
	public void clickOnClosedAdsButton() {
		try {
		closedAdsButton.click();
		}
		catch(Exception e) {
			
		}
	}
	
	public String getTextOfInternetBanking() {
		String text = internetBanking.getText();
		return text;
	}
	
	public String getTextOfCMSAndPaymentSolution() {
		String text = cmsAndPaymentSolution.getText();
		return text;
	}
	
	public String getTextOfCards() {
		String text = cards.getText();
		return text;
	}
	
	public String getTextOfPowerAccess() {
		String text = powerAccess.getText();
		return text;
	}
	
	public String getTextOfRemitMoney() {
		String text = remitMoney.getText();
		return text;
	}
	
	public String getTextOfEDGERewards() {
		String text = edgeRewards.getText();
		return text;
	}
	
	public String getTextOfFastag() {
		String text = fastag.getText();
		return text;
	}
	
	public String getTextOfPersonal() {
		String text = personal.getText();
		return text;
	}
	
	public String getTextOfCorporate() {
		String text = corporate.getText();
		return text;
	}
	
	
	
	
	
	
	

}
