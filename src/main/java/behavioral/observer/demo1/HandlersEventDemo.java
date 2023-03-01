package behavioral.observer.demo1;

public class HandlersEventDemo {
    public static void main(String[] args) throws Exception {
        Person person = new Person();
        Event<PropertyChangedEventArgs>.Subscription subscription = person.propertyChangedEventArgsEvent.addHandler(x -> {
            System.out.println("Person's " + x.propertyName + " has changed.");
        });
        person.setAge(17);
        //subscription.close();
        person.setAge(18);
    }
}
