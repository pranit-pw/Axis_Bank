package Personal_Tabs;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExploreProductTab {
	
	//Variable Declaration 
	@FindBy (xpath = "//a[text()='Explore Products']")
	private WebElement exploreProducts;
	
//	@FindBy (xpath = "((//div[@class='fLevel'])[1]//li)[1]")
//	private WebElement exploreProductsTabOptions;
	
	@FindBy (xpath = "((//div[@class='fLevel'])[1]//li)[1]")
	private WebElement accounts;
	
	@FindBy (xpath = "((//div[@class='fLevel'])[1]//li)[2]")
	private WebElement deposits;
	
	@FindBy (xpath = "((//div[@class='fLevel'])[1]//li)[3]")
	private WebElement cards;
	
	@FindBy (xpath = "((//div[@class='fLevel'])[1]//li)[4]")
	private WebElement loans;
	
	@FindBy (xpath = "((//div[@class='fLevel'])[1]//li)[5]")
	private WebElement forex;
	
	@FindBy (xpath = "((//div[@class='fLevel'])[1]//li)[6]")
	private WebElement insurance;
	
	@FindBy (xpath = "((//div[@class='fLevel'])[1]//li)[7]")
	private WebElement investments;
	
	@FindBy (xpath = "((//div[@class='fLevel'])[1]//li)[8]")
	private WebElement governmentProduct;
	
	@FindBy (xpath = "((//div[@class='fLevel'])[1]//li)[9]")
	private WebElement startASip;
	
	@FindBy (xpath = "((//div[@class='fLevel'])[1]//li)[10]")
	private WebElement fastag;
	
	@FindBy (xpath = "((//div[@class='fLevel'])[1]//li)[11]")
	private WebElement freechargePayLater;
	
	@FindBy (xpath = "//span[text()='Retail']")
	private WebElement retailTable;
	
	@FindBy (xpath = "//span[text()='Agri and Rural']")
	private WebElement agriAndRuralTable;
	
//	private WebDriver driver;
	private Actions action;

	
	//Variable Initialization
	public ExploreProductTab (WebDriver driver) {
		PageFactory.initElements(driver, this);
//		this.driver = driver;
		action = new Actions(driver);
	}

	
	//Variable Use
	public void goToExploreProductTab() {
		action.moveToElement(exploreProducts).perform();
	}
		
	//Methods for Get text from Options
	public String getTextOfAccounts() {
		String text = accounts.getText();
		return text;
	}
	
	public String getTextOfDeposits() {
		String text = deposits.getText();
		return text;
	}
	
	public String getTextOfCards() {
		String text = cards.getText();
		return text;
	}
	
	public String getTextOfLoans() {
		String text = loans.getText();
		return text;
	}
		
	public String getTextOfForex() {
		String text = forex.getText();
		return text;
	}
	
	public String getTextOfInsurance() {
		String text = insurance.getText();
		return text;
	}
	
	public String getTextOfInvestments() {
		String text = investments.getText();
		return text;
	}
	
	public String getTextOfGovernmentProduct() {
		String text = governmentProduct.getText();
		return text;
	}
		
	public String getTextOfStartASip() {
		String text = startASip.getText();
		return text;
	}
	
	public String getTextOfFastag() {
		String text = fastag.getText();
		return text;
	}
	
	public String getTextOfFreechargePayLater() {
		String text = freechargePayLater.getText();
		return text;
	}
	
	
	public String getTextOfRetailTable() {
		String text = retailTable.getText();
		return text;
	}
	
	public String getTextOfAgriAndRuralTable() {
		String text = agriAndRuralTable.getText();
		return text;
	}
	
	
	
//	public String getTextOfExploreProductsTabOptions() {
//		for(int i = 1 ; i < 12 ; i++)
//		{
//			WebElement exploreProductsTabOptions1 = driver.findElement(By.xpath("((//div[@class='fLevel'])[1]//li)["+i+"]"));
//			String text = exploreProductsTabOptions1.getText();
//			System.out.println(text + ",");
//			return text;
//		}
//		return null;
//	}
	
	//Methods for Move to Element
	public void moveToAccounts() {
		action.moveToElement(accounts).perform();
	}
	
	public void moveToDeposits() {
		action.moveToElement(deposits).perform();
	}
	
	public void moveToCards() {
		action.moveToElement(cards).perform();
	}
	
	public void moveToLoans() {
		action.moveToElement(loans).perform();
	}
	
	public void moveToForex() {
		action.moveToElement(forex).perform();
	}
	
	public void moveToInsurance() {
		action.moveToElement(insurance).perform();
	}
	
	public void moveToInvestments() {
		action.moveToElement(investments).perform();
	}
	
	public void moveToGovernmentProduct() {
		action.moveToElement(governmentProduct).perform();
	}
	
	public void moveToStartASip() {
		action.moveToElement(startASip).perform();
	}
	
	public void moveToFastag() {
		action.moveToElement(fastag).perform();
	}
	
	public void moveToFreechargePayLater() {
		action.moveToElement(freechargePayLater).perform();
	}
	
	
	//Methods for Click On Options
	public void clickOnAccounts() {
		accounts.click();
	}
	
	public void clickOnDeposits() {
		deposits.click();
	}
	
	public void clickOnCards() {
		cards.click();
	}
	
	public void clickOnLoans() {
		loans.click();
	}
	
	public void clickOnForex() {
		forex.click();
	}
	
	public void clickOnInsurance() {
		insurance.click();
	}
	
	public void clickOnInvestments() {
		investments.click();
	}
	
	public void clickOnGovernmentProduct() {
		governmentProduct.click();
	}
	
	public void clickOnstartASip() {
		startASip.click();
	}
	
	public void clickOnFastag() {
		fastag.click();
	}
	
	public void clickOnFreechargePayLater() {
		freechargePayLater.click();
	}







	
	
	
	


}
