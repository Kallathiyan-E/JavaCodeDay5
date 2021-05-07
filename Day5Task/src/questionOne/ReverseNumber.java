package questionOne;

public class ReverseNumber extends Number{

	
	public ReverseNumber(int number) {
		super(number);
	}
	
	@Override
	public int reverse() {
		int remainder;
		int reversed=0;
		int temp = getNumber();
		while(temp!=0) {
			remainder = temp%10;
			reversed=(reversed*10)+remainder;
			temp/=10;
		}
		return reversed;
	}
	

}
