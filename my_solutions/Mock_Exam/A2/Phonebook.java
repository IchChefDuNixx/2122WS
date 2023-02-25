public class Phonebook {
  public final int EMERGENCY = 112;
  private int numberOfContacts;
  private Contact head;

  Phonebook() {
    this.numberOfContacts = 0;
    this.head = null;
  }
  public void insert(Contact c) {
    this.head = c;
  }
  public Contact search(String surname) {
    int i = 0;
    while(Phonebook[i] != null) {
      if(Phonebook[i].Contact.getSurname().equals(surname)) {
        return PhoneBook[i];
      }else{
        return null;
      }
    }
  }
  public void print() {
    System.out.print(PhoneBook.numberOfContacts + " Contacts ");
    for(int n = 0; n < numberOfContacts; n++) {
      System.out.print("[" + PhoneBook[n].Contact.getSurname() + ", " + PhoneBook[n].Contact.getName() + ", " + PhoneBook[n].Contact.getPhoneNr() + "] ");
    }

    //alternative
    for(int j = 0; j < numberOfContacts; j++) {
      toString(PhoneBook[j]);
    }
  }
}
