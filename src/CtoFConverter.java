import java.util.Scanner;

public class CtoFConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter temperature in Celsius: ");
            if (scanner.hasNextDouble()) {
                double celsius = scanner.nextDouble();
                double fahrenheit = (celsius * 9 / 5) + 32;
                System.out.printf("The equivalent temperature in Fahrenheit is: %.2f°F%n", fahrenheit);
                break;
            } else {
                System.out.println("Invalid input. Please enter a valid number for temperature.");
                scanner.next();
            }
        }
        scanner.close();
    }
}