package prototype.copyconstructor;

public class App {
    public static void main(String[] args) {
        Employee emp1 = new Employee("1", new Address("LA ROAD", "12345"));
        Employee emp2 = new Employee(emp1);

        System.out.println("Is both object has same address : " + (emp1 == emp2));
    }
}
