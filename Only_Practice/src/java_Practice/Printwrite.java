package java_Practice;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;

public class Printwrite {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		PrintWriter pw = new PrintWriter("D:\\Workplace\\output.txt");

		BufferedReader br1 = new BufferedReader(new FileReader("D:\\Workplace\\Filewriter.txt"));
		String line1 = br1.readLine();
		


		while (line1 != null) {
			boolean available = false;

			BufferedReader br2 = new BufferedReader(new FileReader("D:\\Workplace\\input.txt"));
			String line2 = br2.readLine();

			while (line2 != null) {

				if (line1.equals(line2))

				{
					available = true;
					break;

				}
				line2 = br2.readLine();
			}

			if (available == false) {

				pw.println(line1);
				pw.flush();

			}
			line1 = br1.readLine();

		}
		pw.flush();

		br1.close();
		pw.close();
		// br2.close();
		System.out.println("done");

	}

}
