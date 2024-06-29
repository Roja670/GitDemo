package automateAjaxClassChildWindowsandIframesSec10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class FreamesTest {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
			
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			
			
			WebDriver driver = new ChromeDriver(options);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.get("http://jqueryui.com/droppable/");
			System.out.println(driver.findElements(By.tagName("iframe")).size());
			driver.switchTo().frame(0);
			//driver.findElement(By.cssSelector("iframe[class='demo-frame']"));
			//driver.findElement(By.id("draggable")).click();
			Actions a=new Actions(driver);
			
			WebElement source=driver.findElement(By.xpath("//div[@id='draggable']"));
			WebElement target=driver.findElement(By.xpath("//div[@id='droppable']"));
			a.dragAndDrop(source, target).build().perform();
			driver.switchTo().defaultContent();

	}

}
