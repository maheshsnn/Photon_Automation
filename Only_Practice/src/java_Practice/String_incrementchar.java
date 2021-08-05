package java_Practice;

public class String_incrementchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;

		String s = "m1a2h3e4s5h6";

		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i))) {
				int v = Character.getNumericValue(s.charAt(i));
				sum = sum + v;

			}

		}
		System.out.println(sum);

		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i)))

			{

				int x = Character.getNumericValue(s.charAt(i));

				for (int j = 0; j < x; j++) {
					System.out.print(s.charAt(i - 1));
				}
			}

		}

	}

}
