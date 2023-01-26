package structural.flyweight;

public class Demo {
    public static void main(String[] args) {
        User user1 = new User("Priyank Agrawal");
        User user2 = new User("Aditya Agrawal");
        System.out.println(user1.getFullName());
        System.out.println(user2.getFullName());
    }
}
