package java_Practice;

public class Palindrome_String {

	public static void main(String arg[]) {

		String s = "mom";

		String reverse = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			reverse = reverse + s.charAt(i);

		}

		if (s.equals(reverse)) {
			System.out.println("palindrome");
		} else {
			System.out.println("not a palindrome");
		}

	}

}
