package sumOfIntegers;

//import java.util.Scanner;

public class SumOfIntegers {
/*
	public static void InputNumbers() {
		
		int number1 = 0;
		int number2 = 0;
		int result = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number 1:");
		try {
		number1 = scanner.nextInt();
		}
		catch(Exception e){
			System.out.println("Please enter a valid number!");
		}
		System.out.println("Enter Number 2:");
		try {
		number2 = scanner.nextInt();
		}
		catch(Exception e){
			System.out.println("Please enter a valid number!");
		}
		scanner.close();
		result = number1+number2;
		System.out.print(number1+" + "+number2+" = "+result);	
	}
	
	public static void main(String[] args) {
		InputNumbers();
	}
	*/
	public static void InputNumbers(int number1, int number2) {
		int result = number1+number2;
		System.out.print("Result = "+result);	
	}
	
	public static void main(String[] args) {
		InputNumbers(5,6);
	}
}
