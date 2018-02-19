package ie.rbrowne.project.db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Selector {
  private String tableName;

  public Selector(String tableName) {
    this.tableName = tableName;
  }

  public String selectAll() throws SQLException {
    List<String> ret = new ArrayList<String>();

    String SQL = "SELECT * FROM " + tableName + " order by id";
    System.out.println(SQL);

    ResultSet results = null;
    try {
      results = DatabaseUtilities.getDBStatement().executeQuery(SQL);
    } catch (SQLException e) {
      System.out.println("Error executing statement: " + e.getMessage());
    }


    while (results.next()) {
      ret.add(results.getString("descn"));
    }

    return ret.toString();
  }
}
