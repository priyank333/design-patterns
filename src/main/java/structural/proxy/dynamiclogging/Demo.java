package structural.proxy.dynamiclogging;

import java.lang.reflect.Proxy;

public class Demo {

    public static <T> T withLogging(T target, Class<T> itf) {
        return (T) Proxy.newProxyInstance(itf.getClassLoader(), new Class<?>[]{itf}, new LoggingHandler(target));
    }

    public static void main(String[] args) {

        //Count no of method count by using reflection API
        Person person = new Person();
        Human personWithLogging = withLogging(person, Human.class);
        personWithLogging.talk();
        personWithLogging.talk();
        personWithLogging.talk();
        personWithLogging.walk();
        personWithLogging.walk();
        System.out.println(personWithLogging);
    }
}
