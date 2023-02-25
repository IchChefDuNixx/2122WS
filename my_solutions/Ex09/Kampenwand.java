public class Kampenwand {
  public static void main(String[] args) {
    Item defaultItem = new Item();
    Item water = new Item("bottle of water", 0.3);
    Item hamSandwich = new Item("ham sandwiches", 0.5);
    Item jacket1 = new Item("Peter's jacket", 1.5);
    Item cheeseSandwich = new Item("cheese sanwiches", 0.7);
    Item chocolate = new Item("chocolate", 0.3);
    Item jacket2 = new Item("Max' jacket", 1.0);
    Item apples = new Item("apples", 0.5);
    Item blanket = new Item("blanket", 2.0);
    Item jacket3 = new Item("Sabine's jacket", 1.0);
    Item bananas = new Item("bananas", 0.5);
    Item frisbee = new Item("frisbee", 0.2);
    Item jacket4 = new Item("Gerda's jacket", 0.7);

    Item[] backpack1 = {water, water, water, water, water, hamSandwich, jacket1};
    Item[] backpack2 = {cheeseSandwich, chocolate, jacket2};
    Item[] backpack3 = {apples, blanket, jacket3};
    Item[] backpack4 = {bananas, frisbee, jacket4};
    Item[] backpack5 = {};

    Hiker peter = new Hiker("Peter", backpack1);
    Hiker max = new Hiker("Max", backpack2);
    Hiker sabine = new Hiker("Sabine", backpack3);
    Hiker gerda = new Hiker("Gerda", backpack4);
    Hiker lazybones = new Hiker("Lazybones", backpack5);

    System.out.println(
    Hiker.getName(max)+ " " +
    Hiker.getBackpackWeight(max)+ " " +
    Hiker.getBackpackContent(max)+ " " +
    Hiker.toString(max));

    System.out.println(max.backpack[0]);
    System.out.println(max.backpack[1]);
    System.out.println(max.backpack[2]);
  }
}
