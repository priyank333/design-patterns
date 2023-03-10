package behavioral.observer;

public class ObserverInfrastructureDemo implements Observer<Person> {
    public ObserverInfrastructureDemo() {
        Person person = new Person();
        person.subscribe(this);
        for (int i = 20; i < 25; i++) {
            person.setAge(i);
        }


    }

    public static void main(String[] args) {
        new ObserverInfrastructureDemo();
    }

    @Override
    public void handle(PropertyChangeEventArgs<Person> args) {
        System.out.println("Person's " + args.propertyName
                + " has been changed to " + args.newValue);
    }
}
