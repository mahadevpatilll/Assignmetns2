package jdbcdemoo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class praperretrive {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con = null;
		PreparedStatement st = null;
		ResultSet rt=null;

		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
		st = con.prepareStatement("select * from xyz.information");
		rt=st.executeQuery();
		while(rt.next()) {
			System.out.println(rt.getInt(1)+" "+rt.getString(2)+" "+rt.getDouble(3));
			//System.out.println(rt.getString(2));
			//System.out.println(rt.getDouble(3));
		}
	}

}
