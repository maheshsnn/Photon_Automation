package java_Practice;

public class Replace_String_In_a_String_withoutReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Welcome to Hyderabad capital of Telangana";

		int x = s.lastIndexOf('H');

		String[] y = s.split("capital");
	//	System.out.println(y[0].length());

		String replac = "cyberabad";
		String rep = s.substring(0, x) + replac + s.substring(y[0].length() - 1);
		System.out.println(rep);

	}

}
