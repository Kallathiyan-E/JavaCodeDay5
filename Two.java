package question;

import java.util.Scanner;

public class Two {
	
	public static int absolute(int element) {
		return element<0?-element:element;
	}
	
	public static int startNumber(int num) {
		while(num>=10) {
			num/=10;
		}
		return num;
	}
	
	public static int noOfDigits(int value) {
		int digitCount=0;
		while(value!=0) {
			digitCount++;
			value/=10;
		}
		return digitCount;
	}

	public static boolean isSteppingNumber(int value) {
		if(value>=0 && value<=10) {
			return true;
		}

		if(noOfDigits(value)%2==0) {	
			int firstDigit = startNumber(value);
			int lastDigit = value%10;
			int current;
			if(absolute(firstDigit-lastDigit)==1) {
				value/=10;
				while(value!=0) {
					current = value%10;
					if(absolute(current-lastDigit)!=1) {
						return false;
					}
					lastDigit = current;
					value/=10;
				}
				return true;
				
			}
			else {
				return false;
			}
		}
		else
			return false;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
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
		scan.close();
	}

}
