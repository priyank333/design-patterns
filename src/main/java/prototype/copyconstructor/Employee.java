package prototype.copyconstructor;

public class Employee {
    public String empId;
    public Address address;

    public Employee(String empId, Address address) {
        this.empId = empId;
        this.address = address;
    }

    public Employee(Employee other) {
        this(other.empId, other.address);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId='" + empId + '\'' +
                ", address=" + address +
                '}';
    }
}