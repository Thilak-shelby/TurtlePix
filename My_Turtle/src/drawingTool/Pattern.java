package drawingTool;

import java.awt.Color;


public class Pattern {
    private int shellWidth, shellHeight;

    public Pattern(int shellWidth, int shellHeight) {
        this.shellWidth = shellWidth;
        this.shellHeight = shellHeight;
    }

    public void drawAt(int left, int bottom) {
    	
        int shellTop = bottom - shellHeight;

        int hexSize = shellWidth / 8;
        int rowHeight = (int) (Math.sqrt(3) * hexSize);

        int centerX = left + shellWidth / 2;
        int centerY = shellTop + shellHeight / 2;
        int radiusX = shellWidth / 2;
        int radiusY = shellHeight / 2;
        
        Drawing.pen().setColor(Color.BLACK);  


        for (int y = shellTop + rowHeight / 2; y < bottom; y += rowHeight) {
            for (int x = left + hexSize; x < left + shellWidth; x += hexSize * 2) {
                if (isInsideEllipse(x, y, centerX, centerY, radiusX, radiusY)) {
                    drawHexagon(x, y, hexSize);
                }
            }
        }
    }

    private void drawHexagon(int centerX, int centerY, int size) {
        int[] xPoints = new int[6];
        int[] yPoints = new int[6];

        for (int i = 0; i < 6; i++) {
            xPoints[i] = (int) (centerX + size * Math.cos(i * Math.PI / 3));
            yPoints[i] = (int) (centerY + size * Math.sin(i * Math.PI / 3));
        }

        Drawing.pen().drawPolygon(xPoints, yPoints, 6);
    }



    private boolean isInsideEllipse(int x, int y, int centerX, int centerY, int radiusX, int radiusY) {
        double dx = (double) (x - centerX) / radiusX;
        double dy = (double) (y - centerY) / radiusY;
        return dx * dx + dy * dy <= 1.0;
    }
}
