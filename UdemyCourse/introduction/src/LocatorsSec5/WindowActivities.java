package LocatorsSec5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowActivities {

	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		
		driver.get("https://google.com/");
		//To go another Web page from current window
		driver.navigate().to("https://www.amazon.in/");
		
		//Back to web page
		driver.navigate().back();
		
		//Move forward
		driver.navigate().forward();
		

	}

}
