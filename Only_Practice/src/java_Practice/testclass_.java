package java_Practice;

public class testclass_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] x = { 2, 2, 3, 0, 0, 9, 7, 0 };
		
		int count=0;
		
		for(int i=0;i<x.length;i++)
		{
			if(x[i]!=0)
			{
				x[count++]=x[i];
			}
		}
		
		while(count<x.length)
		{
			x[count++]=0;
		}
		
		for(int j=0;j<x.length;j++)
		{
			System.out.println(x[j]);
		}

	}

}
