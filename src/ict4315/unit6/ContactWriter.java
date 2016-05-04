package ict4315.unit6;

/**
 * Created by daverose on 4/28/16.
 */
public interface ContactWriter {
    void startContact(String name);
    void writeField(String field, String value);
    String finishContact();
}