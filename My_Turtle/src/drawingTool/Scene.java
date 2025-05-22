package drawingTool;

import java.awt.Dimension;
import java.util.ArrayList;

public class Scene {
    private ArrayList<Turtle> turtles;
    private ArrayList<int[]> positions;

    // Base sizes for a normal turtle
    private final int baseShellWidth = 100;
    private final int baseShellHeight = 130;
    private final int baseHeadSize = 50;

    public Scene(Dimension screenSize) {
        turtles = new ArrayList<>();
        positions = new ArrayList<>();

        int numberOfTurtles = RandomNumber.between(10000, 20000);
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;

        for (int i = 0; i < numberOfTurtles; i++) {
            
            int scalePercent = RandomNumber.between(75, 150);
            double scale = scalePercent / 100.0;

            int shellWidth = (int) (baseShellWidth * scale);
            int shellHeight = (int) (baseShellHeight * scale);
            int headSize = (int) (baseHeadSize * scale);

            turtles.add(new Turtle(shellWidth, shellHeight, headSize));

            positions.add(new int[] {
                RandomNumber.between(50, screenWidth - 200),
                RandomNumber.between(50, screenHeight - 200)
            });
        }
    }

    public void draw() {
        ArrayList<Turtle> drawnTurtles = new ArrayList<>();

        int i = 0;
        while (i < turtles.size()) {
            Turtle current = turtles.get(i);
            int[] pos = positions.get(i);
            current.drawAt(pos[0], pos[1]);

            boolean overlaps = false;
            int j = 0;

            // Loop continues only while no overlap found
            while (!overlaps && j < drawnTurtles.size()) {
                if (current.intersects(drawnTurtles.get(j))) {
                    overlaps = true;  // Mark overlap found
                }
                j++;
            }

            if (!overlaps) {
                current.draw();
                drawnTurtles.add(current);
            }
            i++;
        }
    }

}
