public class Insurance {
  String name;
  double basePrice;
  double Factor;

  public Insurance(){
    name = "default";
    basePrice = 0;
    Factor = 0;
  }

  public Insurance(String name, double basePrice, double Factor){
    this.name = name;
    this.basePrice = basePrice;
    this.Factor = Factor;
  }

  public double premium(int travelPrice) {
    return(basePrice + Factor*travelPrice);
  }
}
