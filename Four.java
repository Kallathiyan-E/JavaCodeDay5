package question;

import java.util.Scanner;

//2,4,8,90,77,54
//2,-1,0,-1,3

public class Four {

	public static int absolute(int number) {
		return number<0?-number:number;
	}
	
	public static int nextElement(int[] array,int size,int element, int start) {		
		int sizeTwo = size-start;
		int[] max = new int[sizeTwo];
		int k=0;
		for(int i=start;i<size;i++) {
			if(array[i]>element)
				max[k++]=array[i];
		}
		int min = Integer.MAX_VALUE;
		for(int i=0;i<k;i++) {
			if(min>max[i])
				min=max[i];
		}
		if(min==Integer.MAX_VALUE)
			return -1;
		else
			return min;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input :");
		int size=0;
		String input = scan.next();
		String[] inputChar = input.split(",");
		int[] array = new int[inputChar.length];
		for(String i:inputChar) {
			array[size++] = Integer.parseInt(i);
		}
		for(int i=0;i<size-1;i++) {
			array[i]=nextElement(array,size,array[i],i+1);
		}
		array[size-1]=-1;
		System.out.print("Output :");
		for(int i:array) {
			System.out.print(i+",");
		}
		scan.close();
	}
}
