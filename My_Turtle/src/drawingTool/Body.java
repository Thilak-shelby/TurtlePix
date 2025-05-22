package drawingTool;

public class Body {
    private Shell shell;
    private Tail tail;
    private Leg frontLeftLeg, frontRightLeg, backLeftLeg, backRightLeg;
    private int legWidth, legHeight;

    public Body(int shellWidth, int shellHeight) {
        shell = new Shell(shellWidth, shellHeight);

        int tailWidth = shellWidth / 6;
        int tailHeight = shellHeight / 4;
        tail = new Tail(tailWidth, tailHeight);

        legHeight = shellWidth / 5;
        legWidth = shellHeight / 5;

        frontLeftLeg = new Leg(legWidth, legHeight);
        frontRightLeg = new Leg(legWidth, legHeight);
        backLeftLeg = new Leg(legWidth, legHeight);
        backRightLeg = new Leg(legWidth, legHeight);
    }

    public void drawAt(int left, int bottom) {
        shell.drawAt(left, bottom);

        int shellTop = bottom - shell.getHeight();
        int centerX = left + shell.getWidth() / 2;

        tail.drawAt(centerX, bottom);

        int shiftX = legWidth / 2;
        int shiftY = legHeight / 2;

        int frontLegY = shellTop + shell.getHeight() / 4 - shiftY;
        frontLeftLeg.drawAt(left - shiftX, frontLegY);
        frontRightLeg.drawAt(left + shell.getWidth() - legWidth + shiftX, frontLegY);

        int backLegY = bottom - shell.getHeight() / 4 - shiftY;
        backLeftLeg.drawAt(left - shiftX, backLegY);
        backRightLeg.drawAt(left + shell.getWidth() - legWidth + shiftX, backLegY);
    }

    public int getShellWidth() {
        return shell.getWidth();
    }

    public int getShellHeight() {
        return shell.getHeight();
    }

    public int getLegWidth() {
        return legWidth;
    }

    public int getLegHeight() {
        return legHeight;
    }

    public int getTailHeight() {
        return tail.getHeight();
    }
}
