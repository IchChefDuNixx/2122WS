public class Sum {
  public static void main (String[] args) {
    double upperBound = 100;
    double lowerBound = 0;
    double sum = 0;
    while (lowerBound <= upperBound) {
      double cock = Math.pow(lowerBound, 1);
      sum = sum + cock;
  System.out.println(sum);
      lowerBound = lowerBound + 5;
    }
          System.out.println(sum);
  }
}
