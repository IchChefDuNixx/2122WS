

public class CoffeeApp1 {
  public static void main(String[] args) {
    CoffeeCup cup1 = new CoffeeCup(25);
    try {
      Person.drinkCoffee(cup1);
    }
    catch(Exception TemperatureException) {
      System.out.println(TemperatureException);
    }
    finally {
      System.out.println("still drank it");
    }
  }
}
