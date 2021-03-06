package ict4315.unit6;

/**
 * Created by daverose on 5/2/16.
 */
public class ContactWriterHtml implements ContactWriter {
    StringBuilder string = new StringBuilder();
    public void startContact(String name){
        string.append("<html><body><p>");
        string.append(System.getProperty("line.separator"));
        string.append(name);
        string.append("<br>");
    }
    public void writeField(String field, String value){
        string.append(System.getProperty("line.separator"));
        string.append(field).append(value);
        string.append("</br>");
    }
    public String finishContact(){
        string.append(System.getProperty("line.separator"));
        string.append("</p></body></html>");
        String formattedContact = string.toString();
        string.setLength(0);
        return formattedContact;
    }
}
