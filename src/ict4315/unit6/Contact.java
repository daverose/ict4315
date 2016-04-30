package ict4315.unit6;

/**
 * Created by daverose on 4/28/16.
 */
public class Contact {
    private String firstName;
    private String lastName;


    public void writeContact(ContactWriter writer){
        //Make it happen!
    }
    private Contact(Builder builder){
        firstName = builder.setfirstName();
        lastName = builder.setlastName();
    }


}
