import java.util.Scanner;

public class CoffeeApp3 {
  public static void main(String[] args) {
    CoffeeCup c1 = new CoffeeCup(25);
    CoffeeCup c2 = new CoffeeCup(80);
    try {
      Person.drinkCoffee(c1);
    }
    catch(Exception TemperatureException) {
      System.out.println("current temperature: " + c1.getTemperature());
      System.out.println(TemperatureException);
      System.out.println("enter new temperature");
      Scanner sc = new Scanner(System.in);
      int txtInput = sc.nextInt();
      while(txtInput <= 30 || txtInput >= 60) {
        if(txtInput <= 30) {
        System.out.println(TemperatureException);
        System.out.println("warm it up");
        txtInput = sc.nextInt();
        c1.setTemperature(txtInput);
      }else if(txtInput >= 60) {
        System.out.println(TemperatureException);
        System.out.println("cool it down");
        txtInput = sc.nextInt();
        c1.setTemperature(txtInput);
      }
    }

    }
    finally {
      System.out.println("final temperature: " + c1.getTemperature());
    }
    try {
      Person.drinkCoffee(c2);
    }
    catch(Exception TemperatureException) {
      System.out.println("current temperature: " + c2.getTemperature());
      System.out.println(TemperatureException);
      System.out.println("enter new temperature");
      Scanner sc = new Scanner(System.in);
      int txtInput = sc.nextInt();
      while(txtInput <= 30 || txtInput >= 60) {
        if(txtInput <= 30) {
        System.out.println(TemperatureException);
        System.out.println("warm it up");
        txtInput = sc.nextInt();
        c2.setTemperature(txtInput);
      }else if(txtInput >= 60) {
        System.out.println(TemperatureException);
        System.out.println("cool it down");
        txtInput = sc.nextInt();
        c2.setTemperature(txtInput);
      }
    }

    }
    finally {
      System.out.println("final temperature: " + c2.getTemperature());
    }
  }
}
