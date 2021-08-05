package java_Practice;

public class RemoveDuplicates_fromAnarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] s = { "mahesh", "mahesh","ABCC", "Century", "ABCC" };
		int y = s.length;
		for (int i = 0; i < y; i++) {
			for (int j = i + 1; j < y; j++) {

				if (s[i].compareTo(s[j]) == 0) {
					s[j] = s[y - 1];
					y--;
					j--;
				}

			}
			
			System.out.println(s[i]);

		}
	
		
	
	/*int[] s={1,1,2,2,3,3};
	int y = s.length;
	for (int i = 0; i < y; i++) {
		for (int j = i + 1; j < y; j++) {

			if (s[i]==(s[j])) {
				s[j] = s[y - 1];
				y--;
				j--;
			}

		}
		
		System.out.println(s[i]);

	}*/
	
	}
}