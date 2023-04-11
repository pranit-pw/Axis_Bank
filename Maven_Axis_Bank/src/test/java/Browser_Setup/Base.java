package Browser_Setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
	
	public static WebDriver openChromeBrowser() {
		System.setProperty("webdriver.chrome.driver", "E:\\Pranit\\chromedriver.exe") ;
    	WebDriver driver = new ChromeDriver() ;
    	return driver;
	}
	
	
	public static WebDriver openFirefoxBrowser() {
		System.setProperty("webdriver.gecko.driver", "E:\\Pranit\\Velocity Class\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
    	return driver;
	}
	
	
	public static WebDriver openEdgeBrowser() {
		System.setProperty("webdriver.edge.driver", "E:\\Pranit\\Velocity Class\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
    	return driver;
	}

}
