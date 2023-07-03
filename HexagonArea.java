import java.util.Scanner;

public class HexagonArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of the side: ");
        double side = input.nextDouble();

        // Calculate the area using the formula
        double area = (3 * Math.sqrt(3)) / 2 * Math.pow(side, 2);

        System.out.println("The area of the hexagon is " + area);
    }
}