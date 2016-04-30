package ict4315.unit6;

/**
 * Created by daverose on 4/28/16.
 */
public interface ContactWriter {
    void startContact(String name);
    void writeField(String field, String value);
    String finishContact(); // The Prof want's the formatted contact ( JSON, XML etc. )
}