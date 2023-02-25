import java.util.Arrays;

public class Palindrome {

  static char[] filter(String inputString) {
    char[] tempCharArray = new char[inputString.length()];
    int nonSpace = 0;
    for (int i = 0; i < inputString.length(); i++) {
      tempCharArray[i] = Character.toLowerCase(inputString.charAt(i));
      if (Character.isLetterOrDigit(tempCharArray[i]) == false) {
        tempCharArray[i] = ' ';
      }
      if (tempCharArray[i] != ' ') {
        nonSpace++;
      }
    }

    char[] charArray = new char[nonSpace];
    int j = 0;
    for (int i = 0; i < tempCharArray.length; i++) {
      if (tempCharArray[i] != ' ') {
        charArray[j] = tempCharArray[i];
        j++;
      }
    }
    return charArray;
  }

  static boolean isPalindrome(String inputString) {
    char[] charArray = filter(inputString);
    char[] tempArray = new char[charArray.length];
    int j = charArray.length - 1;
    for (int i = 0; i < charArray.length; i++) {
      tempArray[i] = charArray[j];
      j--;
    }
    if (Arrays.equals(charArray, tempArray)) {
      System.out.println("The string \"" + inputString + "\" is a palindrome.");
      return true;
    } else {
      System.out.println("The string \"" + inputString + "\" is no palindrome.");
      return false;
    }
  }
}
