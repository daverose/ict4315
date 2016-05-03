package ict4315.unit6;

/**
 * Created by daverose on 5/2/16.
 */
public class ContactWriterText implements ContactWriter {
    StringBuilder string = new StringBuilder();
    public void startContact(String name){
        string.append(name);
        string.append(System.getProperty("line.separator"));
    }
    public void writeField(String field, String value){
        string.append(field).append(value);
        string.append(System.getProperty("line.separator"));
    }
    public String finishContact(){
        String formattedContact = string.toString();
        return formattedContact;
    }
}
