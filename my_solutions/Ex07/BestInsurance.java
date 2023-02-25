public class BestInsurance {
  public static void main(String[] args) {
  //global variables
  int startingPrice = 1000;
  int endingPrice = 7000;
  int priceStepping = 200;
  //creating Insurances
  Insurance insurance1 = new Insurance("Pogsurance", 50, 0.04);
  Insurance insurance2 = new Insurance("Keksurance", 0, 0.05);
  Insurance insurance3 = new Insurance("Fucksurance", 100, 0.035);
  //creating Customers
  Customer customer1 = new Customer("Herbert", 1100);
  Customer customer2 = new Customer("Berta", 5000);
  Customer customer3 = new Customer("Alfred", 6666);
  //Printing the table
  System.out.println("Price\t" + "Ins.1\t" + "Ins.2\t" + "Ins.3\t" + "Best Insurance\t\t" + "Best Price\t" + "Delta (Best - 2nd best)\t");
  for(int i = startingPrice; i <= endingPrice; i += priceStepping) {
    System.out.println(i + "\t" +
    (int) insurance1.premium(i) + "\t" +
    (int) insurance2.premium(i) + "\t" +
    (int) insurance3.premium(i) + "\t" +
    Broker.calcBestInsurance(insurance1, insurance2, insurance3, (Broker.calcBest(insurance1.premium(i), insurance2.premium(i), insurance3.premium(i))), i) + "\t" +
    Broker.calcBest(insurance1.premium(i), insurance2.premium(i), insurance3.premium(i)) + "\t\t" +
    Broker.calcDelta(insurance1.premium(i), insurance2.premium(i), insurance3.premium(i))
    );
  }
  System.out.println(Customer.calcSingleBest(insurance1, insurance2, insurance3, customer1.travelPrice));
  System.out.println(Customer.calcSingleBest(insurance1, insurance2, insurance3, customer2.travelPrice));
  System.out.println(Customer.calcSingleBest(insurance1, insurance2, insurance3, customer3.travelPrice));
  }
}
