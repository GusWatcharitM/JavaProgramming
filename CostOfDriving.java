import java.util.Scanner;

public class CostOfDriving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the distance to drive (in miles): ");
        double distance = scanner.nextDouble();

        System.out.print("Enter the fuel efficiency of the car (in miles per gallon): ");
        double fuelEfficiency = scanner.nextDouble();

        System.out.print("Enter the price per gallon of fuel: $");
        double pricePerGallon = scanner.nextDouble();

        double costOfTrip = (distance / fuelEfficiency) * pricePerGallon;

        System.out.println("The cost of the trip is: $" + costOfTrip);
    }
}