import java.util.Scanner;
public class IT26102385Lab6Q1{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number");
		double number=sc.nextInt();
		
		double squre=number*number;
		double squreroot=Math.sqrt(number);
		
		System.out.print("squre number is"+squre);
		System.out.print("squreroot is"+squreroot);
		
	}
}