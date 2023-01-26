package structural.flyweight.textformatter;

public class FormattedText {
    private String plainText;
    private boolean[] capitalizeRange;

    public FormattedText(String plainText) {
        this.plainText = plainText;
        this.capitalizeRange = new boolean[plainText.length()];
    }

    public boolean setRange(int start, int end) {
        if (start >= 0 && end < plainText.length()) {
            for (int i = start; i <= end; i++) {
                capitalizeRange[i] = true;
            }
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        StringBuffer sbr = new StringBuffer();
        for (int i = 0; i < plainText.length(); i++) {
            char ch = plainText.charAt(i);
            if (capitalizeRange[i]) {
                sbr.append(Character.toUpperCase(ch));
            } else {
                sbr.append(ch);
            }
        }

        return sbr.toString();
    }
}
