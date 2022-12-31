package creational.builder;

import java.util.ArrayList;
import java.util.List;

public class HtmlElement {
    private String elementName;
    private List<Attribute> attributes;
    private List<HtmlElement> childElements;

    public HtmlElement(String elementName) {
        super();
        this.elementName = elementName;
        this.attributes = new ArrayList<>();
        this.childElements = new ArrayList<>();
    }

    public HtmlElement addChildElement(String elementName) {
        HtmlElement childElement = new HtmlElement(elementName);
        this.childElements.add(childElement);
        return childElement;
    }

    public HtmlElement addAttribute(String name, String value) {
        Attribute attribute = new Attribute(name, value);
        this.attributes.add(attribute);
        return this;
    }

    public String getElementName() {
        return elementName;
    }

    public List<Attribute> getAttributes() {
        return attributes;
    }

    public List<HtmlElement> getChildElements() {
        return childElements;
    }

}
