package drawingTool;

import java.awt.Point;

public class Turtle implements LocatedRectangle {
    private Body body;
    private Head head;

    private int x; // top-left x of bounding rectangle
    private int y; // top-left y of bounding rectangle

    public Turtle(int shellWidth, int shellHeight, int headSize) {
        body = new Body(shellWidth, shellHeight);
        head = new Head(headSize);
    }

    public void drawAt(int left, int top) {
        this.x = left;
        this.y = top;
    }

    public void draw() {
        int bottom = y + height() - (body.getShellHeight() / 4);
        body.drawAt(x + (width() - body.getShellWidth()) / 2, bottom);

        int centerX = x + width() / 2;
        int topOfShell = bottom - body.getShellHeight();
        head.drawAt(centerX, topOfShell);
        
        Drawing.pen().drawRect(address().x, address().y, width(), height());
    }

    @Override
    public Point address() {
        return new Point(x, y);
    }

    @Override
    public int width() {
        return body.getShellWidth() +  body.getLegWidth();
    }

    @Override
    public int height() {
        return head.getSize() + body.getShellHeight() + body.getTailHeight();
    }
}
