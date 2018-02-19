package ie.rbrowne.project.main;

import java.sql.SQLException;

import ie.rbrowne.project.db.Inserter;
import ie.rbrowne.project.db.Selector;

public class Main {
  public static void main(String[] args) {
    int id = 1;
    String desc = "oldest";

    Selector selector = new Selector("TEMP_TABLE");
    String allRows = null;
    try {
      allRows = selector.selectAll();
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

    System.out.println(allRows);

    Inserter inserter = new Inserter("TEMP_TABLE");
    inserter.insertReversedString(id, desc);
    
    try {
        allRows = selector.selectAll();
      } catch (SQLException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }

      System.out.println(allRows);
  }

}
