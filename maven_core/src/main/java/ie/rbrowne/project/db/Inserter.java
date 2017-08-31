package ie.rbrowne.project.db;

import java.sql.SQLException;

public class Inserter {
  private String tableName;

  public Inserter(String tableName) {
    this.tableName = tableName;
  }

  public void insertReversedString(String original, String reversed) {

    String SQL = "INSERT INTO " + tableName + " (original_string, reversed_string) VALUES('" + original + "', '" + reversed + "');";
    try {
      DatabaseUtilities.getDBStatement().executeUpdate(SQL);
    } catch (SQLException e) {
      System.out.println("Error executing statement" + e.getMessage());
    }
  }
}
