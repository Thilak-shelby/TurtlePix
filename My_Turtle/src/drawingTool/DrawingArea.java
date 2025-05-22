package drawingTool;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Dimension;
import javax.swing.JPanel;

public class DrawingArea extends JPanel {
    private static final long serialVersionUID = 1L;

    private Scene scene;

    public DrawingArea() {
        setBackground(Color.white);
        Dimension screenSize = getToolkit().getScreenSize();
        scene = new Scene(screenSize);
    }

    @Override
    protected void paintComponent(Graphics pen) {
        super.paintComponent(pen);
        Drawing.set(pen);  
        scene.draw();      
    }
}
