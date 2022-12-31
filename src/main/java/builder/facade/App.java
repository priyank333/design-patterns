package builder.facade;
/**
 * The builder pattern was introduced to solve some problems with factory and abstract Factory design patterns
 * when the object contains a lot of attributes. This pattern solves the issue with a large number of
 * optional parameters and inconsistent state by providing a way to build the object step-by-step and provide a method
 * that will actually return the final Object.
 */
public class App {
    public static void main(String[] args) {
        PersonBuilder personBuilder = new PersonBuilder();
        personBuilder.name("Priyank").age(28).lives().city("Ahmedabad").postCode("380005")
                .streetAddress("Opp. Nima Park").works().occupation("Job").workingAt("Luxoft DXC")
                .workingLocation("Bengaluru").earnings("18,00,000");
        Person person = personBuilder.build();
        System.out.println(person);
    }
}
