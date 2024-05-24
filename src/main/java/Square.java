import java.awt.*;
import java.util.Scanner;

public class Square {
    Scanner userInput = new Scanner(System.in);
    int sideLength;

    public int getSideLength() {
        return sideLength;
    }

    public Square() {
        this.sideLength = sideLength;

        System.out.print("What is the border width?: ");
        int width = userInput.nextInt();


        World world = new World(500, 500);
        Turtle turtle = new Turtle(world, 300, 300);

        // Define the side length of the square
        int sideLength = 100;

        // Move turtle to the starting position
        turtle.penUp();
        turtle.goTo(30, 30); // Center the square in the 200x200 world
        turtle.penDown();

        turtle.setPenWidth(3);
        turtle.setColor(Color.RED);

        // Draw the square
        for (int i = 0; i < 4; i++) {
            turtle.forward(sideLength);
            turtle.turnRight(90);
        }
    }
}
