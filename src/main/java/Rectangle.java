import java.awt.*;
import java.util.Scanner;

public class Rectangle {
    Scanner userInput = new Scanner(System.in);
    int shortSide, longSide;

    public int getShortSide() {
        return shortSide;
    }

    public int getLongSide() {
        return longSide;
    }

    public Rectangle() {
        this.shortSide = shortSide;
        this.longSide = longSide;

        System.out.print("What is the border width?: ");
        int width = userInput.nextInt();

        World world = new World(500, 500);
        Turtle turtle = new Turtle(world, 300, 300);

        // Define the side length of the square
        int sideLength = 100;
        int longSideLength = 200;

        // Move turtle to the starting position
        turtle.penUp();
        turtle.goTo(30, 30); // Center the square in the 200x200 world
        turtle.penDown();

        turtle.setPenWidth(3);
        turtle.setColor(Color.GREEN);

        // Draw the square
        for (int i = 0; i < 2; i++) {
            turtle.forward(longSideLength);
            turtle.turnRight(90);
            turtle.forward(sideLength);
            turtle.turnRight(90);
        }
    }
}
