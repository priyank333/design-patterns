package other.observer.demo1;

public class Person {
    public Event<PropertyChangedEventArgs> propertyChangedEventArgsEvent = new Event<>();
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (this.age == age) return;

        boolean oldCanVote = getCanVote();

        this.age = age;
        propertyChangedEventArgsEvent.fire(new PropertyChangedEventArgs(
                this, "age"
        ));
        if (oldCanVote != getCanVote()) {
            propertyChangedEventArgsEvent.fire(new PropertyChangedEventArgs(
                    this, "canVote"
            ));
        }
    }

    public boolean getCanVote() {
        return this.age >= 18;
    }
}
