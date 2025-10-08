package assertion_extra;

import org.testng.Assert;
import org.testng.annotations.Test;

public class WorkingWithHardAssert {
	@Test
	public void case1() {
		System.out.println("the first line of code");

		Assert.assertTrue(true);
		Assert.assertFalse(false);

		String a = "abc";
		String b = "pqr";
		String c = "xyz";
		String d = "pqr";
		
		Assert.assertEquals(b, d);
		Assert.assertNotEquals(a, d);
		
		Object obj1 = null;
		Object obj2 = new Object();

		Assert.assertNull(obj1);
		Assert.assertNotNull(obj2);
		
		System.out.println("the last line of code");
	}
}
