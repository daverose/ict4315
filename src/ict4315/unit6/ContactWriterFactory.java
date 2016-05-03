package ict4315.unit6;


public class ContactWriterFactory implements ContactWriter {
    public static ContactWriterFactory instance = null;
    public static synchronized ContactWriterFactory getInstance() {
        if (instance == null){
            instance = new ContactWriterFactory();
        }
        return instance;
    }
    private ContactWriterFactory(){}

    public void startContact(String name){

    }
    public void  writeField(String field, String value) {

    }
    public String finishContact(){

    }

}
