import java.util.Scanner;

public class IT26102385Lab6Q2b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String result = "";
        int i = 1;

        System.out.println("Please enter 10 numbers:");

        while (i <= 10) {
            System.out.print("Enter number " + i + ": ");
            int number = input.nextInt();
            result = result + number + " ";
            i++;
        }

        System.out.println();
        System.out.println("The numbers you entered are:");
        System.out.println(result);
    }
}	