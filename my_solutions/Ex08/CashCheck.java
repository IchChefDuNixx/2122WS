//short main method and execution of other methods + data insertion

public class CashCheck {
  public static void main(String[] args) {

    Food oliveOil = new Food("olive oil", 3.50);
    Food pasta = new Food("pasta", 1.50);
    Food tomatoSugo = new Food("tomato sugo", 2.25);
    Food mincedMeat = new Food("minded meat", 3.50);
    Food garlic = new Food("garlic", 0.50);
    Food onion = new Food("onion", 0.50);
    Food mulledWine = new Food("bottle of mulled wine", 3.50);

    Food biscuits = new Food("biscuits", 4.50);
    Food beerCrate = new Food("crate of beer", 12.50);
    Food wineCrate = new Food("crate of mulled wine", 18.00);
    Food gingerbread = new Food("gingerbread", 12.00);

    Guest max1 = new Guest("Max", oliveOil, pasta, tomatoSugo);
    Guest sarah1 = new Guest("Sarah", mincedMeat, garlic, onion);
    Guest peter1 = new Guest("Peter", mulledWine);
    Guest mary1 = new Guest("Mary");

    Guest harald2 = new Guest("Harald", biscuits);
    Guest greta2 = new Guest("Greta", beerCrate);
    Guest simon2 = new Guest("Simon", wineCrate);
    Guest charly2 = new Guest("Charly", gingerbread, gingerbread, gingerbread, gingerbread);
    Guest maria2 = new Guest("Maria");
    Guest max2 = new Guest("Max");
    Guest peter2 = new Guest("Peter");
    Guest sylvia2 = new Guest("Sylvia");

    Guest[] cookingParty1 = {max1, sarah1, peter1, mary1};
    Guest[] cookingParty2 = {harald2, greta2, simon2, charly2, maria2, max2, peter2, sylvia2};
    SettlingUp.Output("6.12.21", cookingParty1);
    SettlingUp.Output("23.12.21", cookingParty2);
  }
}
