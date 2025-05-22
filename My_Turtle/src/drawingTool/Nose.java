package drawingTool;

import java.awt.Color;

public class Nose {
    private int nostrilSize;

    public Nose(int nostrilSize) {
        this.nostrilSize = nostrilSize;
    }

    public void drawAt(int centerX, int centerY) {
        Drawing.pen().setColor(Color.black);

        int offsetX = nostrilSize + 2; // small distance between nostrils

        // Left nostril
        int leftX = centerX - offsetX;
        int leftY = centerY - nostrilSize / 2;
        Drawing.pen().fillOval(leftX, leftY, nostrilSize, nostrilSize);

        // Right nostril
        int rightX = centerX + offsetX - nostrilSize;
        int rightY = centerY - nostrilSize / 2;
        Drawing.pen().fillOval(rightX, rightY, nostrilSize, nostrilSize);
    }
}
