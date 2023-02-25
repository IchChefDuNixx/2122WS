import java.util.Scanner;

public class CoffeeApp2 {
  public static void main(String[] args) {
    CoffeeCup cup2 = new CoffeeCup(55);
    try {
      Person.drinkCoffee(cup2);
    }
    catch(Exception TemperatureException) {
      System.out.println("current temperature: " + cup2.getTemperature());
      System.out.println(TemperatureException);
      System.out.println("enter new temperature");
      Scanner sc = new Scanner(System.in);
      int txtInput = sc.nextInt();
      while(txtInput <= 30 || txtInput >= 60) {
        if(txtInput <= 30) {
        System.out.println(TemperatureException);
        System.out.println("warm it up");
        txtInput = sc.nextInt();
        cup2.setTemperature(txtInput);
      }else if(txtInput >= 60) {
        System.out.println(TemperatureException);
        System.out.println("cool it down");
        txtInput = sc.nextInt();
        cup2.setTemperature(txtInput);
      }
    }

    }
    finally {
      System.out.println("final temperature: " + cup2.getTemperature());
    }
  }
}
