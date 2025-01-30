package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Ex2 {

	public static void main(String[] args) {
		String password = "AVNS_IzSQK5NvZKzHOJ7MO1o";
		try (final Connection connection =
                DriverManager.getConnection("jdbc:postgresql:"
                		+ "//pg-19223ace-db-demo.h.aivencloud.com:21376/"
                		+ "defaultdb?ssl=require&user=avnadmin&password= "+password+"");
        final Statement statement = connection.createStatement();
        final ResultSet resultSet = statement.executeQuery("select version()")) {

    while (resultSet.next()) {
        System.out.println("Version: " + resultSet.getString("version"));
    }
    } catch (SQLException e) {
        System.out.println("Connection failure.");
        e.printStackTrace();
    }
}
	

}
