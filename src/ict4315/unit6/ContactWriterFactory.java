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

   public ContactWriter setFormat(String format) {
       if (format == "html") {
           ContactWriterHtml contactWriter = new ContactWriterHtml();
           return contactWriter;
       } else if (format == "text") {
           ContactWriterText contactWriter = new ContactWriterText();
           return contactWriter;
       } else throw new IllegalArgumentException("Format must be a string; either html or text and is case sensitive");
       }

   }

