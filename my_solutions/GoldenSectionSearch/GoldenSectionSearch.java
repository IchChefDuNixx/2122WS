import java.util.*;

public class GoldenSectionSearch {
  public static void main(String[] args) {
    final double PHI = 1.6180339887;
    //to do: assign values to variables
    System.out.println(PHI-1); //0.6180339886999999
    System.out.println(2-PHI); //0.3819660113000001
    //initializing input scanners
    Scanner sc = new Scanner(System.in);
    System.out.println("enter your function:");
    String function = sc.nextLine();
    System.out.println("enter your variable:");
    String variable = sc.nextLine();
    //initializing boundaries
    System.out.println("enter lower and upper bound seperately:");
    double boundaryOne = 0;
    double boundaryTwo = 0;
    do { //check for possible input errors for boundaries
      try {
        boundaryOne = Double.parseDouble(sc.nextLine());
        boundaryTwo = Double.parseDouble(sc.nextLine());
        if(boundaryOne == boundaryTwo) {
          System.out.println("lower and upper bound should not be the same.\nenter new bounds:");
          boundaryOne = 0;
          boundaryTwo = 0;
        }
      }
      catch(Exception e) {
        System.out.println("not a number.\nenter new bounds:");
      }
    } while(boundaryOne == 0 && boundaryTwo == 0);
    //sorting lower and upper boundaries
    double lowerBound = 0;
    double upperBound = 0;
    if(boundaryOne < boundaryTwo) {
      lowerBound = boundaryOne;
      upperBound = boundaryTwo;
    }else{
      lowerBound = boundaryTwo;
      upperBound = boundaryOne;
    }
    //initializing number of iterations
    System.out.println("enter number of iterations:");
    int iterations = 0;
    while(iterations == 0) { //check for possible input errors for iterations
      try {
        iterations = Integer.parseInt(sc.nextLine());
        if(iterations == 0) {
          System.out.println("number of iterations should not be zero.\nenter new number of iterations:");
        }
      }
      catch (Exception e) {
        System.out.println("not an integer.\nenter new number of iterations:");
      }
    }
    //check for possible input error for function/variable
    while(function.toLowerCase().contains(variable.toLowerCase()) == false || function == "" || variable == "") {
      System.out.println("variable not contained in function or empty.");
      System.out.println("enter new function:");
      function = sc.nextLine();
      System.out.println("enter new variable:");
      variable = sc.nextLine();
    }
    //test print everything
    System.out.println("your function: " + function +
                       "\nyour variable: " + variable +
                       "\nlower bound: " + lowerBound +
                       "\nupper bound: " + upperBound +
                       "\nnumber of iterations: " + iterations
                       );
    //converting powers of function
    x^y -> x + (y-1)* [*x]

    //gss calculation
    for(int i = 0; i < iterations; i++) {
      System.out.println(i*i);
    }
  }
}
