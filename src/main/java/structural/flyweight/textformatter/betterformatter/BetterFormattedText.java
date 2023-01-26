package structural.flyweight.textformatter.betterformatter;

import java.util.ArrayList;
import java.util.List;

public class BetterFormattedText {
    private List<TextRange> textRanges;
    private String plainText;

    public BetterFormattedText(String plainText) {
        this.plainText = plainText;
        textRanges = new ArrayList<>();
    }

    public void addTextRange(TextRange textRange) {
        textRanges.add(textRange);
    }

    @Override
    public String toString() {
        StringBuffer sbr = new StringBuffer();

        for (TextRange textRange : textRanges) {
            for (int i = 0; i < plainText.length(); i++) {
                char ch = plainText.charAt(i);
                if (textRange.boldText && i >= textRange.start && i <= textRange.end) {
                    sbr.append(Character.toUpperCase(ch));
                } else {
                    sbr.append(ch);
                }
            }
        }
        return sbr.toString();
    }
}
