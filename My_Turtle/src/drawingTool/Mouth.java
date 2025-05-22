package drawingTool;

import java.awt.Color;

public class Mouth {
    private int width, height;

    public Mouth(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void drawAt(int centerX, int centerY) {
        Drawing.pen().setColor(Color.black);
        int x = centerX - width / 2;
        int y = centerY - height / 2;
        
        Drawing.pen().fillArc(x, y, width, height, 180, 180);
    }
}
