package automateAjaxClassChildWindowsandIframesSec10;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment4WindowHandling {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
			
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			
			WebDriver driver = new ChromeDriver(options);
			driver.get("http://the-internet.herokuapp.com/");
			driver.findElement(By.linkText("Multiple Windows")).click();
			driver.findElement(By.linkText("Click Here")).click();
			Set<String>windows=driver.getWindowHandles();
			Iterator<String> it=windows.iterator();
			String parentId=it.next();
			String childId=it.next();
			driver.switchTo().window(childId);
			System.out.println(driver.findElement(By.xpath("//h3[text()='New Window']")).getText());
			driver.switchTo().window(parentId);
			System.out.println(driver.findElement(By.xpath("//h3[text()='Opening a new window']")).getText());
	}

}
