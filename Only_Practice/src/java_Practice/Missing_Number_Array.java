package java_Practice;

public class Missing_Number_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] x = { 1, 2, 3, 5, 6, 7 };

		int n = x.length + 1;

		int sum = n * (n + 1) / 2;

		int restsum = 0;

		for (int i = 0; i < x.length; i++) {
			restsum = restsum + x[i];
		}

		int mis = sum - restsum;

		System.out.println(mis);

	}

}
