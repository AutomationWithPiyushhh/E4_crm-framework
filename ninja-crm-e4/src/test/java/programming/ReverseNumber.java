package programming;

public class ReverseNumber {
	public static void main(String[] args) {
		int num = 12345;
		int reversed = 0;

		while (num != 0) {
			int digit = num % 10; // extract last digit
			reversed = reversed * 10 + digit; // append it to reversed number
			System.out.println(reversed);
 			num = num / 10; // remove last digit
		}

		System.out.println("Reversed Number: " + reversed);
	}
}
