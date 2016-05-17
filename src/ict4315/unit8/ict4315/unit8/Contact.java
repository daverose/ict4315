package ict4315.unit8;
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
    public String firstNameToString(){
        return firstName;
    }
    public String lastNameToString() {
        return lastName;
    }
    public String emailToString() {
        return email;
    }
}
