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

   public ContactWriterHtml conWriter setFormatHtml(){
           ContactWriterHtml htmlWriter = new ContactWriterHtml();
           return htmlWriter;
       }

   }

