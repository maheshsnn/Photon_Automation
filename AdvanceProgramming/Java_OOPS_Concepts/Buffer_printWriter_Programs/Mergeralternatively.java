package Buffer_printWriter_Programs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;

public class Mergeralternatively {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		PrintWriter pw=new PrintWriter("G:\\EclipseJava\\File4.txt");
		BufferedReader br1=new BufferedReader(new FileReader("G:\\EclipseJava\\File1.txt"));
		BufferedReader br2=new BufferedReader(new FileReader("G:\\EclipseJava\\File2.txt"));
		String line1=br1.readLine();
		String line2=br2.readLine();
		
		while((line1!=null)||(line2!=null))
		{
		if(line1!=null){	
		    pw.println(line1);
			line1=br1.readLine();
		}
		if(line2!=null){
			pw.println(line2);
			line2=br2.readLine();
			}
		}
     pw.flush();
     br1.close();
     pw.close();
	}

}
