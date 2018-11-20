package iterationArrays;

public class IterationArrays {
	
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
		int arrayInput1=0;
		int arrayInput2=0;
		int[] array ={2,5,15,0,6,12,92,10,0,34};
		
		for (int i=0; i<9; i++) {
			
			arrayInput1=array[i];
			arrayInput2=array[i+1];
			inputNumbers(arrayInput1,arrayInput2);
			
		}

	}
}
