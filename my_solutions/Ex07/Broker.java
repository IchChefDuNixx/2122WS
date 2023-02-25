import java.util.Arrays;

public class Broker {
  //you tell me what the best offer is (for customer x)
  public static int calcBest(double offer1, double offer2, double offer3) {
    double[] offerArray = {offer1, offer2, offer3};
    Arrays.sort(offerArray);
    return (int) offerArray[0];
  }

  public static String calcBestInsurance(Insurance insurance1, Insurance insurance2, Insurance insurance3, double bestOffer, int travelPrice) {
    String bestInsurance = "";

    if(insurance1.premium(travelPrice) == bestOffer) {
      bestInsurance = insurance1.name + "\t";
    }else if(insurance2.premium(travelPrice) == bestOffer) {
      bestInsurance = insurance2.name + "\t";
    }else if(insurance3.premium(travelPrice) == bestOffer) {
      bestInsurance = insurance3.name + "\t";
    }else{return "error: nothing equals bestOffer.";}
    if(insurance1.premium(travelPrice) == insurance2.premium(travelPrice)) {
      bestInsurance = insurance1.name + "+" + insurance2.name;
    }else if(insurance1.premium(travelPrice) == insurance3.premium(travelPrice)) {
      bestInsurance = insurance1.name + "+" + insurance3. name;
    }else if(insurance2.premium(travelPrice) == insurance1.premium(travelPrice)) {
      bestInsurance = insurance2.name + "+" + insurance3.name;
    }
    if(insurance1.premium(travelPrice) == insurance2.premium(travelPrice) && insurance1.premium(travelPrice) == insurance3.premium(travelPrice)) {
      bestInsurance = "all are the same";
    }
    return bestInsurance;
  }

  public static int calcDelta(double offer1, double offer2, double offer3) {
    double[] offerArray = {offer1, offer2, offer3};
    Arrays.sort(offerArray);
    return (int) (offerArray[1]-offerArray[0]);
  }
}
