package drawingTool;

public class Head {
    private int size;
    private Eye leftEye, rightEye;
    private Pupil leftPupil, rightPupil;
    private Mouth mouth;
    private Nose nose;

    public Head(int size) {
        this.size = size;

        int eyeSize = size / 5;
        int pupilSize = eyeSize / 2;

        leftEye = new Eye(eyeSize);
        rightEye = new Eye(eyeSize);

        leftPupil = new Pupil(pupilSize);
        rightPupil = new Pupil(pupilSize);

        int mouthWidth = size / 3;
        int mouthHeight = size / 8;
        mouth = new Mouth(mouthWidth, mouthHeight);

        int nostrilSize = size / 12;
        nose = new Nose(nostrilSize);
    }

    public int getSize() {
        return size;
    }

    public void drawAt(int centerX, int topY) {
        Drawing.pen().setColor(java.awt.Color.green);
        int headX = centerX - size / 2;
        int headY = topY - size;
        Drawing.pen().fillOval(headX, headY, size, size);

        int eyeOffsetX = size / 4;
        int eyeCenterY = headY + size / 3;

        leftEye.drawAt(centerX - eyeOffsetX, eyeCenterY);
        rightEye.drawAt(centerX + eyeOffsetX, eyeCenterY);

        leftPupil.drawAt(centerX - eyeOffsetX, eyeCenterY);
        rightPupil.drawAt(centerX + eyeOffsetX, eyeCenterY);

        int noseCenterY = headY + size / 2;
        nose.drawAt(centerX, noseCenterY);

        int mouthCenterY = headY + (2 * size) / 3;
        mouth.drawAt(centerX, mouthCenterY);
    }
}
