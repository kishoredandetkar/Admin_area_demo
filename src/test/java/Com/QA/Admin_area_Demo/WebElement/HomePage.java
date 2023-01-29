package Com.QA.Admin_area_Demo.WebElement;

import org.openqa.selenium.By;

public class HomePage {
	public static String url1="https://admin-demo.nopcommerce.com/login";
	public static By email=By.id("Email");
	public static By Password=By.id("Password");
	public static By Remember=By.id("RememberMe");
	public static By Login=By.xpath("//button[@type='submit']");
	public static By logout=By.xpath("//a[contains(text(),'Logout')]");
	public static By Catalog=By.xpath("(//ul[@data-widget='treeview']/li)[2]");
	public static By products=By.xpath("(//p[contains(text(), ' Products')])[1]");
	public static By productname=By.id("SearchProductName");
	public static By Customers=By.xpath("(//p[contains(text(), 'Customers')])[1]");
	public static By Customers1=By.xpath("(//p[contains(text(), ' Customers')])[1]");
	public static By enterEmail=By.id("SearchEmail");
	public static By FirstName=By.id("SearchFirstName");
	public static By LastName=By.id("SearchLastName");
	public static By lastActivityFrom=By.xpath("//span[@aria-controls='SearchLastActivityFrom_dateview']");
	public static By AddNew=By.xpath("//a[@class='btn btn-primary']");
	//Customer Email
	public static By CustomerName=By.id("FirstName");
	public static By CustomerLastname=By.id("LastName");
	public static By Gender=By.id("Gender_Male");
	public static By Company=By.id("Company");
	public static By tax=By.id("IsTaxExempt");
	public static By NewsLetter=By.xpath("(//div[@role='listbox'])[1]");
	public static By testStore=By.xpath("//li[contains(text(), 'Test store 2')]");

	
	

}
