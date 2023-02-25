package other.observer;

public class Employee extends Observable<Employee> {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        propertyChange(this, "name", name);
    }
}
