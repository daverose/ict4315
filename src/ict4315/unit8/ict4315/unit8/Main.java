package ict4315.unit8;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Contact> addressBook = new ArrayList<>();
        Contact contact = new Contact.ContactBuilder()
                .firstName("Dave")
                .lastName("Rose")
                .email("davearose@gmail.com")
                .build();
        addressBook.add(contact);
        Contact lore = new Contact.ContactBuilder()
                .firstName("Lore")
                .lastName("De Rienzo")
                .email("dcmetro@yahoo.com")
                .build();
        addressBook.add(lore);
        for (Contact c : addressBook) {
            System.out.print(c.displayContact() + System.lineSeparator());
            Contact result;
            result = Contact.searchByName(addressBook, "Dave");
            System.out.println(result.displayContact());

        }
    }
}



