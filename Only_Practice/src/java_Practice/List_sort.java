package java_Practice;

import java.util.ArrayList;
import java.util.List;

public class List_sort {

	public static void main(String[] args) {

		List<String> ar = new ArrayList<String>();

		ar.add("Mahesh");
		ar.add("Abc");
		ar.add("Century");
		ar.add("Abc");

		int y = ar.size();

		for (int i = 0; i < y; i++) {
			for (int j = i + 1; j < y; j++) {
				
			
				/*if (ar.get(i).compareTo(ar.get(j)) > 0) {
					String temp = ar.get(i);
					ar.set(i, ar.get(j));
					ar.set(j, temp);
				}*/
				
			// duplicates
				
				
				if(ar.get(i).compareTo(ar.get(j))==0)
				{
					ar.remove(ar.get(j));
					y--;
					j--;
				}
				

			}
			System.out.println(ar.get(i));
		}

	}

}
