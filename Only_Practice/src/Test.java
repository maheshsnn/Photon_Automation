import java.util.HashMap;

public class Test {

	public static void main(String[] args) {

		int[] x = { 2, 5, 7, 6, 3, 4 };
		int count = 0;
		int largest = x[count];

		for (int k = 0; k < x.length; k++) {

			for (int i = 0; i < x.length; i++) {
				if (x[i] > largest) {
					largest = x[i];
				}
			}

			x[count] = largest;
			System.out.println("largest us "+largest);
			count++;

		}

		/*
		 * for (int j = 0; j < x.length; j++) { System.out.println(x[j]); }
		 */
	}
}
