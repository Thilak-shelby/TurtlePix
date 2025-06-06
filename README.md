# TurtlePix

## Overview

TurtlePix is a Java application designed to showcase Object-Oriented Programming by constructing and displaying turtles from individual parts such as the body, head, legs, tail, and facial features. The project emphasizes modular design, allowing flexible scaling and smooth rendering of multiple turtles. It also includes collision detection to ensure turtles are displayed without overlapping, using Java Swing and AWT for graphical output.

---

## Features

- Modular classes representing turtle anatomy for clean, maintainable code  
- Dynamic scaling to render turtles at different sizes without distortion  
- Collision detection using bounding rectangles to prevent overlap  
- Efficient handling of multiple turtles via ArrayLists  
- Smooth rendering with anti-aliasing for polished visuals  

---

## How to Run

1. Clone the repository:  
   ```bash
   git clone https://github.com/yourusername/TurtlePix.git

2. Compile all Java files:
    ```bash 
   javac drawingTool/*.java

4. Run the main class to launch the GUI:
    ```bash  
   java drawingTool.TestDrawingTool


## Code Structure

- 'Turtle.java': Main class modeling a turtle, implements bounding and drawing logic  
- 'Body.java': Models the turtle’s body parts including shell, legs, and tail  
- 'Head.java': Models the turtle’s head and facial features (eyes, pupils, mouth, nose)  
- 'Pattern.java': Generates the shell’s hexagonal pattern clipped inside an ellipse  
- 'Drawing.java': Utility class managing the graphics context  
- 'Scene.java': Manages multiple turtle instances and their rendering  
- Utility classes like 'RandomNumber.java' for randomization  

## Sample Output
  The application opens a window displaying multiple turtles of varying sizes and positions, each rendered with a detailed shell pattern and facial features. Overlapping turtles are automatically avoided.

  ![Screenshot 2025-05-23 001528](https://github.com/user-attachments/assets/287057f4-7ea9-4a73-aad4-e02228f5bd4b)

## Future Improvements

1. Add animation support for turtle movement
2. Allow user interaction to add, move, or resize turtles dynamically
3. Enhance shell patterns with color variations and textures
4. Optimize collision detection for larger numbers of turtles
