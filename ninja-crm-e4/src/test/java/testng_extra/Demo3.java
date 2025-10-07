package testng_extra;

import org.testng.annotations.Test;

public class Demo3 {
	@Test(groups = "reg")
	public void case5() {
		System.out.println("hey");
	}
	
	@Test(groups = "smoke")
	public void case6() {
		System.out.println("hey");
	}
}
