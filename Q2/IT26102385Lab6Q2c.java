import java.util.Scanner;

public class IT26102385Lab6Q2c {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];
        int i = 0;
        int sum = 0;

        System.out.println("Please enter 10 numbers:");

        // 1. Vaangura loop
        while (i < 10) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
            sum = sum + numbers[i];
            i++;
        }

        System.out.println();
        System.out.println("The numbers you entered are:");

        // 2. Print panra loop
        i = 0;
        while (i < 10) {
            System.out.print(numbers[i] + " ");
            i++;
        }

        System.out.println();
        System.out.println();

        // 3. Sum & Average
        double average = (double) sum / 10;
        System.out.println("Sum of the numbers: " + sum);
        System.out.println("Average of the numbers: " + average);
    }
}