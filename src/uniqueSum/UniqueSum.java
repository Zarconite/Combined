package uniqueSum;

public class UniqueSum {

	public static void InputNumbers(int number1, int number2, int number3) {
		int result=0;
		if(number1==number2 && number2==number3) {
			result=0;
		}
		else if(number1==number2) {
			result=number3;
		}
		else if(number2==number3) {
			result=number1;
		}
		else if(number3==number1) {
			result=number2;
		}
		else {
			result=number1+number2+number3;
		}

		System.out.print("Result = "+result);	
	}
	
	public static void main(String[] args) {
		InputNumbers(2,3,4);
	}

}
