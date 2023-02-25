public class ProgB_LE04 {

  public static double sqrt3(double a, double b, double c) {
    double sum = a + b + c;
    double result = Math.pow(sum, 2);
    return(result);
  }
  public static void sop(String a) {
    System.out.println(a);
  }
  public static void sop(int a) {
    System.out.println(a);
  }
  public static void sop(double a) {
    System.out.println(a);
  }
  public static double compoundInterest(double startingBalance, double basicInterestRate, double investmentYears) {
    return(startingBalance*Math.pow((1+basicInterestRate/100),investmentYears));
  }
  public static double compoundInterestWithInterestRise(double Capital, double RiseRate) {
    return((Capital*(RiseRate+100))/100);
  }
  public static double method1(double a, double b) {
    double z = a / b;
    return(z);
  }
  public static double method2(double c, double d) {
    int b = 10;
    double z = c / b;
    return(z);
  }
  public static void main(String[] args) {
    double height = sqrt3(5,6,8);
    System.out.println(height);
    String cock = "my cock";
    sop(cock);
    sop(compoundInterest(100000, 5, 10));
    sop(compoundInterestWithInterestRise(10000, 5));
    double a = 1;
    double b = 2;
    double c = 3;
    sop(method1(a,b));
    sop(method1(10,a));
    sop(method2(b,c));
  }
}

/*
    Task 3:
    3 errors wtf
*/
