import java.util.Scanner;

public class ComputeBMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double weightPounds = input.nextDouble();

        System.out.print("Enter height in inches: ");
        double heightInches = input.nextDouble();

        // Convert weight from pounds to kilograms
        double weightKg = weightPounds * 0.45359237;

        // Convert height from inches to meters
        double heightMeters = heightInches * 0.0254;

        // Calculate the BMI
        double bmi = weightKg / (heightMeters * heightMeters);

        System.out.println("BMI is " + bmi);
    }
}
    

