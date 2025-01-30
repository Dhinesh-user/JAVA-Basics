package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC_Ex1 {

	public static void main(String[] args) throws  Exception {
//		String url = "jdbc:postgresql://localhost:5432/student";
		String url = "jdbc:postgresql://pg-19223ace-db-demo.h.aivencloud.com:21376"
				+ "  /defaultdb?ssl=require&user=avnadmin&password=************************";
//		String uname = "postgresql";
//		String pass ="0909";
		String sql = "SELECT *from student";
		Class.forName("org.postgresql.Driver");
		Connection con = DriverManager.getConnection(url);
		Statement s = con.createStatement();
		ResultSet result = s.executeQuery(sql);
		while (result.next()) {
	     System.out.print(result.getInt(1)+"-");
//		 System.out.println(result.getInt("SID"));	 
		 System.out.print(result.getString(2)+"-");
//		 System.out.println(result.getString("SNAME"));
		 System.out.println(result.getInt(3));
//		 System.out.println(result.getInt("Marks"));
		
		 }
		
		 
	}
}
//  DataBase Table - student
//	SID SNAME Marks
//	11   DK    50
//	12   VK    60
//	13   HK    80


