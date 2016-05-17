package ict4315.unit8;
import java.util.ArrayList;

import static org.junit.Assert.assertTrue;


public class AddressBookTest {
    public static ArrayList<Contact> abook = new ArrayList<>();
    public static Contact contact = new Contact.ContactBuilder()
            .firstName("Dave")
            .lastName("Rose")
            .email("davearose@gmail.com")
            .build();
    static { abook.add(contact);}
   public static Contact lore = new Contact.ContactBuilder()
            .firstName("Lore")
            .lastName("De Rienzo")
            .email("dcmetro@yahoo.com")
            .build();
    static {abook.add(lore);}

    public void testThatContactWasDeleted(Contact c) {

    }


    public void testSearchByName(String name) {


    }
    //This needs to locate the contact, find the location in the arraylist and replace it with the new entry.
    public void edit() {}
}
