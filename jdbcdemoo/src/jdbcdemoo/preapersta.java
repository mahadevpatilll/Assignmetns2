package jdbcdemoo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class preapersta {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement st = null;
		while(true)
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			st = con.prepareStatement("insert into xyz.information values(?,?,?)");
			Scanner s = new Scanner(System.in);
			System.out.println("enter id");
			int i = s.nextInt();
			System.out.println("enter name");
			String n =s.next();
			System.out.println("enter prize");
			int p = s.nextInt();
			st.setInt(1, i);
			st.setString(2, n);
			st.setDouble(3, p);
			st.executeUpdate();
			System.out.println("want to insert one more record(yes,no)");
			String k=s.next();
			if(k.equalsIgnoreCase("no")) {
				break;
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		//con.close;

	}

}
