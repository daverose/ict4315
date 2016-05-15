package ict4315.unit8;


public class Contact {
    private static Builder instance = null;
    private String firstName;
    private String lastName;
    private String email;

    public void writeContact(ContactWriter writer) {
        writer.startContact(firstName);
        writer.writeField("First Name ", firstName);
        writer.writeField("Last Name ", lastName);
        writer.writeField("Email: ", email);
        System.out.print(writer.finishContact());
    }

    private Contact(Builder builder) {
        firstName = builder.firstName;
        lastName = builder.lastName;
        email = builder.email;
    }

    public static synchronized Builder getInstance() {
        if (instance.equals(null)){
            instance = new Builder();
        }
        return instance;
    }

    public static class Builder {
        private String firstName;
        private String lastName;
        private String email;

        private Builder() {}

        public Contact build() {
            return new Contact(this);
        }

        public Builder setfirstName(String name) {
            firstName = name;
            return this;
        }

        public Builder setlastName(String name) {
            lastName = name;
            return this;
        }
        public Builder setEmail(String e){
            email = e;
            return this;
        }

    }

}

