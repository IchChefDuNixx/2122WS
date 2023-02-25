import java.util.Scanner;

public class AdvancedSalaryBasics
{
  public static void main(String[] args)
  {

    Scanner scanner1 = new Scanner(System.in);
    Scanner scanner2 = new Scanner(System.in);
    Scanner scanner3 = new Scanner(System.in);
    Scanner scanner4 = new Scanner(System.in);

    System.out.println("Enter your hourly wage");
    float Salary = scanner1.nextFloat();

    System.out.println("Enter your time spent working");
    float timeWorked = scanner2.nextFloat();

    System.out.println("Of those, how many were overtime...");
    float overtimeHours = scanner3.nextFloat();

    System.out.println("...and how many on holidays?");
    float holidayHours = scanner4.nextFloat();

    if (overtimeHours + holidayHours > timeWorked) {
      System.out.println("Error: overtimeHours + holidayHours exceeds timeWorked");
      return;
    };

    double totalEarned = (timeWorked-overtimeHours-holidayHours)*Salary + overtimeHours*1.25*Salary + holidayHours*17.50;
    int percentOvertime = Math.round(100*overtimeHours/timeWorked);
    int percentHolidays = Math.round(100*holidayHours/timeWorked);

    System.out.println("\n" + "Your hourly wages for weekdays, overtime and holidays are " + Salary + ", " + Salary*1.25 + ", " + "17.50 " + "respectively.");
    System.out.println("Your time spent working is " + timeWorked + " hours, (" + percentOvertime + "% in overtime)" + " and (" + percentHolidays + "% on holidays)");
    System.out.println("You earned " + totalEarned + "EUR this month");
  }
}
