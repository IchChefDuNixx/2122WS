//actual application + printing the example code

public class SettlingUp {

  static void Output(String date, Guest[] guestArray) {
    double totalSpent = 0;
    System.out.println(guestArray.length + " participants at the cooking party on " + date + ": ");
    for(int i = 0; i < guestArray.length; i++) {
      if(Guest.foodList(guestArray[i]) != "") {
        System.out.println(guestArray[i].name + " pays " + Guest.totalContribution(guestArray[i]) + " for " + Guest.foodList(guestArray[i]));
        totalSpent += Guest.totalContribution(guestArray[i]);
      }
    }
    double avgSpent = (int)(100*totalSpent/guestArray.length);
    avgSpent /= 100;
    double fundBalance = 0;
    System.out.println("Total spent: " + totalSpent + " (" + avgSpent + " avg) " + "\n");
    for(int i = 0; i < guestArray.length; i++) {
      double totalC = Guest.totalContribution(guestArray[i]);
      if(Guest.totalContribution(guestArray[i]) < avgSpent) {
        double moneyPay = Math.round(100*(avgSpent-totalC));
        moneyPay /= 100;
        System.out.println(guestArray[i].name + " pays " + moneyPay + " into the fund.");
        fundBalance += moneyPay;
      }else if(Guest.totalContribution(guestArray[i]) > avgSpent) {
        double moneyReceive = Math.round(100*(totalC-avgSpent));
        moneyReceive /= 100;
        System.out.println(guestArray[i].name + " receives " + moneyReceive + " from the fund.");
        fundBalance -= moneyReceive;
      }else if(Guest.totalContribution(guestArray[i]) == avgSpent) {
        System.out.println(guestArray[i].name + "spent the exact average.");
      }else{
        System.out.println("error at " + i);
      }
    }
    fundBalance = Math.round(fundBalance*100);
    fundBalance /= 100;
    System.out.println("Remaining balance: " + fundBalance + "\n");
  }
}
