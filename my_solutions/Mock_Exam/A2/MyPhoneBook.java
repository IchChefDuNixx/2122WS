public class MyPhoneBook {
  public static void main(String[] args) {
    Contact[] contacts = new Contact[99];
    PhoneBook myPhoneBook = new PhoneBook();

    Contact contact0 = new Contact("Frank", "Berger", 031232);
    Contact contact1 = new Contact("Pamela", "Huber", 083882);
    Contact contact2 = new Contact("Sonja", "Maier", 029399);
    try{
      Contact[0] = contact0;
      Contact[1] = contact1;
      Contact[2] = contact2;
    }
    catch(InvalidTelephoneNumberException e) {
      System.out.println("InvalidTelephoneNumberException occurred");
    }
    myPhoneBook.insert(contact0);
    myPhoneBook.insert(contact1);
    myPhoneBook.insert(contact2);
    myPhoneBook.print();
    myPhoneBook.search("Maier");
  }
}
