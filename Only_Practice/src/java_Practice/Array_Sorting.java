package java_Practice;

public class Array_Sorting {

	public static void main(String[] args) {

		String[] s = { "mahesh", "ABCC", "Century", "ABCC" };
		int y = s.length;
		for (int i = 0; i < y; i++) {
			for (int j = i + 1; j < y; j++) {	

				if (s[i].compareTo(s[j]) == 0) {
					s[j] = s[y - 1];
					y--;
					j--;
				}
				
				  if (s[i].compareTo(s[j]) > 0) 
				  {
				   String temp = s[i]; 
				   s[i] = s[j]; 
				   s[j] = temp; 
				   }
				 

			}
			System.out.println(s[i]);
		}

	}

}
