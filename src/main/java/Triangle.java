import java.awt.*;
import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class Triangle {
    static Scanner userInput = new Scanner(System.in);
    int baseline, side1, side2;

    public int getBaseline() {
        return baseline;
    }

    public int getSide1() {
        return side1;
    }

    public int getSide2() {
        return side2;
    }

    public Triangle() {

        // Define the side length of the square

        this.baseline = 100;
        this.side1 = 130;
        this.side2 = 100;

        System.out.print("What is the border width?: ");
        int width = userInput.nextInt();

        World world = new World(500, 500);
        Turtle turtle = new Turtle(world, 300, 300);

        // Move turtle to the starting position
        turtle.penUp();
        turtle.goTo(30, 30); // Center the square in the 200x200 world
        turtle.penDown();

        turtle.setPenWidth(3);
        turtle.setColor(Color.BLUE);

        // Draw the square
        for (int i = 0; i < 1; i++) {
            turtle.forward(side1);
            turtle.turnLeft(135);
            turtle.forward(baseline);
            turtle.turnLeft(90);
            turtle.forward(side2);
            turtle.turnLeft(135);
        }
    }
}
