package java_Practice;

public class Fibonocci_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count = 10;

		int n3, n1 = 1, n2 = 2;
		System.out.println(n1);
		System.out.println(n2);
		for (int i = 0; i < count; i++) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;

			System.out.println(n3);
		}

	}

}
