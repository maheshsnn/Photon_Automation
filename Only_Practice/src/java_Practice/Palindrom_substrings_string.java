package java_Practice;

import java.util.HashSet;
import java.util.Set;

public class Palindrom_substrings_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "google";
		allpalindromes(s);

	}

	public static void expand(String str, int low, int high, Set<String> set) {
		while (low >= 0 && high < str.length() && str.charAt(low) == str.charAt(high)) {
			set.add(str.substring(low, high + 1));
			low--;
			high++;
		}

	}

	public static void allpalindromes(String str) {

		Set<String> set = new HashSet();

		for (int i = 0; i < str.length(); i++) {
			expand(str, i, i, set);
			expand(str, i, i + 1, set);
		}
		System.out.println(set);

	}

}
