package ie.rbrowne.project.db;

import java.sql.SQLException;
import java.sql.Statement;

public class Inserter {
  private String tableName;
  private Statement statement;

  public Inserter(String tableName) {
    this.tableName = tableName;
    this.statement = DatabaseUtilities.getDBStatement();
  }

  public void insertReversedString(int id, String desc) {

    String SQL = "INSERT INTO " + tableName + " (id, descn) VALUES (" + id + ", '" + desc + "')";
    System.out.println(SQL);
    try {
      statement.executeUpdate(SQL);
      DatabaseUtilities.commit();
    } catch (SQLException e) {
      System.out.println("Error executing statement" + e.getMessage());
    } finally {
      DatabaseUtilities.close();
    }
  }
}
