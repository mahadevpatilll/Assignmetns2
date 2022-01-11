package jdbcdemoo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class sqlqueriess {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
Connection con=null;
Statement st=null;
ResultSet rst=null;
Class.forName("com.mysql.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
st=con.createStatement();
//rst=st.executeQuery("select * from school.tableof where Id=2");
//rst=st.executeQuery("select * from school.tableof where price in (select max(price) from school.tableof)");
rst=st.executeQuery("rename table school.tableof to school.tablenew");
while(rst.next()) {
	System.out.println(rst.getInt(1)+" "+rst.getString(2)+" "+rst.getDouble(3));

//System.out.println(rst.getString(2));}

	}

}}
