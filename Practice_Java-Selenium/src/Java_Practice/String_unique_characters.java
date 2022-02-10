package Java_Practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class String_unique_characters {

	public static void main(String args[]) {

		String s = "pranay.vantakala06@gmail.com";

		
		for(int i=0;i<s.length();i++)
		{
			boolean unique= true;
			
			for(int j=0;j<s.length();j++)
			{
				
				if(s.charAt(i)!=s.charAt(j) && i!=j)
				{
					unique=false;
				}
			}
			
			if(unique)
			{
				System.out.print(s.charAt(i));
			//	break;
			}
		}
		
		
		
	}
	
}