package ict4315.unit6;

/**
 * Created by daverose on 4/28/16.
 */
//Write a Main class that creates a collection of Contact instances, gets a ContactWriter instance from the Factory
// and then writes the Contacts out.
public class Main {
        public static void main(String[] args){
            Contact.Builder mycontact = Contact.newBuilder();
            mycontact.setfirstName("Dave");
            mycontact.setlastName("Rose");
            mycontact.build();
            System.out.println(mycontact);

        }
}
