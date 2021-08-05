package java_Practice;

import java.util.ArrayList;
import java.util.List;

public class Non_repetativeString_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> ls = new ArrayList<>();

		ls.add("mahesh");
		ls.add("mahesh");
		ls.add("test");
		ls.add("ns");
		ls.add("mahesh");
		ls.add("sravs");
		ls.add("ns");

		for (int i = 0; i < ls.size(); i++) {
			boolean unique = true;
			for (int j = 0; j < ls.size(); j++) {
				if (i != j && ls.get(i) == ls.get(j)) {
					unique = false;
					break;
				}
			}
			if (unique) {
				System.out.println(ls.get(i));
			}
		}
	}

}
