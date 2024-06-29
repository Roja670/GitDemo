package miscellaneousTopicsinSeleniumWebdriverSec13;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

public class SSLCheck {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
			
			ChromeOptions options = new ChromeOptions();
			options.setAcceptInsecureCerts(true);
			options.addArguments("--remote-allow-origins=*");
			
			//Run in Firefox Browser
			//FirefoxOptions options1 = new FirefoxOptions();
			//options1.setAcceptInsecureCerts(true);
			WebDriver driver = new ChromeDriver(options);
			driver.get("https://expired.badssl.com/");
			System.out.println(driver.getTitle());
			
			
			//To find set download directory
			ChromeOptions options3 = new ChromeOptions();
			Map<String, Object> prefs = new HashMap<String, Object>();
			prefs.put("download.default_directory", "/directory/path");
			options.setExperimentalOption("prefs", prefs);
			//https://developer.chrome.com/docs/chromedriver/capabilities
			
			//blocking popups
			

	}

}
