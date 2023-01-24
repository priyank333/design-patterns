package structural.facade;

public class Viewport {
    private final Buffer BUFFER;
    private final int WIDTH;
    private final int HEIGHT;
    private final int OFFSET_X;
    private final int OFFSET_Y;

    public Viewport(Buffer buffer, int width, int height, int offset_x, int offset_y) {
        BUFFER = buffer;
        WIDTH = width;
        HEIGHT = height;
        OFFSET_X = offset_x;
        OFFSET_Y = offset_y;
    }

    public char charAt(int x, int y) {
        return BUFFER.charAt(x + OFFSET_X, y + OFFSET_Y);
    }
}
