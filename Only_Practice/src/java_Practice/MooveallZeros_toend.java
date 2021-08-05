
package java_Practice;

public class MooveallZeros_toend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] ax = { 1, 0, 9, 0, 8, 0 };

		int count = 0;

		for (int i = 0; i < ax.length; i++)

		{
			if (ax[i] != 0) {
			//	System.out.println(count+"   "+i);
				ax[count++] = ax[i];
			}
		}

		while (count < ax.length) {
			ax[count++] = 0;
		}

		for (int j = 0; j < ax.length; j++) {
			System.out.println(ax[j]);
		}

	}

}
