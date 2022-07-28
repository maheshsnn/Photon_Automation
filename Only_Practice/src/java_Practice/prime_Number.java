package java_Practice;

public class prime_Number {

	public static void main(String[] args) {

		if (prime_Number.mm(100)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		/*
		 * for(int n=2;n<=100;n++) { //check if this number is prime if(mm(n)) {
		 * System.out.println(n); } }
		 */
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
