package creational.builder.facade;

public class Address {
    private String streetAddress;
    private String city;
    private String postCode;

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    @Override
    public String toString() {
        return "Address [streetAddress=" + streetAddress + ", city=" + city + ", postCode=" + postCode + "]";
    }

}
