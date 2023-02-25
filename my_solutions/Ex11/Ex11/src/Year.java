import java.util.Scanner;
import java.time.LocalDate;

public class Year {
  private int year;
  Year() {
    year = 0;
  }
  Year(int year) {
    this.year = year;
  }
  public int getYear() {
    return year;
  }
  public void setYear(int year) {
    this.year = year;
  }

  public static int requestBirthYear() {
    int c = 0;
    Scanner sc = new Scanner(System.in);
    String consoleInput = new String();
    int inputYear = 0;
    while(inputYear == 0) {
      try {
        if(c == 0) {
          System.out.println("enter your birth year:");
          c++;
        }else{
          System.out.println("enter new birth year:");
          c++;
        }
        consoleInput = sc.nextLine();
        inputYear = Integer.parseInt(consoleInput);
        yearOutOfBoundsCheck(inputYear);
      }
      catch (NumberFormatException num) {
        System.out.println(num);
      }
      catch (IllegalYearException yex) {
        System.out.println(yex);
        inputYear = 0;
      }
    }
    return inputYear;
  }

  public static boolean yearOutOfBoundsCheck(int inputYear) throws IllegalYearException {
    int lowerBound = 1900;
    LocalDate current_date = LocalDate.now();
    int upperBound = current_date.getYear();

    if(inputYear >= lowerBound && inputYear <= upperBound) {
      return true;
    }else{
      throw new IllegalYearException("birth year must be between " + lowerBound + " and " + upperBound);
    }
  }
}
