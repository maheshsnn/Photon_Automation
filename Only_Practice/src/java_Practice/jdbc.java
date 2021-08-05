package java_Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class jdbc {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Class.forName("");

		Connection conn = DriverManager.getConnection("", "", "");

		Statement st = conn.createStatement();

		ResultSet r = st.executeQuery("");

		while (r.next()) {
			System.out.println(r.getString(""));
		}

	}

}
