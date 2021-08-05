package java_Practice;

public class Array_make_j_index_double_if_I_J_aresame {

	public static void main(String[] args) {

		int[] A = { 1, 2, 0, 2, 3, 4, 0, 4, 5 };

		for (int i = 0; i < A.length; i++) {
			int j = i + 1;
			if (A[i] != 0) {

				if (A[j] == 0) {
					for (j = i + 1; j < A.length; j++) {
						if (A[j] != 0) {
							break;
						}
					}

					if (A[i] == A[j]) {
						A[j] = A[j] * 2;
						A[i] = 0;
					}
				}
			}
			System.out.println(A[i]);
		}
		// System.out.println(A[A.length-1]);
	}

}
