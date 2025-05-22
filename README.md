# TurtlePix

## Overview

TurtlePix is a Java application that uses Object-Oriented Programming principles to model and render turtles with detailed anatomical parts. The project demonstrates modular design by composing turtles from components like body, head, legs, tail, and facial features.

Key highlights include dynamic scaling, efficient management of multiple turtle instances, and collision detection to avoid overlapping drawings, all rendered smoothly using Java Swing and AWT.

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
   git clone https://github.com/yourusername/TurtlePix.git

2. Compile all Java files:  
   javac drawingTool/*.java

3. Run the main class to launch the GUI (replace with your main class name):  
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

## Future Improvements

1. Add animation support for turtle movement
2. Allow user interaction to add, move, or resize turtles dynamically
3. Enhance shell patterns with color variations and textures
4. Optimize collision detection for larger numbers of turtles
