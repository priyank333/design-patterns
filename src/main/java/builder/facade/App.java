package builder.facade;

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
