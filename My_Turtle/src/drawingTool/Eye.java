package drawingTool;

import java.awt.Color;

public class Eye {
    protected int size;  // diameter of the eyeball

    public Eye(int size) {
        this.size = size;
    }

    public void drawAt(int centerX, int centerY) {
        Drawing.pen().setColor(Color.white);
        int x = centerX - size / 2;
        int y = centerY - size / 2;
        Drawing.pen().fillOval(x, y, size, size);
    }

    public int getSize() {
        return size;
    }
}
