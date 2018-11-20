package arrays1;

public class Arrays1 {

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
		int[] array ={2,5,15,0,6,12,92,10,0,34};
		

			inputNumbers(array[2],array[3]);


	}

}
