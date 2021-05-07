package questionOne;

//R,G,B,G,B,G,R
//B,G,B,R,G,R,B,G,R,R,B

import java.util.LinkedHashMap;
import java.util.Scanner;

public class QuestionFive {
	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Input:");
		String input = scan.next();
		String[] inputArray = input.split(",");
		LinkedHashMap<String,Integer> balloons = new LinkedHashMap<>();
		for(String i:inputArray) {
			if(balloons.containsKey(i))
				balloons.put(i,balloons.get(i)+1);
			else
				balloons.put(i,1);
		}
		int frequency;
		for(String str:balloons.keySet()) {
			frequency = balloons.get(str);
			while(frequency-->0) {
				System.out.print(str+",");
			}
		}
	}

}
