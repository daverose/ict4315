package ict4315.unit8;
import org.junit.Test;
import java.util.ArrayList;

import static org.junit.Assert.assertTrue;

//abook contains three contacts to start
public class AddressBookTest {
    public static ArrayList<Contact> abook = new ArrayList<>();
    public static Contact dave = new Contact.ContactBuilder()
            .firstName("Dave")
            .lastName("Rose")
            .email("davearose@gmail.com")
            .build();
    static { abook.add(dave);}
   public static Contact lore = new Contact.ContactBuilder()
            .firstName("Lore")
            .lastName("De Rienzo")
            .email("dcmetro@yahoo.com")
            .build();
    static {abook.add(lore);}
    public static Contact bill = new Contact.ContactBuilder()
            .firstName("Bill")
            .lastName("Smith")
            .email("smith@yahoo.com")
            .build();
    static {abook.add(bill);}
    @Test
    //The contact dave is present as it is loaded in the abook above
    public void testThatContactExists(){
        boolean contactExists = false;
        for ( Contact c : abook) {
            if ( abook.contains(dave)) {
                contactExists = true;
            } else {
                contactExists = false;
            }
        }
        assertTrue(contactExists == true);
    }
@Test
    public void testThatContactWasDeleted() {
    abook.remove(dave);
    boolean contactNotPresent = false;
    for ( Contact c : abook) {
    if ( !abook.contains(dave)) {
        contactNotPresent = true;
    } else {
        contactNotPresent = false;
    }
}
    assertTrue(contactNotPresent == true);
    }

@Test
    public void testSearchByName() {
        String name = "dave";
        Contact expected = dave;
        Contact result;
        result = Contact.searchByName(abook, name);
        assertTrue(result.equals(expected));
    }
    //This needs to locate the contact, find the location in the arraylist and replace it with the new entry.
    public void edit() {}
}
