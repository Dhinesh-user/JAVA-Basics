package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_EX {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url
        = "jdbc:mysql://localhost:3306/table_name"; // table details
    String username = "rootgfg"; // MySQL credentials
    String password = "gfg123";
    String query  = "select *from students"; // query to be run
    Class.forName("com.mysql.cj.jdbc.Driver"); // Driver name
//    Registering drivers
//    DriverManager.registerDriver(
//        new oracle.jdbc.OracleDriver());

    Connection con = DriverManager.getConnection(url, username, password);
    System.out.println("Connection Established successfully");
    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery(query); // Execute query
    rs.next();// push the controller to first line of data if it is in before the firstlin
//    returns true if it is has data in nextline.
    String name = rs.getString("name"); // Retrieve name from db

    System.out.println(name); // Print result on console
    st.close(); // close statement
    con.close(); // close connection
    System.out.println("Connection Closed....");
}

}
