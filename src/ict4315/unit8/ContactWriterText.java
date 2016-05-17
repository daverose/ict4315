package ict4315.unit8;


public class ContactWriterText implements ContactWriter {
    StringBuilder string = new StringBuilder();
    public void startContact(String name){
        string.append(name);
        string.append(System.lineSeparator());
    }
    public void writeField(String field, String value){
        string.append(field).append(value);
        string.append(System.lineSeparator());
    }
    public String finishContact(){
        String formattedContact = string.toString();
        string.setLength(0);
        return formattedContact;
    }
}
