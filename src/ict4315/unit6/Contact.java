package ict4315.unit6;

/**
 * Created by daverose on 4/28/16.
 */
public class Contact {
    private String firstName;
    private String lastName;
    private String email;
    @Override
    public String toString(){
        String str =  this.firstName + " " + this.lastName;
        return str;
    }

    private Contact(Builder builder) {
        firstName = builder.firstName;
        lastName = builder.lastName;
        email = builder.email;
    }

    public static Builder newBuilder() {
        return new Builder();
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
//    public void writeContact(ContactWriter writer) {
//        //Make it happen!
//    }
}

