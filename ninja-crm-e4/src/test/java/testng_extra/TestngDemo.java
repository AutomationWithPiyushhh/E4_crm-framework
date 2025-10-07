package testng_extra;

import org.testng.annotations.Test;

public class TestngDemo {

	@Test
	public void create() {
		System.out.println("creating data");
	}

	@Test
	public void modify() {
		System.out.println("modifying data");
	}

	@Test(dependsOnMethods = "modify")
	public void delete() {
		System.out.println("deleting data");
	}
}
