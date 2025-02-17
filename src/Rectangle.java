import java.util.Scanner;
public class Rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double width, height;
        do {
            System.out.print("Enter the width of the rectangle: ");
            if (scanner.hasNextDouble()) {
                width = scanner.nextDouble();
                if (width > 0) {
                    break;
                } else {
                    System.out.println("Please enter a value greater than zero.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid number for width.");
                scanner.next();
            }
        } while (true);
        do {
            System.out.print("Enter the height of the rectangle: ");
            if (scanner.hasNextDouble()) {
                height = scanner.nextDouble();
                if (height > 0) {
                    break;
                } else {
                    System.out.println("Please enter a value greater than zero.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid number for height.");
                scanner.next();
            }
        } while (true);
        double area = width * height;
        double perimeter = 2 * (width + height);
        System.out.printf("The area of the rectangle is: %.2f%n", area);
        System.out.printf("The perimeter of the rectangle is: %.2f%n", perimeter);
        scanner.close();
    }
}

