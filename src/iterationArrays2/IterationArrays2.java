package iterationArrays2;

public class IterationArrays2 {
	
	public static void inputNumber(int number1) {
		System.out.println("Result = "+number1);	
	}
	
	public static void main(String[] args) {
		int arrayInput=0;
		int[] array ={0,0,0,0,0,0,0,0,0,0};
		
		for (int i=0; i<10; i++) {
			
			array[i]=i;
			inputNumber(array[i]);
			
		}
		
		for (int j=0; j<10; j++) {
			
			arrayInput=10*array[j];
			inputNumber(arrayInput);
			
		}

	}
	
}
