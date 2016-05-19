package ict4315.unit8;

import java.util.ArrayList;

public class Contact {
    private final String firstName;
    private final String lastName;
    private final String email;

    private Contact(ContactBuilder cb) {
        this.firstName = cb.firstName;
        this.lastName = cb.lastName;
        this.email = cb.email;
    }

    public static class ContactBuilder {
        private String firstName;
        private String lastName;
        private String email;

        public ContactBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public ContactBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public ContactBuilder email(String email) {
            this.email = email;
            return this;
        }

        public Contact build() {
            return new Contact(this);
        }
    }
    public static Contact searchByName(ArrayList<Contact> c, String name){
        Contact contactNotFound = new ContactBuilder()
                .firstName("The contact you were searching for was not found").build();
        for ( Contact contact : c ) {
            if (contact.firstName.equalsIgnoreCase(name)) {
                return contact;
            }
        }
        return contactNotFound;
    }

    public String displayContact() {
        StringBuilder str = new StringBuilder();
        str.append(firstName + System.lineSeparator() + lastName + System.lineSeparator() + email + System.lineSeparator());
        return str.toString();
    }
}
