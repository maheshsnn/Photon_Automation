package java_Practice;

public class sum_ofArray_excluding_range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] x = { 1, 2, 6, 7, 5, 9, 1, 2, 6, 7, 9, 1, 2 };

		sum_ofArray_excluding_range.range(6, 9, x);
	}

	public static void range(int a, int b, int[] A) {

		int temp = 0;

		for (int i = 0; i < A.length; i++) {

			if (A[i] == a) {
				int j = i;

				for (j = i; j < A.length; j++) {
					if (A[j] == b) {
						break;
					}
				}
				i = j;
			} else {
				temp = temp + A[i];
			}
		}

		System.out.println(temp);
	}
}
