package jdbcdemoo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class storedqueries {

	public static void main(String[] args) {
Connection con=null;
CallableStatement st=null;
try {
	Class.forName("com.mysql.jdbc.Driver");
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/xyz","root","root");
	st=con.prepareCall("call wwe(?,?,?)");
	Scanner s=new Scanner(System.in);
	
	
	
} catch (ClassNotFoundException | SQLException e) {
	e.printStackTrace();
}

		
		
	}

}
