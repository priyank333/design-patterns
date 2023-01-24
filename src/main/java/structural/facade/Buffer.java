package structural.facade;

public class Buffer {
    private char[] buffer;
    private int lineWidth;

    public Buffer(int lineWidth, int lineHeight) {
        this.lineWidth = lineWidth;
        buffer = new char[lineWidth * lineHeight];
    }

    public char charAt(int x, int y) {
        return buffer[y * this.lineWidth + x];
    }
}
