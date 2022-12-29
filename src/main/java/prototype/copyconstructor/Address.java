package prototype.copyconstructor;

public class Address {
    public String streetAddress;
    public String houseNumber;

    public Address(String streetAddress, String houseNumber) {
        this.streetAddress = streetAddress;
        this.houseNumber = houseNumber;
    }

    public Address(Address other) {
        this(other.streetAddress, other.houseNumber);
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetAddress='" + streetAddress + '\'' +
                ", houseNumber='" + houseNumber + '\'' +
                '}';
    }
}
