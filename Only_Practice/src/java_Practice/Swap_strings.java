package java_Practice;

public class Swap_strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="Mahesh";
		String s2="Mokshitha";
		
		s1=s1+s2;
		
	
		
	s2=s1.substring(0,s1.length()-s2.length());
	
	System.out.println(s2);
	
	s1=s1.substring(s2.length(), s1.length());
	
	System.out.println(s1);

	}

}
