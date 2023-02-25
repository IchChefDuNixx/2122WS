public class TestMain {
  public static void main(String[] args) {
    Year year = new Year(Year.requestBirthYear());
    Month month = new Month(Month.requestBirthMonth());
    Day day = new Day(Day.requestBirthDay(month.getMonth()));
    System.out.println("your birthday is " + day.getDay() + "." + month.getMonth() + "." + year.getYear());
  }
}
