package ict4315.unit8;

public interface ContactWriter {
    void startContact(String name);
    void writeField(String field, String value);
    String finishContact();
}