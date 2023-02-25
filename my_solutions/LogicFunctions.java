import java.util.Random;

public class LogicFunctions {
  public static void main(String[] args) {
    boolean input1 = true;
    boolean input2 = true;
    boolean input3 = true;
    if (input1 && input2 && input3 == true) {
      System.out.println("works good");
    } else {
    if (input1 && input2 == true || input2 && input3 == true || input1 && input3 == true) {
      System.out.println("kinda works");
    } else {
      System.out.println("problem");
    }
  }


  Random random1 = new Random();
  int x = random1.nextInt(10);
  System.out.println(x);

}
}
