package ie.rbrowne.project.main;

import ie.rbrowne.project.string.reverser.StringReverser;

public class Main {
  public static void main(String[] args) {
    String toBeReversed = "attempt";
    StringReverser reverser = new StringReverser();
    reverser.reverseAndSave(toBeReversed);
  }

}
