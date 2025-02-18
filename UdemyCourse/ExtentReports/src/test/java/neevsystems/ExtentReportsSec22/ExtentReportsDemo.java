package neevsystems.ExtentReportsSec22;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
public class ExtentReportsDemo{
	ExtentReports extent;

@BeforeTest
public void config()  
{
	
		
		//Threre are two classes using to get extent reports
		//ExtentReports     //ExtentSparkReport
		String path=System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter= new ExtentSparkReporter(path);
		//to change the name of the report
		reporter.config().setReportName("Web Automation Results");
		//To change the title
		reporter.config().setDocumentTitle("Test Results");
		
	    extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Rojalin Nanda");
		
	}

	@Test
	public void initialDemo()
	{
		//for fail the test
		ExtentTest test=extent.createTest("initial Demo");
		//extent.createTest("initial Demo");
       System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		//failing test
		driver.close();
		test.fail("Result do not match");
		
		
		
		extent.flush();
		
	

		
		
		
		
		
		
	}
}


