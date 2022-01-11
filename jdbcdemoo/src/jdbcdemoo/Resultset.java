package jdbcdemoo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Resultset {
public static void main(String[] args) {
	Connection con=null;
	Statement st=null;
	ResultSet rt=null;
	try {
		Class.forName("com.mysql.jdbc.Driver");
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
	st=	con.createStatement();
	/*st.execute("Delete from pratice.rahul where id=101");*/
	
	rt= st.executeQuery("select * from pratice.rahul");
	while(rt.next()) {
		System.out.println(rt.getInt(1));

	}

		
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	finally {
		if(rt!=null) {
			try {
				rt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(con!=null) {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(st!=null) {
			try {
				st.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
}
}
