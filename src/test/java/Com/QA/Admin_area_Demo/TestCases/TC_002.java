package Com.QA.Admin_area_Demo.TestCases;

import org.testng.annotations.Test;

import Com.QA.Admin_area_Demo.Business.BusinessFunction;
import Com.QA.Admin_area_Demo.Start.StartBrowser;

public class TC_002 extends StartBrowser {
	@Test
	public void tc_002()throws Exception{
		BusinessFunction b=new BusinessFunction();
		b.NavigateUrl();
		b.Login();
		b.catalog();
		b.Logout();
		Thread.sleep(5000);
		
	}

}
