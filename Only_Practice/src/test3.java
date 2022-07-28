import java.util.ArrayList;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList x=new ArrayList();
		
		x.add(2);
		x.add(3);
		x.add(7);
		x.add(7);
		x.add(9);
		
		for(int i=0;i<x.size();i++)
		{
			for(int j=0;j<x.size();j++)
			{
				if(i!=j  && x.get(i).equals(x.get(j)))
				{
					System.out.println(x.get(j));
				}
			}
		}

	}

}
