package jdbcdemoo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Batch {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
Connection con=null;
PreparedStatement st=null;
Class.forName("com.mysql.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
st=con.prepareStatement("insert into school.tableof values(?,?,?)");
while(true) {
Scanner s=new Scanner(System.in);
System.out.println("id");
int n=s.nextInt();
System.out.println("name");
String i=s.next();
System.out.println("sal");
double d=s.nextDouble();
st.setInt(1, n);
st.setString(2, i);
st.setDouble(3, d);
st.executeUpdate();
System.out.println("yes,no");
String k=s.next();

if(k.equalsIgnoreCase("no")) {
	break;
}
}	}}

