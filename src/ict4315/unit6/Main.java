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
            ContactWriter conWrterHtml = contactWriter.setFormatHtml();
            conWrterHtml.startContact("Dave");
            conWrterHtml.writeField("First Name ", "Dave");
            conWrterHtml.writeField("Last Name ", "Rose");
            conWrterHtml.writeField("Email ", "davearose@gmail.com");
            String it = conWrterHtml.finishContact();
            System.out.print(it);

        }
}
