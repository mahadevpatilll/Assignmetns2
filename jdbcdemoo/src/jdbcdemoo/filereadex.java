package jdbcdemoo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class filereadex {

	public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException {
		Connection con = null;
		Statement st = null;
		ResultSet rst = null;
		FileReader fileReader = new FileReader("C:\\Users\\HP\\Desktop\\raju.txt");
		Properties properties = new Properties();
		properties.load(fileReader);
		Class.forName("com.sql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
		st = con.createStatement();
		rst = st.executeQuery("fileReader");
		while (rst.next()) {
			System.out.println(rst.getInt(1) + "" + rst.getString(2) + "" + rst.getString(3));
		}
	}

}
