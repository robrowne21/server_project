package ie.rbrowne.project.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {

  public static String hostname;
  public static int port;
  public static String database;
  public static String username;
  public static String password;

  private static final String ORACLE_DRIVER_NAME = "oracle.jdbc.driver.OracleDriver";
  private static final String CONN_STRING = "jdbc:oracle:thin:@%s:%s:%s";

  public static Connection getNewConnection() {
    Connection result = null;
    try {
      Class.forName(ORACLE_DRIVER_NAME);
      String url = String.format(CONN_STRING, new Object[] {hostname, Integer.toString(port), database});
      result = DriverManager.getConnection(url, username, password);
      result.setAutoCommit(false);
    } catch (ClassNotFoundException cnfe) {
      cnfe.printStackTrace();
    } catch (SQLException sqle) {
      sqle.printStackTrace();
    }


    return result;
  }

}
