//Guest constructor + methods like calculating their contribution

import java.util.Arrays;

public class Guest {

  String name;
  Food food1;
  Food food2;
  Food food3;
  Food food4;

  Guest() {
    this("");
  }

  Guest(String name) {
    this.name = name;
  }

  Guest(String name, Food food1) {
    this.name = name;
    this.food1 = food1;
  }

  Guest(String name, Food food1, Food food2) {
    this.name = name;
    this.food1 = food1;
    this.food2 = food2;
  }

  Guest(String name, Food food1, Food food2, Food food3) {
    this.name = name;
    this.food1 = food1;
    this.food2 = food2;
    this.food3 = food3;
  }

  Guest(String name, Food food1, Food food2, Food food3, Food food4) {
    this.name = name;
    this.food1 = food1;
    this.food2 = food2;
    this.food3 = food3;
    this.food4 = food4;
  }

  static double totalContribution(Guest inputGuest) {
    double totalContribution = 0;
    if(inputGuest.food1!= null) {
      totalContribution += inputGuest.food1.foodValue;
    }
    if(inputGuest.food2!= null) {
      totalContribution += inputGuest.food2.foodValue;
    }
    if(inputGuest.food3!= null) {
      totalContribution += inputGuest.food3.foodValue;
    }
    if(inputGuest.food4!= null) {
      totalContribution += inputGuest.food4.foodValue;
    }
    return totalContribution;
  }

  static int contributionObjectCount(Guest inputGuest) {
    int contributionObjectCount = 0;
    if(inputGuest.food1!= null) {
      contributionObjectCount += 1;
    }
    if(inputGuest.food2!= null) {
      contributionObjectCount += 1;
    }
    if(inputGuest.food3!= null) {
      contributionObjectCount += 1;
    }
    if(inputGuest.food4!= null) {
      contributionObjectCount += 1;
    }
  return contributionObjectCount;
  }

  static String foodList(Guest inputGuest) { 
    int count = contributionObjectCount(inputGuest);
    String[] foodList = new String[count];
    if(count == 0) {
      return("");
    }
    if(count >= 1) {
      foodList[0] = inputGuest.food1.name;
    }
    if(count >= 2) {
      foodList[1] = inputGuest.food2.name;
    }
    if(count >= 3) {
      foodList[2] = inputGuest.food3.name;
    }
    if(count == 4) {
      foodList[3] = inputGuest.food4.name;
    }
    if(count > 4) {
      return "error: too many objects";
    }
    return Arrays.toString(foodList);
  }
}
