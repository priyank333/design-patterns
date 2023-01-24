package structural.facade;

/**
 * Facade Design Pattern is one of the Structural design patterns (such as Adapter pattern and Decorator pattern).
 * Facade design pattern is used to help client applications to easily interact with the system.
 * <p>
 * Facade Design Pattern Important Points
 * 1. Facade design pattern is more like a helper for client applications, it doesn’t hide subsystem
 * interfaces from the client. Whether to use Facade or not is completely dependent on client code.
 * 2. Facade design pattern can be applied at any point of development, usually when the number of
 * interfaces grow and system gets complex.
 * 3. Subsystem interfaces are not aware of Facade and they shouldn’t have any reference of the Facade interface.
 * 4. Facade design pattern should be applied for similar kind of interfaces, its purpose is to provide a single
 * interface rather than multiple interfaces that does the similar kind of jobs.
 * 5. We can use Factory pattern with Facade to provide better interface to client systems.
 */
public class Demo {
    public static void main(String[] args) {


        //Instead of writing this much code just create new static method in Console class, which gives a new console.
        /*Buffer buffer = new Buffer(30, 20);
        Viewport viewport = new Viewport(buffer, 30, 20, 0, 0);
        Console console = new Console(30, 20);
        console.addViewPort(viewport);
        console.render();
        */


        Console console2 = Console.newConsole(45, 54);
        console2.render();

    }
}
