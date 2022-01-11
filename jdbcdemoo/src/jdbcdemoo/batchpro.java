package jdbcdemoo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class batchpro {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
Connection con=null;
Statement st=null;
Class.forName("com.mysql.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
st=con.createStatement();
		st.addBatch("Insert into c.tenn values(1,'hari',10000)");
		st.addBatch("Insert into c.tenn values(2,'raju',20000)");
		st.addBatch("Insert into c.tenn values(3,'rahul',20000)");
		st.addBatch("update c.tenn set name='praveen' where id=3");
	st.executeBatch();	


		
		
	}

}
