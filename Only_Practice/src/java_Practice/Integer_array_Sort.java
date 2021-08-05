
package java_Practice;

public class Integer_array_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 0, 9, 4, 8, 5, 0, 4, 3 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];

					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.print(arr[i]);
		}

	}

}
