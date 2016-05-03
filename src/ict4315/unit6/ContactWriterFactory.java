package ict4315.unit6;

/**
 * Created by daverose on 5/2/16.
 */
public class ContactWriterFactory implements ContactWriter {
    public static ContactWriterFactory instance = null;
    public static synchronized ContactWriterFactory getInstance() {
        if (instance == null){
            instance = new ContactWriterFactory();
        }
        return instance;
    }
    private ContactWriterFactory(){}

}
