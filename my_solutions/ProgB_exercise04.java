import java.util.Arrays;
import java.util.Scanner;

public class ProgB_exercise04 {
/*  public static double max(double[] doubleArray) {

    int arrayLength = doubleArray.length;
    int i = 0;
    double max = doubleArray[0];

    while(i < arrayLength) {

      if(max < doubleArray[i]) {
        max = doubleArray[i];
      }
      i++;
    }
    return(max);
  }


  public static double Indexer(double[] doubleArray) {

    int arrayLength = doubleArray.length;
    int maxIndex = 0;
    int j = 0;
    int n = 0;
    double maxIndices = 0;

    while(j < arrayLength) {

      if(max(doubleArray) == doubleArray[j]) {
        maxIndex = j;
      }
      j++;
    }
    return(maxIndex);
  }


  public static void main(String[] args) {

    double[] doubleArray = new double[5];

    for(int i = 0; i < 5; i++) {

      doubleArray[i] = Math.random();

      System.out.print("RandomNumber "  + doubleArray[i] + "\n");
      }

    System.out.println("max: " + max(doubleArray));
    System.out.println("at index: " + Indexer(doubleArray));

  } */

/*
  public static int[] intersection(int[] arrayOne, int[] arrayTwo) {

    int n = 0;

    for(int i = 0; i < arrayOne.length; i++) {

      for(int j = 0; j < arrayTwo.length; j++) {

        if(arrayOne[i] == arrayTwo[j]) {

          System.out.println(arrayOne[i] + " " + arrayTwo[j] + " hit");
          n++;
        }else{
          System.out.println(arrayOne[i] + " " + arrayTwo[j]);
        }
      }
    }
    System.out.println("amount of hits: " + n);
    int[] intersectionResults = new int[n];





    int k = 0;

    for(int i = 0; i < arrayOne.length; i++) {

      for(int j = 0; j < arrayTwo.length; j++) {

        if(arrayOne[i] == arrayTwo[j]) {

          intersectionResults[k] = arrayOne[i];
          k++;
        }
      }
    }

    return(intersectionResults);
  }


  public static void main(String[] args) {

    int[] intArrayOne = new int[]{0,1,2,3,4,5};
    int[] intArrayTwo = new int[]{3,4,5,6,7,8};
    int[] intArrayThree = new int[]{0,1,2,3};
    int[] intArrayFour = new int[]{4,5,6};
    int[] intArrayFive = new int[]{0,1,2};
    int[] intArraySix = new int[]{0,1,2};


    System.out.println(Arrays.toString(intersection(intArrayOne, intArrayTwo)));
    System.out.println(Arrays.toString(intersection(intArrayThree, intArrayFour)));
    System.out.println(Arrays.toString(intersection(intArrayFive, intArraySix)));
*/

/*
  public static boolean change(double cost, double amountReceived) {

    double a = cost *100;
    double b = amountReceived*100;
    int intCost = (int) a;
    int intAmountReceived = (int) b;
    int n = 0;
    System.out.println("Price: " + cost + "EUR, amount received: " + amountReceived + "EUR ");

    int[] changeOptions = new int[]{50000, 20000, 10000, 5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
    int[] changeAmount = new int[changeOptions.length];

    int change = intAmountReceived - intCost;
    System.out.println("Your change: " + (double) change/100 + "EUR ");

    if(cost > amountReceived) {

      System.out.println("pay up bitch");
      return(false);

    }else{

      for(n = 0; n < changeOptions.length; n++) {

        changeAmount[n] = (change - changeAmount[n]*changeOptions[n])/changeOptions[n];
          change = change - changeAmount[n]*changeOptions[n];
      }
      for(int m = 0; m < changeOptions.length; m++) {

        if(changeAmount[m] > 0) {

          System.out.println(changeAmount[m] + "x " + (double) changeOptions[m]/100 + "EUR ");
        }
      }
      System.out.println("thank you for your purchase");
      }
      return(true);
    }
    public static void main(String[] args) {

      Scanner scanner1 = new Scanner(System.in);
      System.out.println("Enter the price and the amount received: ");

      double price = Double.parseDouble(scanner1.nextLine());
      double amountReceived = Double.parseDouble(scanner1.nextLine());

      change(price, amountReceived);
    }
*/
}
