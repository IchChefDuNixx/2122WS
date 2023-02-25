import java.util.Arrays;

public class Exercise06 {

  public static void main(String[] args) {

    int startingPrice = 1000;
    int endingPrice = 6000;
    int priceStepping = 200;
    int[] basePrice = new int[(endingPrice-startingPrice)/priceStepping+1];
    for(int i = 0; i < basePrice.length; i++) {
      basePrice[i] = i*priceStepping+startingPrice;
    }

    int[] insuranceOne = new int[basePrice.length];
    int[] insuranceTwo = new int[basePrice.length];
    int[] insuranceThree = new int[basePrice.length];
    for(int i = 0; i < basePrice.length; i++) {
      insuranceOne[i] = (int) (basePrice[i]*0.04+50);
      insuranceTwo[i] = (int) (basePrice[i]*0.05);
      insuranceThree[i] = (int) (basePrice[i]*0.035+100);
    }

    String[] bestInsurance = new String[basePrice.length];
    int[] bestInsurancePrice = new int[basePrice.length];
    int[] deltaBestToSecondBest = new int[basePrice.length];
    int[] timesBestInsurance = {0,0,0};
    for(int i = 0; i < basePrice.length; i++) {

      if(insuranceTwo[i] < insuranceOne[i]) {
        if(insuranceThree[i] < insuranceTwo[i]) {
          bestInsurance[i] = "Ins. 3";
          bestInsurancePrice[i] = insuranceThree[i];
          timesBestInsurance[2] += 1;
        }else{
          bestInsurance[i] = "Ins. 2";
          bestInsurancePrice[i] = insuranceTwo[i];
          timesBestInsurance[1] += 1;
        }
      }else{
        if(insuranceThree[i] < insuranceOne[i]) {
          bestInsurance[i] = "Ins. 3";
          bestInsurancePrice[i] = insuranceThree[i];
          timesBestInsurance[2] += 1;
        }else{
          bestInsurance[i] = "Ins. 1";
          bestInsurancePrice[i] = insuranceOne[i];
          timesBestInsurance[0] += 1;
        }
      }

      if(bestInsurancePrice[i] == insuranceOne[i] && bestInsurancePrice[i] == insuranceTwo[i] && bestInsurancePrice[i] == insuranceThree[i]) {
        bestInsurance[i] = "all";
        deltaBestToSecondBest[i] = 0;
        timesBestInsurance[1] += 1;
        timesBestInsurance[2] += 1;
      }else if(bestInsurancePrice[i] == insuranceOne[i] && bestInsurancePrice[i] == insuranceTwo[i]) {
        bestInsurance[i] = "Ins.1+2";
        deltaBestToSecondBest[i] = 0;
        timesBestInsurance[1] += 1;
      }else if(bestInsurancePrice[i] == insuranceTwo[i] && bestInsurancePrice[i] == insuranceThree[i]) {
        bestInsurance[i] = "Ins.2+3";
        deltaBestToSecondBest[i] = 0;
        timesBestInsurance[2] += 1;
      }

      if(bestInsurance[i] == "Ins. 1") {
        if((insuranceTwo[i] - insuranceOne[i]) > (insuranceThree[i] - insuranceOne[i])) {
          deltaBestToSecondBest[i] = insuranceThree[i] - insuranceOne[i];
        }else{
          deltaBestToSecondBest[i] = insuranceTwo[i] - insuranceOne[i];
        }
      }else if(bestInsurance[i] == "Ins. 2") {
        if((insuranceOne[i] - insuranceTwo[i]) > (insuranceThree[i] - insuranceTwo[i])) {
          deltaBestToSecondBest[i] = insuranceThree[i] - insuranceTwo[i];
        }else{
          deltaBestToSecondBest[i] = insuranceOne[i] - insuranceTwo[i];
        }
      }else if(bestInsurance[i] == "Ins. 3") {
        if((insuranceOne[i] - insuranceThree[i]) > (insuranceTwo[i] - insuranceThree[i])) {
          deltaBestToSecondBest[i] = insuranceTwo[i] - insuranceThree[i];
        }else{
          deltaBestToSecondBest[i] = insuranceOne[i] - insuranceThree[i];
        }
      }
    }

    System.out.println("Price" + "\t" + "Ins 1" + "\t" + "Ins 2" + "\t" + "Ins 3" + "\t" + "Best Insurance" + "\t" + "Best Price" + "\t" + "Delta (Best - 2nd best)");
    for(int i = 0; i < basePrice.length; i++) {
    System.out.println(basePrice[i] + "\t" + insuranceOne[i] + "\t" + insuranceTwo[i] + "\t" + insuranceThree[i] + "\t" + bestInsurance[i] + "\t" + "\t" + bestInsurancePrice[i] + "\t" + "\t" + deltaBestToSecondBest[i]);
    }
    System.out.println("");
    System.out.println("Insurance 1 was " + timesBestInsurance[0] + " times the best option.");
    System.out.println("Insurance 2 was " + timesBestInsurance[1] + " times the best option.");
    System.out.println("Insurance 3 was " + timesBestInsurance[2] + " times the best option.");
  }

}

/*
  Task 2:
  a) Type of coffee, strength in amount of milk, kind of cup (paper, porcelain glass), optional additions (extra sugar, sweetener, vanilla syrup)
  b) Type of coffee is always selected. strength is always selected. 1 kind of cup is always selected. milk may be added 0-2 times. the optional things may be added up to once.
  c) Type of coffee, amount of milk and additives, Cup: the type
  d) in pdf
  e) 4
  f) 2
  g) fu //to do
*/
