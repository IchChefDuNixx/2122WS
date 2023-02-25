import java.util.Arrays;

public class ProgB_LE05 {

  public static int calc(int factor, int hours) {
    if(hours > 3) {
      hours = 3;
    }
    return(factor*hours);
  }

  public static void main(String[] args) {
    char[] threeCharArray = new char[3];
    int[] nineIntArray = new int[9];
    double[] fiveDoubleArray = new double[5];

    String[] months = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

    threeCharArray[0] = 'a';
    threeCharArray[1] = 'b';
    threeCharArray[2] = 'c';
    nineIntArray[0] = 1;
    nineIntArray[1] = 2;
    nineIntArray[2] = 3;
    nineIntArray[3] = 4;
    nineIntArray[4] = 5;
    nineIntArray[5] = 6;
    nineIntArray[6] = 7;
    nineIntArray[7] = 8;
    nineIntArray[8] = 9;
    fiveDoubleArray[0] = 7.5;
    fiveDoubleArray[1] = 8.9;
    fiveDoubleArray[2] = 0.25;
    fiveDoubleArray[3] = 100.3;
    fiveDoubleArray[4] = 17.4;

    System.out.println(months.length);

    System.out.println(Arrays.toString(threeCharArray));
    System.out.println(Arrays.toString(nineIntArray));
    System.out.println(Arrays.toString(fiveDoubleArray));

    int[] amountOfNumbers = new int[]{3,8,4,9,2,1,5,7,6};
    for(int i = 0; i < amountOfNumbers.length; i++) {
      System.out.println(amountOfNumbers[i]);
    }
    Arrays.sort(amountOfNumbers);
    System.out.println(" ");
    for(int i = 0; i < amountOfNumbers.length; i++) {
      System.out.println(amountOfNumbers[i]);
    }



    double[][] table = {
      {1.3, 3.5, 7.8, 4.0},
      {7.5, 8.3, 6.9, 3.2},
      {4.5, 6.7, 3.4, 7.2}
    };
    System.out.println("Length 1st dimension: " + table.length);
    System.out.println("Length 2nd dimension: " + table[0].length);
    for (int i = 0; i < table.length; i++) {
      for (int j = 0; j < table[i].length; j++) {
        System.out.print(table[i][j] + "\t");
      }
      System.out.println();
    }
    char[] ca = {'h','e','l','l','o'};
    char[] cb = {'g','u','y','s'};
    System.arraycopy(ca,2,cb,2,2);
    System.out.println(cb);

    int[] intArray = {1,3,5,7,9};
    for(int i: intArray)
     System.out.println(i);

    double[] ar = {1.2, 3.0, 0.8};
    double sum = 0.0;
    for(double j: ar)
      sum += j;
    System.out.println(sum);

    int factor = 2;
    int[] hours = {8,4,5,8,6};
    int sum2 = 0;
    for(int i: hours)
      sum2 += calc(factor, i);
    System.out.println(sum2);
  }
}
