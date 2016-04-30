package ict4315.unit6;

/**
 * Created by daverose on 4/28/16.
 */
//Write a Main class that creates a collection of Contact instances, gets a ContactWriter instance from the Factory
// and then writes the Contacts out.
public class Main {
        public static void main(String args[]){
            Builder contact = Builder.newBuilder();
            contact.setfirstName("Dave");
            contact.setlastName("Rose");
            System.out.println(contact);

        }
}
