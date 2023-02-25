public class switchcase {
  public static void main(String[] args) {


    int volume = 300;
    if (volume == 125){
      System.out.println("The glass is half full!");
    } else {
    if (volume >= 250){
      System.out.println("The glass is full!");
    } else {
        System.out.println("The glass is not full");
      }
    }


    int grade = 4;
    switch (grade) {
      case 1:
      System.out.println("eins");
      break;
      case 2:
      System.out.println("zwei");
      break;
      case 3:
      System.out.println("drei");
      break;
      case 4:
      System.out.println("vier");
      break;
      case 5:
      System.out.println("fünf");
      break;
      case 6:
      System.out.println("sechs");
      break;
      }


    int counter = 0;
    while (counter <= 50) {
      float remainder = counter % 3;
      if (remainder < 1 % 3) {
        System.out.println(counter);
      }
      counter = counter + 1;
    }


    String one = ". Round start - let's go:";
    String two = ". Pushup";
    int i = 1;
    int i2 = 1;
    while (i <= 3) {
      System.out.println(i + one);
      while (i2 <= 10) {
        System.out.println(i2 + two);
        i2 = i2 + 1;
      }
      i = i + 1;
      i2 = 1;
    }


    for (int i3 = 10; i3 > 0; i3--) {
      System.out.println(i3 + "s left");
      try {
      Thread.sleep(1000);
      }catch(InterruptedException ex){
      }
    }
    System.out.println("Time's up");
  }
}
