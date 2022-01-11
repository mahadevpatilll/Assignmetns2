package jdbcdemoo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;

public class trans {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
Connection con=null;
Statement st=null;
Savepoint setSavepoint=null;
Class.forName("com.mysql.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
st=con.createStatement();
con.setAutoCommit(false);
st.execute("Insert into xyz.information values(21,'rajjjaa',62.2)");
st.execute("Insert into xyz.information values(1,'Unlocking by fingerprint',45)");
st.execute("Insert into xyz.information values(2,'Entering the pin',87)");
setSavepoint = con.setSavepoint();
st.execute("Insert into xyz.information values(21,'rajjjaa',62.2)");
st.execute("Insert into xyz.information values(1,'Unlocking by fingerprint',45)");
st.execute("Insert into xyz.information values(2,'Entering the pin',87)");



	}

}
