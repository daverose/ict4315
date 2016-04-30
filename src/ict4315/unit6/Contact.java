package ict4315.unit6;

/**
 * Created by daverose on 4/28/16.
 */
public class Contact {
    private String firstName;
    private String lastName;


    public void writeContact(ContactWriter writer){
        //Make it happen!
    }
    private Contact(Builder builder){
        firstName = builder.firstName;
        lastName = builder.lastName;
    }


    public class Builder {
        private String firstName;
        private String lastName;

        public Builder firstName(String name) {
            this.firstName = name;
            return this;
        }
        public Builder lastName(String name) {
            this.lastName = name;
            return this;
        }
        public Builder newBuilder(){
            return new Builder();
        }

        private Builder() {}
    }


}
