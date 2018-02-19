package ie.rbrowne.project.db;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseUtilities {

  private static Connection dbConnection;
  private static boolean initialized;

  private DatabaseUtilities() {

  }

  private static Connection getDBConnection() {
    if (!initialized) {
      ConnectionManager.hostname = "localhost";
      ConnectionManager.port = 1521;
      ConnectionManager.database = "xe";
      ConnectionManager.username = "robbie";
      ConnectionManager.password = "Passw0rd";

      dbConnection = ConnectionManager.getNewConnection();
    }

    return dbConnection;



    // Connection dbConnection = null;
    // try {
    // dbConnection = DriverManager.getConnection("jdbc:oracle:thin:rbrowne/password@db_env:8088/XE");
    // } catch (SQLException e) {
    // System.out.println("Error connecting to database." + e.getMessage());
    // }
    //
    // return dbConnection;
  }

  public static void commit() {
    try {
      dbConnection.commit();
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

  public static void close() {
    try {
      dbConnection.close();
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    initialized = false;
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
