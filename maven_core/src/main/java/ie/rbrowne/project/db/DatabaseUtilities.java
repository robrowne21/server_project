package ie.rbrowne.project.db;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseUtilities {

  private DatabaseUtilities() {

  }

  private static Connection getDBConnection() {
    ConnectionManager.hostname = "db_env";
    ConnectionManager.port = 1521;
    ConnectionManager.database = "XE";
    ConnectionManager.username = "rbrowne";
    ConnectionManager.password = "password";

    Connection connection = ConnectionManager.getNewConnection();
    return connection;


    // Connection dbConnection = null;
    // try {
    // dbConnection = DriverManager.getConnection("jdbc:oracle:thin:rbrowne/password@db_env:8088/XE");
    // } catch (SQLException e) {
    // System.out.println("Error connecting to database." + e.getMessage());
    // }
    //
    // return dbConnection;
  }

  public static Statement getDBStatement() {
    Statement stmt = null;
    try {
      stmt = getDBConnection().createStatement();
    } catch (SQLException e) {
      System.out.println("Error creating statement");
    }

    return stmt;
  }

}
