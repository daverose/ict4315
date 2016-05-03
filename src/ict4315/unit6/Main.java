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
            Contact con = Contact.getInstance()
            .setfirstName("Dave")
            .setlastName("Rose")
            .setEmail("davearose@gmail.com")
            .build(); //build returns a new contact
            contactList.add(con); // adds the new contact to the list
            Contact lore = Contact.getInstance()
                    .setfirstName("Lorena")
                    .setlastName("De Rienzo")
                    .setEmail("dcmetro@yahoo.com")
                    .build();
            contactList.add(lore);


            ContactWriter conWriter = contactWriter.setFormat("html"); // can be changed to html
            conWriter.startContact("Dave");
            conWriter.writeField("First Name: ", "Dave");
            conWriter.writeField("Last Name: ", "Rose");
            conWriter.writeField("Email: ", "davearose@gmail.com");
            System.out.print(conWriter.finishContact());

            conWriter.startContact("Lore");
            conWriter.writeField("First Name: ", "Lore");
            conWriter.writeField("Last Name: ", "De Rienzo");
            conWriter.writeField("Email: ", "dcmetro@yahoo.com");
            //conWriter.finishContact();
            System.out.print(conWriter.finishContact());
        }
}
