package questionOne;

import java.util.Scanner;
public class DriverClass{

	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("__________Reverse Number__________");
		System.out.print("Enter Number: ");
		int number = scan.nextInt();
		ReverseNumber reversing = new ReverseNumber(number);
		System.out.println("Reversed Number: "+reversing.reverse());
	}

}
