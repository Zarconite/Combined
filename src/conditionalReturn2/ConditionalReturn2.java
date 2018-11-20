package conditionalReturn2;

public class ConditionalReturn2 {

	public static void InputNumbers(int number1, int number2) {
		int result = 0;
		if(number2==0) {
			result = number1;
		}
		else {
			result = number1+number2;
		}
		
		System.out.print("Result = "+result);	
	}
	
	public static void main(String[] args) {
		InputNumbers(0,7);
	}

}
