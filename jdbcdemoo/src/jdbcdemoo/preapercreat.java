package jdbcdemoo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class preapercreat {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement st = null;
		String s = ("create table c.tenn(Id int,name varchar(30),sal double)");
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			st = con.prepareStatement(s);
			st.execute();

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	
	}

}
