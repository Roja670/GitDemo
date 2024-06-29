package RealtimeExerciseEndtoendProgrammingSec11;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;

public class Assignment6 {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption2")).click();
		String opt=driver.findElement(By.id("checkBoxOption2")).getText();
		
		 WebElement dropdown=driver.findElement(By.id("dropdown-class-example"));

	        Select s=new Select(dropdown);

	        s.selectByVisibleText(opt);

	        driver.findElement(By.name("enter-name")).sendKeys(opt);

	        driver.findElement(By.id("alertbtn")).click();

	     String text=  driver.switchTo().alert().getText();

	     if(text.contains(opt))

	     {

	    System.out.println("Alert message success");

	     }

	     else

	    System.out.println("Something wrong with execution");

	}

	}