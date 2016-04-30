package ict4315.unit6;

/**
 * Created by daverose on 4/28/16.
 */
public class Contact {
    private String firstName;
    private String lastName;

    private Contact(Builder builder) {
        firstName = builder.firstName;
        lastName = builder.lastName;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static class Builder {
        private String firstName;
        private String lastName;

        private Builder() {}

        public Contact build() {
            return new Contact(this);
        }

        public Builder setfirstName(String name) {
            this.firstName = name;
            return this;
        }

        public Builder setlastName(String name) {
            this.lastName = name;
            return this;
        }


    }
//    public void writeContact(ContactWriter writer) {
//        //Make it happen!
//    }
}

