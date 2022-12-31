package prototype.copyconstructor;

/**
 * The prototype pattern is used when the Object creation is costly and requires a lot of time and resources,
 * and you have a similar Object already existing. So this pattern provides a mechanism to copy the original
 * Object to a new Object and then modify it according to our needs. This pattern uses Java cloning to copy the Object.
 * The prototype design pattern mandates that the Object which you are copying should provide the copying feature.
 * It should not be done by any other class. However, whether to use the shallow or deep copy of the object properties
 * depends on the requirements and is a design decision.
 */
public class App {
    public static void main(String[] args) {
        Employee emp1 = new Employee("1", new Address("LA ROAD", "12345"));
        Employee emp2 = new Employee(emp1);

        System.out.println("Is both object has same address : " + (emp1 == emp2));
    }
}
