import java.util.Scanner;

public class IT26102385Lab6Q3{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		double sumOfSquares = 0;
        int count = 0;
        int number;

        System.out.println("Enter positive integers (terminate input with -99):");

        while (true) {
            System.out.print("Enter a number: ");
            number = input.nextInt();

            // Terminate condition
            if (number == -99) {
                break;
            }

            // Validate for negative input
            if (number < 0) {
                System.out.println("Invalid input. Please enter a positive integer or -99 to terminate");
                continue;
            }

            // Add square to sum
            sumOfSquares += number * number;
            count++;
        }

        if (count > 0) {
            double rms = Math.sqrt(sumOfSquares / count);
            System.out.println("The Root Mean Square (RMS) is: " + rms);
        } else {
            System.out.println("No numbers entered.");
        }

        input.close();
    }
}