import java.util.Scanner;

public class HubbardP4 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        Square[] squareList = new Square[100]; 
        int count = 0;

        // Ask the user how many squares they want to create (up to 20)
        System.out.print("How many squares do you want to create (max 20)? ");
        int num = keyboard.nextInt();

        // Limit the number of squares to 20
        if (num > 20) {
            num = 20;
        }

        // Loop to create squares
        for (int i = 0; i < num; i++) {
            System.out.print("Enter the side for square " + (i + 1) + ": ");
            int side = keyboard.nextInt();
            keyboard.nextLine(); // Consume leftover newline

            System.out.print("Enter the color for square " + (i + 1) + ": ");
            String color = keyboard.nextLine(); // Properly read color input

            squareList[count] = new Square(side, color); 
            count++;
        }

        // Print the number of squares added to the list
        System.out.println("\nNumber of squares added to the list: " + count);

        // Print information for each square, including area and perimeter
        for (int i = 0; i < count; i++) {
            Square s = squareList[i];
            System.out.println("\nSquare " + (i + 1) + ":");
            System.out.println("Side: " + s.getSide());
            System.out.println("Color: " + s.getColor());
            System.out.println("Area: " + s.getArea());
            System.out.println("Perimeter: " + s.getPerimeter());
        }

            }
}
