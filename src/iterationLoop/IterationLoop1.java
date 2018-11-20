package iterationLoop;

public class IterationLoop1 {

	public static void inputNumbers(int number1, int number2) {
		int result = 0;
		if(number2==0) {
			result = number1;
		}
		else {
			result = number1+number2;
		}
		
		System.out.println("Result = "+result);	
	}
	
	public static void main(String[] args) {
		for (int i=0; i<10; i++) {
		inputNumbers(5,7);
	}
	}
	
}
