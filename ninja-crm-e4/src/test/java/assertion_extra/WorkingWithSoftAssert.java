package assertion_extra;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class WorkingWithSoftAssert {
	@Test
	public void case1() {
		System.out.println("the first line of code");

		SoftAssert sa = new SoftAssert();

		sa.assertTrue(false);
		sa.assertFalse(true);

		String a = "abc";
		String b = "pqr";
		String c = "xyz";
		String d = "pqr";

		sa.assertEquals(a, d);
		sa.assertNotEquals(b, d);

		Object obj1 = null;
		Object obj2 = new Object();

		sa.assertNull(obj2);
		sa.assertNotNull(obj1);

		System.out.println("the last line of code");
		sa.assertAll();
	}
}
