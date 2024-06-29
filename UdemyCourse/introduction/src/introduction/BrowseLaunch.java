package introduction;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;

import javax.security.auth.login.Configuration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrowseLaunch {

	public static void main(String[] args) throws InterruptedException {
		//chrome driver

		//System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
		
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--remote-allow-origins=*");
		
		//WebDriver driver = new ChromeDriver(options);
		
		//gecko driver
		
		//System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		
		//WebDriver driver=new FirefoxDriver();
		
		//microsoft edge
        System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
        EdgeOptions options = new EdgeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new EdgeDriver(options);
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.quit();
		
		
		
	}
}
