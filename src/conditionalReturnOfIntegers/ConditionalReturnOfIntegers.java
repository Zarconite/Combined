package conditionalReturnOfIntegers;

public class ConditionalReturnOfIntegers {

	public static void InputNumbers(int number1, int number2, boolean sum) {
		int result = 0;
		if(sum==true) {
			result = number1+number2;
		}
		else {
			result = number1*number2;
		}
		
		System.out.print("Result = "+result);	
	}
	
	public static void main(String[] args) {
		InputNumbers(5,6,false);
	}
	
}
