package java_Practice;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] comp = { 2, 4, 5, 0, 0, 5, 5, 4, 8, 6, 0, 6, 8 };

		int count = 0;

		for (int i = 0; i < comp.length; i++) {

			if (comp[i] != 0) {
				int j = i + 1;

				for (j = 0; j < comp.length; j++) {
					if (comp[j] == 0 && (j) < comp.length) {
						j = j + 1;
					} else {
						break;
					}
				}

				if (comp[i] == comp[j]) {

					comp[i] = 0;
					comp[j] = comp[j] * 2;

				}
			}
			System.out.println(comp[i]);

		}
	}

}
