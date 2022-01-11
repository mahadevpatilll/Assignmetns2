package jdbcdemoo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class create {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			st = con.createStatement();
			//st.execute("create table xyz.information(id int,name varchar(30),price double)");
			//st.execute("Insert into xyz.information values(10,'mahadev',120.2)");
			//st.execute("update xyz.information set name='praveen' where id = 10");
			//;st.execute("insert into xyz.information values(103,'raju',105.8)")
			//st.execute("delete from xyz.information where id=103");
			st.execute("insert into xyz.information values(103,'raju',105.8");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (st != null) {
				try {
					st.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}

			}
		}

	}
}
