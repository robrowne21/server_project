package ie.rbrowne.project.string.utilities;

public class StringUtilities {
  public static String reverse(String toBeReversed) {
    char[] charArray = toBeReversed.toCharArray();
    char[] reversedCharArray = new char[charArray.length];

    for (int i = 0; i < charArray.length; i++) {
      reversedCharArray[charArray.length - i - 1] = charArray[i];
    }

    return new String(reversedCharArray);
  }
}
