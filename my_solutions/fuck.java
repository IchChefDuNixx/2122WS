import javax.swing.*;
import java.util.Scanner;

public class fuck
{
  public static void main(String[] args)
    {
/*
    JFrame jframe = new JFrame();
    float getMessage = Float.parseFloat(JOptionPane.showInputDialog(jframe, "Enter your hourly wage"));
    if (getMessage == 1)
    {
    JOptionPane.showMessageDialog(jframe, "cock!");
    }
    else{ JOptionPane.showMessageDialog(jframe, "cock?");
    }
*/


  {

    JFrame jframe1 = new JFrame();
    float Salary = Float.parseFloat(JOptionPane.showInputDialog(jframe1, "Enter your hourly wage"));

    JFrame jframe2 = new JFrame();
    float timeWorked = Float.parseFloat(JOptionPane.showInputDialog(jframe2, "Enter your time spent working"));

    JFrame jframe3 = new JFrame();
    float overtimeHours = Float.parseFloat(JOptionPane.showInputDialog(jframe3, "Of those, how many were overtime..."));

    JFrame jframe4 = new JFrame();
    float holidayHours = Float.parseFloat(JOptionPane.showInputDialog(jframe4, "...and how many on holidays?"));

    if (overtimeHours + holidayHours > timeWorked) {
      System.out.println("Error: overtimeHours + holidayHours exceeds timeWorked");
      return;
    };

    double totalEarned = (timeWorked-overtimeHours-holidayHours)*Salary + overtimeHours*1.25*Salary + holidayHours*17.50;
    int percentOvertime = Math.round(100*overtimeHours/timeWorked);
    int percentHolidays = Math.round(100*holidayHours/timeWorked);
/*
    System.out.println("\n" + "Your hourly wages for weekdays, overtime and holidays are " + Salary + ", " + Salary*1.25 + ", " + "17.50 " + "respectively.");
    System.out.println("Your time spent working is " + timeWorked + " hours, (" + percentOvertime + "% in overtime)" + " and (" + percentHolidays + "% on holidays)");
    System.out.println("You earned " + totalEarned + "EUR");
*/
    JOptionPane.showMessageDialog(null, "Your hourly wages for weekdays, overtime and holidays are " + Salary + ", " + Salary*1.25 + ", " + "17.50 " + "respectively" + "\n" +
                                        "Your time spent working is " + timeWorked + " hours, (" + percentOvertime + "% in overtime)" + " and (" + percentHolidays + "% on holidays)" + "\n" +
                                        "You earned " + totalEarned + "EUR");
    return;
    }
  }
}
