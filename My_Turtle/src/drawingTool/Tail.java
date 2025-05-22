package drawingTool;

public class Tail {
    private int width, height;

    public Tail(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void drawAt(int centerX, int bottomY) {
        int x = centerX - width / 2;
        int y = bottomY;
        Drawing.pen().fillOval(x, y, width, height);
    }

    public int getHeight() {
        return height;
    }
}
