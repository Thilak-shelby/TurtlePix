package drawingTool;

public class Leg {
    private int width, height;

    public Leg(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void drawAt(int left, int bottom) {
        Drawing.pen().fillOval(left, bottom, width, height);
    }
}
