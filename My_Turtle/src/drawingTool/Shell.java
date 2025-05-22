package drawingTool;

import java.awt.Color;

public class Shell {
    private int width, height;
    private Pattern pattern;

    public Shell(int width, int height) {
        this.width = width;
        this.height = height;
        pattern = new Pattern(width, height);
    }

    public void drawAt(int left, int bottom) {
        int x = left;
        int y = bottom - height;

        Drawing.pen().setColor(Color.green);
        Drawing.pen().fillOval(x, y, width, height);

        Drawing.pen().setColor(Color.black);
        pattern.drawAt(left, bottom);
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
