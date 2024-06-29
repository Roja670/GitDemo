package principlesNeededForFrameWorkCoreJavaSec17;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PS {
	
	public  void dothis(){
		System.out.println("I am here");
	}
	
	@BeforeMethod
	public void beforerun()
	{
		System.out.println("Run me First");
	}
	@AfterMethod
	public void afterrun()
	{
		System.out.println("Run me Last");
	}
}

		
		
