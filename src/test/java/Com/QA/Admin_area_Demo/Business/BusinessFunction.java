package Com.QA.Admin_area_Demo.Business;

import org.openqa.selenium.WebDriver;

import Com.QA.Admin_area_Demo.Action.ActionDriver;
import Com.QA.Admin_area_Demo.Start.StartBrowser;
import Com.QA.Admin_area_Demo.WebElement.HomePage;
import Com.QA.Admin_area_Demo.WebElement.LoginPage;

public class BusinessFunction {
	WebDriver driver;
	ActionDriver adriver;
	
	public BusinessFunction() {
		driver=StartBrowser.driver;
		adriver=new ActionDriver();	
	}
	public void NavigateUrl()throws Exception {
		StartBrowser.childTest=StartBrowser.parentTest.createNode("Navigate to URL");
		adriver.OpenApplication(HomePage.url1);
	}

	public void Login() throws Exception{
		StartBrowser.childTest=StartBrowser.parentTest.createNode("Login Adminarea Demo");
		adriver.type(HomePage.email, LoginPage.Email, "Enter Email");
		adriver.type(HomePage.Password, LoginPage.pwd, "Enter Password");
		adriver.Click(HomePage.Remember, "Click on Remander Check Box");
		adriver.Click(HomePage.Login, "Click on Login Button");
	}
	
	public void catalog() {
		StartBrowser.childTest=StartBrowser.parentTest.createNode("Click on Catlog");
		adriver.Click(HomePage.Catalog, "Click on Catalog");
		adriver.Click(HomePage.products, "Click on Products");
	}
	public void Customer() {
		StartBrowser.childTest=StartBrowser.parentTest.createNode("Click on Customers");
		adriver.Click(HomePage.Customers, "Clcik on Customres Profile");
		adriver.Click(HomePage.Customers1, "Click on Customers");
		adriver.Click(HomePage.AddNew, "Click on AddNew Button");
		
	}
	public void Logout() {
		StartBrowser.childTest=StartBrowser.parentTest.createNode("Click on Logout");
		adriver.Click(HomePage.logout, "Click on Logout Button");
	}
}
