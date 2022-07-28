import java.util.ArrayList;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList x = new ArrayList();
		
		
		
		x.add(2);
		x.add(3);
		x.add(7);
		x.add(7);
		x.add(11);

		int s = x.size();

		for (int i = 0; i < s; i++)

		{
			for (int j = 0; j < s; j++) {

				if (i != j && x.get(i) == x.get(j)) {

					x.remove(j);
					j--;
					s--;

				}

			}
		}
		
		System.out.println(x);

	}

}
