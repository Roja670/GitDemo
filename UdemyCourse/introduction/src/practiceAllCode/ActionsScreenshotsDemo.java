package practiceAllCode;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;


public class ActionsScreenshotsDemo {


	public static void main(String[] args) throws IOException {
		 System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
			
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			
			WebDriver driver = new ChromeDriver(options);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			
			//driver.manage().deleteCookieNamed("");
			
			//click on any link
			
			//login-page  /verify login url
			
			
			driver.get("https://www.amazon.in/");
			//1.If you want to move another element
			//2.if you want to search anything in capital letter/Keyboard interaction keyDown(Keys.SHIFT)
			//3.if you want to select that text .doubleClick()
			//4.if you want to right click contextClick()
			
			Actions a=new Actions(driver);
			WebElement move=driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
			a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
			a.moveToElement(move).contextClick().build().perform();
			
			//take Screenshot
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src,new File("C:\\Users\\NEEV\\screenshot.png"));

	}

}
