public class ProgB_LE09 {
  public static void main(String[] args) {
    //Task 1
    char one = 'P';
    char two = 80;
    char three = '\u0050';
    System.out.println(one + " " + two + " " + three);

    char ch;
    for(int i = 0; i < 128; i++) {
      if (i >= 97 && i <= 122) {
        ch = (char)i;
        System.out.println(ch);
      }
    }

    char letter4 = 49;
    if(Character.isDigit(letter4) == true) {
      System.out.println(letter4 + " is a digit");
    }else{
      System.out.println(letter4 + " is no digit");
    }

    char letter5 = 'a';
    System.out.println(Character.toUpperCase(letter5));

    //Task 2
    String str = "Business Information Systems";

    char ch2 = str.charAt(4);
    System.out.println(ch2);

    int a = str.length();
    System.out.println(a);
    for(int i = 0; i < a; i++) {
      System.out.println(str.charAt(i));
    }

    System.out.println(str.toUpperCase());

    System.out.println(str.substring(0,20).toUpperCase());
  }
}
