package java_Practice;

public class Permutations_combinations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		permu("abc", "");
	}

	public static void permu(String str, String ans) {

		if (str.length() == 0) {
			System.out.println(ans + " ");
			return;
		}

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			String roi = str.substring(0, i) + str.substring(i + 1);

			permu(roi, ans + ch);

		}

	}
}
