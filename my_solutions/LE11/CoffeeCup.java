public class CoffeeCup {
/**
 * 45 degrees Celsius: the best temperature for coffee
 */
public static final int OPTIMUM_TEMPERATURE = 45;
private int temperature;

public CoffeeCup(){
 this.temperature = OPTIMUM_TEMPERATURE;
 }

public CoffeeCup(int temperature){
 this.temperature = temperature;
 }

public int getTemperature(){
 return temperature;
 }

 public void setTemperature(int temperature) {
   this.temperature = temperature;

 }
}
