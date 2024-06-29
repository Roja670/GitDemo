package practiceAllCode;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class RelativeLocators {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
			
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			
			WebDriver driver = new ChromeDriver(options);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
			driver.get("https://rahulshettyacademy.com/angularpractice/");
			WebElement nameEditBox= driver.findElement(By.cssSelector("input[name='name']"));
			System.out.println(driver.findElement(with(By.tagName("label")).above(nameEditBox)).getText());
			WebElement dateOfBirth=driver.findElement(By.cssSelector("[for= 'dateofBirth']"));
			driver.findElement(with(By.tagName("input")).below(dateOfBirth)).click();
			WebElement iceCream=driver.findElement(By.cssSelector("[for= 'exampleCheck1']"));
			driver.findElement(with(By.tagName("input")).toLeftOf(iceCream)).click();
			WebElement radiobutton=driver.findElement(By.id("inlineRadio1"));
			System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(radiobutton)).getText());
			
			
			
			
	}

}
