package java_Practice;

public class GetFilename_frompath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "D:\\Workplace\\AUTOIT.exe";

		String[] s1 = s.split("\\.");
		
		System.out.println(s1[0]);

		int r = s1[0].lastIndexOf("\\");

		String y = s1[0].substring(r + 1, s1[0].length());
		System.out.println(y);

	}

}
