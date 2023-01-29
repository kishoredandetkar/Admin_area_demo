package Com.QA.Admin_area_Demo.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.MediaEntityBuilder;

import Com.QA.Admin_area_Demo.Start.StartBrowser;

public class ActionDriver {
	WebDriver driver;
	public ActionDriver() {
		driver=StartBrowser.driver;
	}
	
	public void OpenApplication(String url) {
		try {
			driver.get(url);
			StartBrowser.childTest.pass("Navigate to url",MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenShot()).build());
		}
		catch(Exception e) {
			StartBrowser.childTest.fail("Unable to Navigate to url");	
		}	
	}
	
	public void Click(By Locator,String ele) {
		try {
			driver.findElement(Locator).click();
			StartBrowser.childTest.pass("Click on Button"+ele,MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenShot()).build());
		}
		catch(Exception e) {
			StartBrowser.childTest.fail("Unable to Click on button"+ele);
		}
	}

	public void type(By Locator, String TestData, String ele) throws Exception{
		try {
			driver.findElement(Locator).clear();
			Thread.sleep(3000);
			driver.findElement(Locator).sendKeys(TestData);
			StartBrowser.childTest.pass("Performed"+TestData+"with"+ele, MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenShot()).build());
		}catch(Exception e) {
			StartBrowser.childTest.fail("Unale to Perform"+TestData+"with"+ele);	
		}
	}
	
	public String ScreenShot() {
		return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
	}

}
