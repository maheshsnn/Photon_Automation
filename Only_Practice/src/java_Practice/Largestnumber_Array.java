package java_Practice;

public class Largestnumber_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] s={1,3,5,20,4,6,8};
		
		int largest=s[0];
		int secondl=s[0];
		
		
		for(int i=1;i<s.length;i++)
		{
			if(s[i]>largest)
			{
			largest=s[i];
			}
			/*
			 * else if(s[i]>secondl) { secondl=s[i]; }
			 */
		}
		
		System.out.println(largest);
		//System.out.println(secondl);
		

	}

}
