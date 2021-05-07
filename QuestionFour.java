package questionOne;


import java.util.Scanner;
public class QuestionFour {

	public static int[] sort(int[] tempArray,int size) {
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(tempArray[i]>tempArray[j]) {
					tempArray[i]+=tempArray[j];
					tempArray[j]=tempArray[i]-tempArray[j];
					tempArray[i]=tempArray[i]-tempArray[j];
				}
			}
		}
		return tempArray;
	}
	
	public static int nextMaxElement(int[] array,int element,int start) {
		int max=element;
		for(int i=start;i<array.length;i++) {
			if(max<array[i]) {
				max=array[i];
				break;
			}
		}
		return max;
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
		/*int[] sortedArray = sort(array,array.length);
		for(int i:sortedArray) {
			System.out.print(i+",");
		}*/
		System.out.println();
		for(int i=0;i<size;i++) {
			if(array[i]==nextMaxElement(array,array[i],i+1)){
				array[i]=-1;
			}
			else if(array[i]<nextMaxElement(array,array[i],i+1)) {
				array[i]=nextMaxElement(array,array[i],i+1);
			}
		}
		for(int i:array) {
			System.out.print(i+",");
		}
		scan.close();
	}

}
