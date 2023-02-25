//Food as Object with name and value + methods

public class Food {

  String name;
  double foodValue;

  Food() {
    this("", 0);
  }

  Food(String name, double foodValue) {
    this.name = name;
    this.foodValue = foodValue;
  }
}
