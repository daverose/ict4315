package ict4315.unit8;


public class ContactWriterHtml implements ContactWriter {
    StringBuilder string = new StringBuilder();
    public void startContact(String name){
        string.append("<html><body><p>");
        string.append(System.lineSeparator());
        string.append(name);
        string.append("<br>");
    }
    public void writeField(String field, String value){
        string.append(System.lineSeparator());
        string.append(field).append(value);
        string.append("</br>");
    }
    public String finishContact(){
        string.append(System.lineSeparator());
        string.append("</p></body></html>");
        String formattedContact = string.toString();
        string.setLength(0);
        return formattedContact;
    }
}
