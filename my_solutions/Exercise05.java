import java.util.Arrays;

public class Exercise05 {

  public static void main(String[] args) {

    //System.out.println(primeTest(3));

    charCounter("cascbkbhbs caskcbhk, ilhjbhkasc");

    //double[] test = new double[]{5,9,574,3};
    //System.out.println(Arrays.toString(append(test, 123)));

    //int[] sortedArray = new int[]{0,1,2,3,4,5,6,9,10};
    //binarySearch(sortedArray, 2);

    //final double wage = 15.0;
    //final double factor = 1.15;
    //double[] hoursArray = new double[]{4,8,4,9,6};
    //System.out.println(earnings(hoursArray, wage, factor));
    //System.out.println(earnings(append(hoursArray, 5), wage, factor));
    //System.out.println(earnings(remove(hoursArray, 2), wage, factor));
    }

    /*public static boolean primeTest(int a) {
        boolean isPrime = true;
        for(int i = 3; i < a; i = i + 2) {
            System.out.println(i);
            if(a % i == 0) {
                isPrime = false;
                break;
            }
        }
        return(isPrime);
    }*/

   public static void charCounter(String input) {
       System.out.println(input.length());
       char[] alphabet = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
       int[] frequency = new int[alphabet.length];
       char[] charArray = new char[input.length()];
       for(int i = 0; i < input.length(); i++) {
           charArray[i] = input.charAt(i);
       }
       System.out.println(charArray);
       System.out.println("");

       for(int j = 0; j < input.length(); j++) {
         for(int k = 0; k < alphabet.length; k++) {
           if(charArray[j] == alphabet[k]) {
             frequency[k] += 1;
           }
         }
       }
       for(int l = 0; l < alphabet.length; l++) {
         if(frequency[l] > 0) {
         System.out.println(alphabet[l] + " - " + frequency[l]);
       }
     }
   }

    /*public static double[] append(double[] inputArray, double addition) {
      double[] outputArray = new double[inputArray.length+1];
      for(int i = 0; i < inputArray.length; i++) {
        outputArray[i] = inputArray[i];
      }
      outputArray[inputArray.length] = addition;
      return outputArray;
    }*/

    /*public static int binarySearch(int[] intArray, int searchTerm) {

      for(int i = 0; i < intArray.length-1; i++) {
        if(intArray[i] > intArray[i+1]) {
          System.out.println("not a sorted array");
          return 0;
        }
      }
      if(searchTerm == intArray[intArray.length/2]) {
        System.out.println(intArray[intArray.length/2]);
        return intArray[intArray.length/2];
      }

      if(searchTerm < intArray[intArray.length/2]) {
        for(int j = 0; j < intArray.length/2; j++) {
          if(searchTerm == intArray[j]) {
            System.out.println(j);
            return j;
          }
        }
        }else{
          for(int k = intArray.length/2; k < intArray.length; k++ ) {
            if(searchTerm == intArray[k]) {
              System.out.println(k);
              return k;
            }
          }
        }
        System.out.println("term not in array");
        return 0;
      }*/

      /*public static double earnings(double[] workedHoursArray, double baseWage, double specialWage) {
        double amountEarned = 0.0;
        for(int i = 0; i < workedHoursArray.length; i++) {
          if(workedHoursArray[i] <= 8.0) {
            amountEarned = amountEarned + workedHoursArray[i]*baseWage;
          }else{
            amountEarned = amountEarned + (8.0 + specialWage*(workedHoursArray[i]-8.0))*baseWage;
          }
        }
        return amountEarned;
      }

      public static double[] remove(double[] inputArray, int indexToRemove) {
        if(indexToRemove > inputArray.length-1) {
          System.out.println("index out of range");
          return inputArray;
        }
        boolean indexReached = false;
        double[] outputArray = new double[inputArray.length-1];
        for(int j = 0; j <= outputArray.length; j++) {
          if(j == indexToRemove) {
            indexReached = true;
          }else{
            if(indexReached == false) {
            outputArray[j] = inputArray[j];
          }else{
            outputArray[j-1] = inputArray[j];
          }
        }
      }
      return outputArray;
    }*/
}
