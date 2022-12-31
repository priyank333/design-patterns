package creational.builder;

/**
 * The builder pattern was introduced to solve some problems with factory and abstract Factory design patterns
 * when the object contains a lot of attributes. This pattern solves the issue with a large number of
 * optional parameters and inconsistent state by providing a way to build the object step-by-step and provide a method
 * that will actually return the final Object.
 */
public class HtmlBuilder {
    public static void main(String[] args) {
        HtmlElement rootElement = new HtmlElement("body");
        rootElement.addAttribute("id", "body-1");
        rootElement.addAttribute("name", "body-1");
        HtmlElement paragraphTag = rootElement.addChildElement("p");
        paragraphTag.addAttribute("style", "color:red");
        traverseElements(rootElement);

    }

    public static void traverseElements(HtmlElement htmlElement) {
        String elementName = htmlElement.getElementName();
        System.out.print("<" + elementName + " ");
        for (Attribute attribute : htmlElement.getAttributes()) {
            System.out.print(attribute.getName() + "='" + attribute.getValue() + "' ");
        }
        System.out.println(">");
        for (HtmlElement element : htmlElement.getChildElements()) {
            traverseElements(element);
        }
        System.out.println("</" + elementName + ">");
    }
}
