import java.util.Arrays;

public class Hiker {
  //to do: reset private
  String name;
  Item[] backpack;
  Item[] emptyArray = new Item[0];

  Hiker() {
    name = "default";
    backpack = this.emptyArray;
  }

  Hiker(String name, Item[] backpack) {
    this.name = name;
    this.backpack = backpack;
  }

  static String getName(Hiker inputHiker) {
    return inputHiker.name;
  }

  static double getBackpackWeight(Hiker inputHiker) {
    double backpackWeight = 0;
    for(int i = 0; i < inputHiker.backpack.length; i++) {
      backpackWeight += Item.getWeight(inputHiker.backpack[i]);
    }
    return backpackWeight;
  }

  void pack(Item inputItem) {

  }

  void empty() {

  }

  static String getBackpackContent(Hiker inputHiker) {
    String backpackContent = "";
    for (int i = 0; i < inputHiker.backpack.length; i++) {
      System.out.println(inputHiker.backpack[i].toString());
      backpackContent = backpackContent + inputHiker.backpack[i].toString();
    }
    return backpackContent;
  }

  static String toString(Hiker inputHiker) {
    return getName(inputHiker) + ": " + getBackpackContent(inputHiker) + getBackpackWeight(inputHiker);
  }
}
