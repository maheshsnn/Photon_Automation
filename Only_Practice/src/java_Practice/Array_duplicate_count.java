package java_Practice;

public class Array_duplicate_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] x = { 1, 1, 5, 2, 2, 2, 3, 3, 4 ,6};

		for (int i = 0; i < x.length; i++) {
			boolean unique = true;

			for (int j = 0; j < x.length; j++) {
				if (i != j && x[i] == x[j]) {
					unique = false;

				}

			}

			if (unique) {
				System.out.println(x[i]);
				//break;
			}

		}

	}

}
