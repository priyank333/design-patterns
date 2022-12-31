package creational.builder.facade;

public class PersonBuilder {
    protected Person person;
    private AddressBuilder addressBuilder;
    private OccupationBuilder occupationBuilder;

    public PersonBuilder() {
        person = new Person();
    }

    protected Person build() {
        return person;
    }

    public AddressBuilder lives() {
        if (addressBuilder == null) {
            addressBuilder = new AddressBuilder(person);
        }
        return addressBuilder;

    }

    public OccupationBuilder works() {
        if (occupationBuilder == null) {
            occupationBuilder = new OccupationBuilder(person);
        }
        return occupationBuilder;
    }

    public PersonBuilder name(String name) {
        person.setName(name);
        return this;
    }

    public PersonBuilder age(Integer age) {
        person.setAge(age);
        return this;
    }

}
