package structural.facade;

import java.util.ArrayList;
import java.util.List;

public class Console {
    private List<Viewport> viewports = new ArrayList<>();
    int widht, height;

    public Console(int widht, int height) {
        this.widht = widht;
        this.height = height;
    }

    public void addViewPort(Viewport viewport) {
        viewports.add(viewport);
    }

    public void render() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < widht; j++) {
                for (Viewport viewport : viewports) {
                    System.out.print(viewport.charAt(i, j));
                }
            }
            System.out.println();
        }
    }

    public static Console newConsole(int widht, int height) {
        Buffer buffer = new Buffer(widht, height);
        Viewport viewport = new Viewport(buffer, widht, height, 0, 0);
        Console console = new Console(widht, height);
        console.addViewPort(viewport);
        return console;
    }
}
