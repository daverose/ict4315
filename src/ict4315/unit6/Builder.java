package ict4315.unit6;

/**
 * Created by daverose on 4/28/16.
 */
public class Builder {
    private String firstName;
    private String lastName;

    public Builder setfirstName(String name) {
        this.firstName = name;
        return this;
    }
    public Builder setlastName(String name) {
        this.lastName = name;
        return this;
    }
    public static Builder newBuilder(){
        return new Builder();
    }

    public Builder() {}
}
