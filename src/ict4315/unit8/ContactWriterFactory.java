package ict4315.unit8;


public class ContactWriterFactory {
    public static ContactWriterFactory instance = null;

    public static synchronized ContactWriterFactory getInstance() {
        if (instance.equals(null)){
            instance = new ContactWriterFactory();
        }
        return instance;
    }
    private ContactWriterFactory(){}

   public ContactWriter setFormat(String format) {
       if (format.equals("html")) {
           ContactWriterHtml contactWriter = new ContactWriterHtml();
           return contactWriter;
       } else if (format.equals("text")) {
           ContactWriterText contactWriter = new ContactWriterText();
           return contactWriter;
       } else throw new IllegalArgumentException("Format must be a string; either html or text and is case sensitive");
       }

   }

