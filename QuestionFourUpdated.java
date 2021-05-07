package questionOne;

//2,4,8,90,77,54
//2,-1,0,-1,3
import java.util.Scanner;
public class QuestionFourUpdated {

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
	public static int nextMinElement(int[] array, int start) {
		int min = Integer.MAX_VALUE;
		for(int i=start;i<array.length;i++) {
			if(min>array[i])
				min = array[i];
		}
		return min;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input :");
		int size=0;
		boolean flag =false;
		String input = scan.next();
		String[] inputChar = input.split(",");
		int[] array = new int[inputChar.length];
		for(String i:inputChar) {
			array[size++] = Integer.parseInt(i);
		}
		for(int i=0;i<size;i++) {
			if(array[i]<0) {
				flag=true;
				break;
			}
		}
		if(flag) {
			for(int i=0;i<size;i++) {
				if(array[i]==nextMaxElement(array,array[i],i+1)){
					array[i]=-1;
				}
				else if(array[i]<nextMaxElement(array,array[i],i+1)) {
					array[i]=nextMaxElement(array,array[i],i+1);
				}
			}
		}
		else {
			for(int i=0;i<size;i++) {
					if(array[i]==nextMaxElement(array,array[i],i+1)){
						array[i]=-1;
					}
					else if(array[i]<nextMinElement(array,i+1)) {
						array[i]=nextMinElement(array,i+1);
					}
			}
		}
		for(int i:array) {
			System.out.print(i+",");
		}
		scan.close();
	}

	

}