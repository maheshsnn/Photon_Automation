package java_Practice;

public class prime_Number {

	public static void main(String[] args) {
		if (prime_Number.mm(11)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

	public static boolean mm(int s) {

		for (int i = 2; i < s; i++) {
			if (s % i == 0) {
				return false;
			} 

		}
		return true;
	}

}
