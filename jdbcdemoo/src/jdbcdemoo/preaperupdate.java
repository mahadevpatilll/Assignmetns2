package jdbcdemoo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class preaperupdate {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement st = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			st = con.prepareStatement("update xyz.information set price=?,name=?" + " where id=?");
			Scanner s = new Scanner(System.in);
			System.out.println("price");
			int n = s.nextInt();
			System.out.println("name");
			String i = s.next();
			System.out.println("id");
			double d = s.nextDouble();
			st.setInt(1, n);
			st.setString(2, i);
			st.setDouble(3, d);
			st.executeUpdate();
//System.out.println();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}
