public class Util {
  public static String format(String inputString);
    String[] splitString = inputString.split(",");
    if(splitString[2].charAt(0)=='0') {
      splitString[2] = "+49" + splitString[2].substring(1);
    }
    String conString = splitString[0] + splitString[1] + splitString[2];
    return conString;

    public static void main(String[] args) {
      String[] contacts = {"Berger,Frank,031232", "Huber,Pamela,083882", "Maier,Sonja,029399"};
      for(int i = 0; i < contacts.length; i++) {
        System.out.println(contacts[i]);
        System.out.println(format(contacts[i]));
      }
    }
}
