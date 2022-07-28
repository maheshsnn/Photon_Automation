package java_Practice;

public class Primenumbers_From_1_100 {

	public static void main(String[] args) {

		for (int j = 2; j < 100; j++) {
			if (prime(j)) {
				System.out.println(j);
			}
		}

	}

	public static boolean prime(int n) {

		for (int i = 2; i < n; i++)

		{
			if (n % i == 0) {
				return false;
			}

		}

		return true;
	}
}