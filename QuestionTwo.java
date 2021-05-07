package questionOne;

import java.util.Scanner;

public class QuestionTwo {

	private static Scanner scan = new Scanner(System.in);
	
	public static int startNumber(int num) {
		int result=0;
		while(num!=0) {
			result = num%10;
			num/=10;
		}
		return result;
	}
	
	public static boolean isSteppingNumber(int value) {
		int firstDigit = startNumber(value);
		int lastDigit = value%10;
		int current;
		if(value>=0 && value<=10) {
			return true;
		}
		else if(value>10 && value<=99) {
			if(Math.abs(firstDigit-lastDigit)==1)
				return true;
			else
				return false;
		}
		else if(Math.abs(firstDigit-lastDigit)==1){
				value/=10;
				while(value!=0) {
					current = value%10;
					if(Math.abs(lastDigit-current)!=1) {
						return false;
					}
					lastDigit=current;
					value/=10;
				}
				return true;
			}
			else {
				return false;
			}			
	}
	public static void main(String[] args) {
		System.out.print("Input:");
		String input = scan.next();
		String[] inputArray = input.split(",");
		boolean flag=false;
		int start = Integer.parseInt(inputArray[0]);
		int end = Integer.parseInt(inputArray[1]);
		for(int i=start;i<=end;i++) {
			if(isSteppingNumber(i)) {
				System.out.print(i+",");
				flag=true;
			}
		}
		if(!flag)
			System.out.println("No Stepping Numbers");
	}

}
