package structural.flyweight.textformatter.betterformatter;

public class TextRange {
    public int start, end;
    public boolean boldText, italicText, underLineText;

    public TextRange(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public TextRange setBoldText(boolean boldText) {
        this.boldText = boldText;
        return this;
    }

    public TextRange setItalicText(boolean italicText) {
        this.italicText = italicText;
        return this;
    }

    public TextRange setUnderLineText(boolean underLineText) {
        this.underLineText = underLineText;
        return this;
    }
}
