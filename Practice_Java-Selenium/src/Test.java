import org.apache.poi.util.SystemOutLogger;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Welcome To Hyderabad capital of telangana";

		int x = s.length();
		String rep = "cyberabad";

		int u = s.indexOf("Hyderabad");
		String[] y = s.split("capital");
		

		String i=y[0].substring(11, y[0].length());
		System.out.println(y[0].length());

		
		  String res=s.substring(0, 11)+rep+s.substring(y[0].length()-1); 
		  System.out.println(res);
		 

	}

}
