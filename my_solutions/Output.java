public class Output {
  public static void main(String[] args) {
    double  maf1 = (7d/4);
    double  maf2 = 1d/2 + 1f/2;
    double  maf3 = 1.5 + 7f / 2;
    double  maf4 = (12 + 0.0) / 7;
    double  maf5 = (1d/2 + 3.5) / 2.0;
    double  maf6 = 372 % 100;
    double  maf7 = -7 % 5;
    double  maf8 = 23f / 7 % 4 + 1;
    double  maf9 = 23 % 4 % 4 % 4 % 4 % 4 + 1;
    double  maf10 = 24d / 8*(((-3))) / 2;

    System.out.println("maf1: " + maf1 + "\n" + "maf2: " + maf2 + "\n" + "maf3: " + maf3 + "\n" + "maf4: " + maf4 + "\n" + "maf5: " + maf5 + "\n" + "maf6: " + maf6 + "\n" + "maf7: " + maf7 + "\n" + "maf8: " + maf8 + "\n" + "maf9: " + maf9 + "\n" + "maf10: " + maf10);


      var beer1 = 1;
      var beer2 = 2;
      var beer3 = 3;
      boolean lowStock1 = beer1 <= 2;
      boolean lowStock2 = beer2 <= 2;
      boolean lowStock3 = beer3 <= 2;

      var holiday1 = false;
      var holiday2 = true;
      var midweek1 = false;
      var midweek2 = true;
      boolean great1 = holiday1 && !midweek1;
      boolean great2 = holiday2 && !midweek1;
      boolean great3 = holiday1 && !midweek2;
      boolean great4 = holiday2 && !midweek2;

      var wallet1 = 0;
      var wallet2 = 50;
      var price = 35;
      var cardAvailable1 = false;
      var cardAvailable2 = true;
      var bank1 = 0;
      var bank2 = 2000;
      boolean shoe1 = wallet1>price || cardAvailable1 && bank1 > price;
      boolean shoe2 = wallet1>price || cardAvailable1 && bank2 > price;
      boolean shoe3 = wallet1>price || cardAvailable2 && bank1 > price;
      boolean shoe4 = wallet1>price || cardAvailable2 && bank2 > price;
      boolean shoe5 = wallet2>price || cardAvailable1 && bank1 > price;
      boolean shoe6 = wallet2>price || cardAvailable1 && bank2 > price;
      boolean shoe7 = wallet2>price || cardAvailable2 && bank1 > price;
      boolean shoe8 = wallet2>price || cardAvailable2 && bank2 > price;

      System.out.println("lowStock: " + lowStock1 + " " + lowStock2 + " " + lowStock3);
      System.out.println("great: " + great1 + " " + great2 + " " + great3 + " " + great4);
      System.out.println("shoe: " + shoe1 + " " + shoe2 + " " + shoe3 + " " + shoe4 + " " + shoe5 + " " + shoe6 + " " + shoe7 + " " + shoe8);
    }
}
