package jdbcdemoo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.jdbc.CallableStatement;

public class stprocedure {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
Connection con=null;
Statement st=null;
CallableStatement callst=null;
		
Class.forName("com.mysql.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
	callst=(CallableStatement) con.prepareCall("call ohhhh(?,?,?)");
	Scanner s=new Scanner(System.in);
	System.out.println("id");
	int i=s.nextInt();
	System.out.println("name");
	String n=s.next();
	System.out.println("price");
	double d=s.nextDouble();
	callst.setInt(1, i);
	callst.setString(2, n);
	callst.setDouble(3, d);
	}

}
