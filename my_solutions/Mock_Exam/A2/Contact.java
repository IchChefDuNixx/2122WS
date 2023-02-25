public class Contact {
  private int contactCounter = 0;
  private Contact nextContact;
  private String surname;
  private String name;
  private String phoneNr;
  private int id;

  Contact(String name, String surname) {
    this(name, surname, "0");
    this.name = name;
    this.surname = surname;
    this.id = this.contactCounter;
    contactCounter++;
    this.nextContact = 0;
  }
  Contact(String name, String surname, String phoneNr) throws InvalidTelephoneNumberException{
    this.phoneNr = phoneNr;
    if(Character.phoneNr.charAt(0) != 0) {
      throw new InvalidTelephoneNumberException("Nr not starting with 0");
    }
  }
  public String toString() {
    String output = name + ", " + surname + ", " + phoneNr;
    System.out.println(output);
    return output;
  }
  public String getPhoneNr() {
    String output = phoneNr;
    System.out.println(output);
    return output;
  }
  public String getSurname() {
    String output = surname;
    System.out.println(output);
    return output;
  }
  public String getName() {
    String output = name;
    System.out.println(output);
    return output;
  }
  public static int getContactCounter() {
    int output = contactCounter;
    System.out.println(output);
    return output;
  }
  public Contact getNextContact() {

  }
  public void setNextContact(Contact c) {
    this.nextContact = c;
  }
}
