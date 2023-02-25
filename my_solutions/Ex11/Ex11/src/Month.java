import java.util.Scanner;

public class Month {
  private int month;
  Month() {
    month = 0;
  }
  Month(int month) {
    this.month = month;
  }
  public int getMonth() {
    return month;
  }
  public void setMonth(int month) {
    this.month = month;
  }

  public static int requestBirthMonth() {
    int c = 0;
    Scanner sc = new Scanner(System.in);
    String consoleInput;
    int inputMonth = 0;
    while(inputMonth == 0) {
      try {
        if(c == 0) {
          System.out.println("enter your birth month:");
          c++;
        }else{
          System.out.println("enter new birth month:");
          c++;
        }
        consoleInput = sc.nextLine();
        inputMonth = Integer.parseInt(consoleInput);
        monthOutOfBoundsCheck(inputMonth);
      }
      catch (NumberFormatException num) {
        System.out.println(num);
      }
      catch (IllegalMonthException mex) {
        System.out.println(mex);
        inputMonth = 0;
      }
    }
    return inputMonth;
  }

  public static boolean monthOutOfBoundsCheck(int inputMonth) throws IllegalMonthException {
    int lowerBound = 1;
    int upperBound = 12;

    if(inputMonth >= lowerBound && inputMonth <= upperBound) {
      return true;
    }else{
      throw new IllegalMonthException("birth month must be between " + lowerBound + " and " + upperBound);
    }
  }
}
