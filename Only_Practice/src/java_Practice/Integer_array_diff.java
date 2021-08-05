package java_Practice;

public class Integer_array_diff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] comp = { 2, 4, 5, 0, 0, 5, 5, 4, 8, 6, 0, 6, 8 };

		int ar = comp.length;

		for (int i = 0; i<=comp.length; i++) {
		//	System.out.println("**"+i);


			int j = i + 1;

			for (int k = 0; k <= ar; k++) {

				if (comp[j] == 0) {

					j = j + 1;

					if (comp[j] != 0) {
						break;
					}
				}
			}

			if (comp[i] == comp[j]) {
				comp[i] = 0;
				comp[j] = comp[j] * 2;
			}

			System.out.println(i+ "    "+comp[i]);
			
		}

	}
}