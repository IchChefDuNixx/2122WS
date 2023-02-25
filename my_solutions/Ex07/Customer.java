import java.util.Arrays;

public class Customer {

  //global variables
  String name;
  int travelPrice;

  public Customer() {
    name = "default";
    travelPrice = 0;

  }

  public Customer(String name, int travelPrice) {
    this.name = name;
    this.travelPrice = travelPrice;
  }

  //potential new customer-related functions
  public static String calcSingleBest(Insurance insurance1, Insurance insurance2, Insurance insurance3, int travelPrice) {
    double[] premiumArray = {insurance1.premium(travelPrice),insurance2.premium(travelPrice),insurance3.premium(travelPrice)};
    for(int i = 0; i < premiumArray.length; i++) {
      premiumArray[i] = premiumArray[i];
    }
    Arrays.sort(premiumArray);
    return "The cheapest insurance for a travel price of " + travelPrice + " will cost " + (int) premiumArray[0] + " at the following insurance(s): \n" +
    Broker.calcBestInsurance(insurance1, insurance2, insurance3, premiumArray[0], travelPrice);
  }
}
