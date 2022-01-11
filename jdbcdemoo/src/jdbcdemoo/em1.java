package jdbcdemoo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class em1 {
	
		public static void main(String[] args) {
			Connection con = null;
			Statement st = null;
			try {
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
				st = con.createStatement();
				st.execute("create table wwe.chart(id int, names varchar(30),sal double)");

			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}

		
	}
	
}
