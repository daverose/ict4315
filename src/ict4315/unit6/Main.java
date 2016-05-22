package ict4315.unit6;

import java.util.ArrayList;

/**
 * Created by daverose on 4/28/16.
 */

//Write a Main class that creates a collection of Contact instances, gets a ContactWriter instance from the Factory
// and then writes the Contacts out.
public class Main {
    private static ArrayList<Contact> contactList = new ArrayList<>();
        public static void main(String[] args){
            ContactWriterFactory contactWriter = ContactWriterFactory.getInstance();
            Contact dave = Contact.getInstance()
            .setfirstName("Dave")
            .setlastName("Rose")
            .setEmail("davearose@gmail.com")
            .build();
            contactList.add(dave);
            Contact lore = Contact.getInstance()
                    .setfirstName("Lorena")
                    .setlastName("De Rienzo")
                    .setEmail("dcmetro@yahoo.com")
                    .build();
            contactList.add(lore);
            Contact mike = Contact.getInstance()
                    .setfirstName("Mike")
                    .setlastName("Rose")
                    .setEmail("msrfrog@gmail.com")
                    .build();
                    contactList.add(mike);

            ContactWriter htmlWriter = contactWriter.setFormat("html");
            ContactWriter textWriter = contactWriter.setFormat("text");
            dave.writeContact(htmlWriter);
            lore.writeContact(htmlWriter);
            mike.writeContact(textWriter);
        }
}
