public class Item {
  private String name;
  private double weight;

  Item() {
    name = "default";
    weight = 0;
  }

  Item(String name, double weight) {
    this.name = name;
    this.weight = weight;
  }

  static String getName(Item inputItem) {
    return inputItem.name;
  }

  static double getWeight(Item inputItem) {
    return inputItem.weight;
  }

  static String toString(Item inputItem) {
    return (getName(inputItem) + " (" + getWeight(inputItem) + "kg) ");
  }
}
