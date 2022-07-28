package java_Practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class hashmap_Stringcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> s = new ArrayList();

		s.add("mahesh");
		s.add("mahesh");
		
		s.add("triv");
		s.add("Moksha");
		s.add("Sravs");
		s.add("Testa");

		HashMap<String, Integer> hs = new HashMap();

		for (int i = 0; i < s.size(); i++) {
			if (hs.containsKey(s.get(i))) {
				hs.put(s.get(i), hs.get(s.get(i))+1);
			} else {
				hs.put(s.get(i), 1);
			}

		}
System.out.println(hs);
	}

}
