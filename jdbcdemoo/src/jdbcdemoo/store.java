package jdbcdemoo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class store {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con = null;
		CallableStatement st = null;
		String url = "jdbc:mysql://localhost:3306/xyz";
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection(url, "root", "root");
//		st = con.prepareCall("call hi(?,?,?)");
		Scanner sc = new Scanner(System.in);
//		System.out.println("id");
//		int i = sc.nextInt();
//		System.out.println("name");
//		String s = sc.next();
//		System.out.println("sal");
//		double d = sc.nextDouble();
//		//st.setInt(1, i);
//		st.setString(2, s);
//		//st.setDouble(3, d);
//		st.execute();
	
//		st = con.prepareCall("call hello(?)");
//		String s=sc.next();
//		st.setString(1, s);
//        st.execute();
}
}