 package Practice;

public class remove_spaces {

	public static void main(String[] args) {

		StringBuilder removeSpace = new StringBuilder();

		String s = "This is mahesh bethi";

		String withoutspaces = "";

		for (int i = 0; i < s.length(); i++) {
			if (!Character.isWhitespace(s.charAt(i))) {
				removeSpace.append(s.charAt(i));
			}

		}

		System.out.println(removeSpace);

	}
}