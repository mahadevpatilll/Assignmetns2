package jdbcdemoo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class prepareddelet {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con=null;
		//PreparedStatement st=null;
		Statement st=null;
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
		//st=con.prepareStatement("delete from xyz.information where id=? ");
		st=con.createStatement();
		String q="alter table xyz.information add kk int not null";
//		Scanner s=new Scanner(System.in);
//		System.out.println("enter Id");
//		int i=s.nextInt();
//		st.setInt(1, i);
		st.executeUpdate(q);
	}

}
//alter programm
