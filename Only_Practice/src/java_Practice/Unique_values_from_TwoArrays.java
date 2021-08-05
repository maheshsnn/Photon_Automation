package java_Practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Unique_values_from_TwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] x = { "mahesh", "sanjay", "valuelabs" };
		String[] y = { "mahesh", "sanjay", "valuemomentum" };

         List<String> m1=Arrays.asList(x);
         List<String> m2=Arrays.asList(y);
         
         Set<String>union=new HashSet<String>(m1);
         union.addAll(m2);
         
         Set<String>interc=new HashSet<String>(m1);
         interc.retainAll(m2);
         
         union.removeAll(interc);
         
         for(String n:union)
         {
        	 System.out.println(n);
         }
         
         

		/*
		 * List<String> m1 = Arrays.asList(x); List<String> m2 =
		 * Arrays.asList(y);
		 * 
		 * Set<String> union = new HashSet<String>(m1); union.addAll(m2);
		 * 
		 * Set<String> intersection = new HashSet<String>(m1);
		 * intersection.retainAll(m2);
		 * 
		 * union.removeAll(intersection);
		 * 
		 * System.out.println(intersection); // Print the result for (String n :
		 * union) { System.out.println(n); }
		 */

	}

}
