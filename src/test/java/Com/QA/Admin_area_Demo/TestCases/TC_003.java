package Com.QA.Admin_area_Demo.TestCases;

import org.testng.annotations.Test;

import Com.QA.Admin_area_Demo.Business.BusinessFunction;
import Com.QA.Admin_area_Demo.Start.StartBrowser;
import Com.QA.Admin_area_Demo.Utility.Log;

public class TC_003 extends StartBrowser {
	@Test
	public void tc_003()throws Exception {
		BusinessFunction bs=new BusinessFunction();
		bs.NavigateUrl();
		Log.info("Naviage to url");
		bs.Login();
		Log.info("Login Application");
		bs.Customer();
		Log.info("add Custoomers");
		
		
	
		
	}

}
