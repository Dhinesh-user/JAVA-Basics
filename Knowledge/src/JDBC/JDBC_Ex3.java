package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Ex3 {

	public static void main(String[] args) throws ClassNotFoundException, Exception {
		
		String pw = "AVNS_IzSQK5NvZKzHOJ7MO1o";
//		try (final Connection connection =
//                DriverManager.getConnection("jdbc:postgresql:"
//                		+ "//pg-19223ace-db-demo.h.aivencloud.com:21376/"
//                		+ "defaultdb?ssl=require&user=avnadmin&password="
//                		+ "+pw+"
//                		+ "");
//        final Statement statement = connection.createStatement();
//        final ResultSet resultSet = 
//         statement.executeQuery("insert into student values(5,'DK',50)")) {
//    while (resultSet.next()) {
//        System.out.println("Version: " + resultSet.getString("version"));
//    }
//    } catch (SQLException e) {
//        System.out.println("Connection failure.");
//        e.printStackTrace();
//    }
		String url = "jdbc:postgresql:"
				+ "//pg-19223ace-db-demo.h.aivencloud.com:21376/"
				+ "defaultdb?ssl=require&user=avnadmin&password="
				+ "AVNS_IzSQK5NvZKzHOJ7MO1o";
//		Insert a DATA and boolean status gives false as result after inserting
		String query = "insert into defaultdb values(14,'DP',90)";
//		Update a DATA and no need to store the status
//		String query = "update defaultdb set SNAME='MD' where SID=5"
//		Delete a DATA
//		String query = "delete from defaultdb where SID=5"
//		Class.forName("org.postgresql.Driver");
		Connection con = DriverManager.getConnection(url);
		Statement s = con.createStatement();
		boolean status = s.execute(query);
		System.out.println(status);
		
		con.close();

	}

}

//DataBase Table - student
//SID SNAME Marks
//11   DK    50
//12   VK    60
//13   HK    80