package practiceAllCode;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
			
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			
			WebDriver driver = new ChromeDriver(options);
			String password=getPassword(driver);
			
			//Implicitly Wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
			driver.get("https://rahulshettyacademy.com/locatorspractice/");
			driver.findElement(By.id("inputUsername")).sendKeys("rahul");
			driver.findElement(By.name("inputPassword")).sendKeys("hello@123");
			driver.findElement(By.className("submit")).click();
			System.out.println(driver.findElement(By.className("error")).getText());
			driver.findElement(By.linkText("Forgot your password?")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("rahul");
			driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@123");
			driver.findElement(By.xpath("(//input[@type='text'])[2]")).clear();
			driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("john@123");
			driver.findElement(By.xpath("//form/input[3]")).sendKeys("6462654774527");
			driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
			driver.findElement(By.cssSelector("form p")).getText();
			driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
			driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
			driver.findElement(By.cssSelector("input[type*=pass]")).sendKeys(password);
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
			driver.findElement(By.xpath("//button[contains(@class,'submit ')]")).click();
			driver.findElement(By.cssSelector(".logout-btn")).click();
			
			//parent to child / sibling to sibling
			
			
	}
	public  static String getPassword(WebDriver driver) throws InterruptedException
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String passwordText=driver.findElement(By.cssSelector("form p")).getText();
		String [] passwordArray=passwordText.split("'");
		String  password=passwordArray[1].split("'")[0];
	    return password;	
		
		
		
			
			

	}

}
