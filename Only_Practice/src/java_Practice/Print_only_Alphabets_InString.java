package java_Practice;

public class Print_only_Alphabets_InString {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="ABCD12CD";
		
	//	System.out.println(Character.valueOf('1'));
		
		for(int i=0;i<s.length();i++)
		{
			if(Character.isAlphabetic(s.charAt(i)))
			{
				System.out.print(s.charAt(i));
				
	
			}
		}
		

	}

}
