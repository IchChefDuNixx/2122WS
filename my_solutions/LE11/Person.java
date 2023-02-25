import java.util.Scanner;

public class Person {
  static final int TOO_COLD = 30;
  static final int TOO_HOT = 60;

  static void drinkCoffee(CoffeeCup inputCoffeeCup) throws Exception{
    int temp = inputCoffeeCup.getTemperature();
    if(temp <= TOO_COLD) {
      throw new TooColdException("too cold");
    }else if(temp >= TOO_HOT) {
      throw new TooHotException("too hot");
    }
    System.out.println("drank successfully");
  }

}
