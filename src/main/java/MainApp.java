import java.awt.*;
import java.util.Scanner;

public class MainApp {
        static Scanner userInput = new Scanner(System.in);

    // Homescreen

    public static void homescreen() {

        while (true) {

            System.out.println("""
                    --------------------------------
                    Welcome TechTurtle Painter!
                    1) Add Shape
                    2) Sample Shape
                    3) Save Shape
                    0) Exit
                    --------------------------------
                    """);

            System.out.print("Enter an option: ");
            int option = userInput.nextInt();

            if (option == 1) {
                MainApp.addShape();

            } else if (option == 2) {
                MainApp.main();

            } else if (option == 3) {
                //   Save Image
                System.out.println("Shape saved successfully!\n");

            } else if (option == 0) {
                System.exit(0);

            } else {
                System.out.println("Error!");
            }
        }
    }



    private static void addShape() {
        System.out.println("""
                                Adding Shapes!
                                Which shapes would you like to add?
                                1. Square
                                2. Rectangle
                                3. Triangle
                                4. Go back
                                0. Exit
                               
                                """);

        System.out.print("Enter an option: ");
        int option = userInput.nextInt();
        userInput.nextLine();

        switch (option) {
            case 1:
                Square square = new Square();
                break;

            case 2:
                Rectangle rectangle = new Rectangle();
                break;

            case 3:
                Triangle triangle = new Triangle();
                break;

            case 4:
                MainApp.homescreen();
                break;

            case 0:
                System.exit(0);
        }
    }



    public static void main() {
        // This starter code to get you familiar with how
        // the TurtleLogo application works

        World world = new World(500, 500);
        Turtle turtle = new Turtle(world, 300, 300);

        // The world is your canvas
        int width = 200;
        int height = 200;

        // calculate the hypotenuse (diagonal)
        // a2 + b2 = c2
        double widthSquared = Math.pow(width, 2);
        double heightSquared = Math.pow(height, 2);
        double hypotenuse = Math.sqrt(widthSquared + heightSquared);


        turtle.setPenWidth(3);
        turtle.setColor(Color.MAGENTA);

        turtle.penUp();
        turtle.goTo(-width / 2, height / 2);  // Start from the top-left corner
        turtle.setHeading(45);  // Face the turtle towards the bottom-right corner
        turtle.penDown();
        turtle.forward(hypotenuse);

        // Draw the second diagonal (top-right to bottom-left)
        turtle.penUp();
        turtle.goTo(width / 2, height / 2);  // Move to the top-right corner
        turtle.setHeading(135);  // Face the turtle towards the bottom-left corner
        turtle.penDown();
        turtle.forward(hypotenuse);
        }
    }