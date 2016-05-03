package ict4315.unit6;


public class ContactWriterFactory {
    public static ContactWriterFactory instance = null;
    public static synchronized ContactWriterFactory getInstance() {
        if (instance == null){
            instance = new ContactWriterFactory();
        }
        return instance;
    }
    private ContactWriterFactory(){}

   public ContactWriter setFormat(String format){
       if (format == "html"){
           ContactWriterHtml htmlWriter = new ContactWriterHtml();
           return htmlWriter;
       } else if (format == "text"){
           ContactWriterText textWriter = new ContactWriterText();
           return textWriter;
       } else {
           throw new IllegalArgumentException("Format must be of type html or text and is case sensitive");
       }
   }
}
