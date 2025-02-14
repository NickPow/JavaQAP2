package Problem3;

public class Address {
    private String street, city, state, zip;

    // Constructor
    public Address(String street, String city, String state, String zip) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    // toString method
    public String toString() {
        return street + ", " + city + ", " + state + " " + zip;
    }
}
