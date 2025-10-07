package testng_extra;

import org.testng.annotations.Test;

public class DemoForHelperAttr {
	@Test(invocationCount = 5)
	public void case1() {
		System.out.println("it should get executed 5 times");
	}

	@Test(invocationCount = 0)
	public void case2() {
		System.out.println("it should get executed 0 times");
	}

	@Test(enabled = false)
	public void case3() {
		System.out.println("it should not be executed");
	}

	@Test(invocationCount = 15, threadPoolSize = 5)
	public void case4() {
		System.out.println("it should get executed 15 invocation, 3 times");
	}

	@Test(dependsOnMethods = "case1", alwaysRun = true)
	public void case5() {
		System.out.println("dependent on case1 but must not be skipped");
	}

}
