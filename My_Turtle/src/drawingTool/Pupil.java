package drawingTool;

import java.awt.Color;

public class Pupil extends Eye {

    public Pupil(int size) {
        super(size);
    }

    @Override
    public void drawAt(int centerX, int centerY) {
        Drawing.pen().setColor(Color.black);
        int x = centerX - size / 2;
        int y = centerY - size / 2;
        Drawing.pen().fillOval(x, y, size, size);
    }
}
