package ict4315.ict4315.UnitTest;

import java.util.ArrayList;
public class AddressBook {
    ArrayList addressBook = new ArrayList<Contact>();
    Contact contact = new Contact.ContactBuilder()
            .firstName("Dave")
            .lastName("Rose")
            .email("davearose@gmail.com")
            .build();

}
