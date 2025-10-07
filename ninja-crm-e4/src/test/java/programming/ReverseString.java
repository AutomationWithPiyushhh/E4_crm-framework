package programming;

public class ReverseString {
	public static void main(String[] args) {
		String str = "Piyush";
		String reversed = "";
		
		System.out.println(str.length());
		
		for (int i = str.length() - 1; i >= 0; i--) {
			reversed += str.charAt(i);
		}
		System.out.println("Reversed: " + reversed);
	}
}