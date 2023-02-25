import java.util.Scanner;

public class Day {
  private int day;

  Day() {
    day = 0;
  }

  Day(int day) {
    this.day = day;
  }

  public int getDay() {
    return day;
  }

  public void setDay(int day) {
    this.day = day;
  }

  public static int requestBirthDay(int month) {
    int c = 0;
    Scanner sc = new Scanner(System.in);
    String consoleInput;
    int inputDay = 0;
    while (inputDay == 0) {
      try {
        if (c == 0) {
          System.out.println("enter your birth day:");
          c++;
        } else {
          System.out.println("enter new birth day:");
          c++;
        }
        consoleInput = sc.nextLine();
        inputDay = Integer.parseInt(consoleInput);
        dayOutOfBoundsCheck(inputDay, month);
      } catch (NumberFormatException num) {
        System.out.println(num);
      } catch (IllegalDayException dex) {
        System.out.println(dex);
        inputDay = 0;
      }
    }
    return inputDay;
  }

  public static boolean dayOutOfBoundsCheck(int inputDay, int month) throws IllegalDayException {
    int[] shortArray = { 0, 4, 6, 7, 9, 11 };
    int[] longArray = { 1, 3, 5, 8, 10, 12 };
    boolean inShort = false;
    boolean inLong = false;
    for (int i = 0; i < shortArray.length; i++) {
      if (month == shortArray[i]) {
        inShort = true;
      } else if (month == longArray[i]) {
        inLong = true;
      }
    }

    if (inShort == true) {
      if (inputDay >= 1 && inputDay <= 30) {
        return true;
      } else {
        throw new IllegalDayException("birthday must be between 1 and 30");
      }
    } else if (inLong == true) {
      if (inputDay >= 1 && inputDay <= 31) {
        return true;
      } else {
        throw new IllegalDayException("birthday must be between 1 and 31");
      }
    } else {
      if (inputDay > 0 && inputDay <= 29) {
        return true;
      } else {
        throw new IllegalDayException("birthday must be between 1 and 28");
      }
    }
  }
}
