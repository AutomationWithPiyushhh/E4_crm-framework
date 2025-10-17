package generic_utility;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class JavaUtility {

	public static int getRandomNumber() {
		double random = Math.random();
		return (int) (random * 1000);
	}

	public static String getCurrentDateTime() {
		LocalDateTime now = LocalDateTime.now();
//		2025-10-14T16:36:46.356563

		String datetime = DateTimeFormatter.ofPattern("HH-mm-ss_dd-MM-yyyy").format(now);
//		16-36-46_14-10-2025

		return datetime;
	}
}
