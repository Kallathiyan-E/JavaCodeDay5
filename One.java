package question;

import java.util.Scanner;
public class One {
	private static Scanner scan = new Scanner(System.in);
	
	public static boolean isValidate(String query, int size) {
		for(int i=0;i<size;i++) {
			if(!(query.charAt(i)>='0' && query.charAt(i)<='9')) {
				return false;
			}
		}
		return true;
	}
	
	public static int length(String query) {
		int lengthOfString = 0;
		try{
			for(int i=0;;i++) {
				query.charAt(i);
				lengthOfString++;
			}
			
		}
		catch(StringIndexOutOfBoundsException e) {
			
		}
		return lengthOfString;
	}
	
	public static void main(String[] args) {
		System.out.println("\t\tReversing Number");
		System.out.print("Enter Number =");
		String input = scan.next();
		int size =length(input);
		if(isValidate(input,size)) {
			System.out.print("Reversed Number =");
			for(int i=size-1;i>=00;i--) {
				System.out.print(input.charAt(i));
			}
		}
		else
			System.err.println("Please enter a Valid Number");
		
	}

}
