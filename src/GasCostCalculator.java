import java.util.Scanner;
public class GasCostCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double gallonsOfGas;
        double fuelEfficiency;
        double pricePerGallon;
        do {
            System.out.print("Enter the number of gallons of gas in the tank: ");
            if (scanner.hasNextDouble()) {
                gallonsOfGas = scanner.nextDouble();
                if (gallonsOfGas > 0) {
                    break;
                } else {
                    System.out.println("Please enter a value greater than zero.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid number for gallons.");
                scanner.next();
            }
        } while (true);
        do {
            System.out.print("Enter the fuel efficiency in miles per gallon: ");
            if (scanner.hasNextDouble()) {
                fuelEfficiency = scanner.nextDouble();
                if (fuelEfficiency > 0) {
                    break;
                } else {
                    System.out.println("Please enter a value greater than zero.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid number for fuel efficiency.");
                scanner.next();
            }
        } while (true);
        do {
            System.out.print("Enter the price of gas per gallon: ");
            if (scanner.hasNextDouble()) {
                pricePerGallon = scanner.nextDouble();
                if (pricePerGallon > 0) {
                    break;
                } else {
                    System.out.println("Please enter a value greater than zero.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid number for price per gallon.");
                scanner.next();
            }
        } while (true);
        double costToDrive100Miles = (100 / fuelEfficiency) * pricePerGallon;
        double distanceWithFullTank = gallonsOfGas * fuelEfficiency;
        System.out.printf("The cost to drive 100 miles is: $%.2f%n", costToDrive100Miles);
        System.out.printf("The car can go %.2f miles with a full tank of gas.%n", distanceWithFullTank);
        scanner.close();
    }
}
