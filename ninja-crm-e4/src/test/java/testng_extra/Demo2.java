package testng_extra;

import org.testng.annotations.Test;

public class Demo2 {
	@Test(groups = "reg")
	public void case2() {
		System.out.println("hey");
	}
	
	@Test(groups = "smoke")
	public void case3() {
		System.out.println("hey");
	}
	
	@Test(groups = "reg")
	public void case4() {
		System.out.println("hey");
	}
}
