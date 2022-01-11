package jdbcdemoo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class storedpro {

	public static void main(String[] args) throws SQLException {
		String url = "jdbc:mysql://localhost:3306/xyz";
		Connection connection = null;
		CallableStatement callStatement = null;
		connection = DriverManager.getConnection(url, "root", "root");
		callStatement = connection.prepareCall("call meth(?,?,?)");
		Scanner scan = new Scanner(System.in);
		System.out.println("id");
		int i=scan.nextInt();
		System.out.println("name");
		String s=scan.next();
		System.out.println("price");
		double d=scan.nextDouble();
		callStatement.setInt(1,i);
		callStatement.setString(2, s);
		callStatement.setDouble(3, d);
	callStatement.execute();
	}

}
