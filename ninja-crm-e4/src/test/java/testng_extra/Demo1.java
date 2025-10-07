package testng_extra;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo1 {

	@Test(dataProvider = "getData")
//	executing same test script multiple times, with same set of data
	
//	DataProvider
//	executing same test script multiple times, with diff set of data
	public void case1() {
		String name = "banshika";
		String surname = "vasisth";
		
		Reporter.log("Hey " + name + " " + surname,true);
	}
	
	@DataProvider
	public void getData() {
		
		return ;
	}
	
}
