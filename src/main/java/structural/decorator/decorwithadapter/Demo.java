package structural.decorator.decorwithadapter;

public class Demo {
    public static void main(String[] args) {
        MyStringBuilder msb = new MyStringBuilder();
        msb.append("Hello").appendLine(" World");
        System.out.println(msb.concat("From Java"));
    }
}
