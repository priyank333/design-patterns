package builder.facade;

public class AddressBuilder extends PersonBuilder {

    private Address address = new Address();

    public AddressBuilder(Person person) {
        this.person = person;
        this.person.setAddress(address);
    }

    public AddressBuilder streetAddress(String streetAddress) {
        address.setStreetAddress(streetAddress);
        return this;
    }

    public AddressBuilder city(String city) {
        address.setCity(city);
        return this;
    }

    public AddressBuilder postCode(String postCode) {
        address.setPostCode(postCode);
        return this;
    }

}
