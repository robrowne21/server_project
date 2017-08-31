package ie.rbrowne.project.string.reverser;

import ie.rbrowne.project.db.Inserter;
import ie.rbrowne.project.string.utilities.StringUtilities;

public class StringReverser {
  public void reverseAndSave(String toBeReversed) {
    String reversed = StringUtilities.reverse(toBeReversed);

    // StringBuilder sb = new StringBuilder(toBeReversed);
    //
    // System.out.println(sb.reverse().toString());
    // System.out.println(reversed);

    Inserter inserter = new Inserter("STRING_REVERSE");
    inserter.insertReversedString(toBeReversed, reversed);
  }



}
