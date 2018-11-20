package blackJack;

public class BlackJack {

	public static void InputNumbers(int number1, int number2) {
		int number1Difference = 0;
		int number2Difference = 0;
		if(number1>0 && number2>0) {
			
			number1Difference = 21-number1;
			number2Difference = 21-number2;
			
			if(number1Difference<0 && number2Difference<0) {
				System.out.println("Both went bust! No winner");
			}
			else if(number1Difference<0) {
				System.out.println("Number 1 went bust!");
				System.out.println("Winner is Number2 with: "+number1);
			}
			else if(number2Difference<0) {
				System.out.println("Number 2 went bust!");
				System.out.println("Winner is Number1 with: "+number1);
			}
			else {
				if(number1Difference<number2Difference) {
					System.out.println("Winner is Number1 with: "+number1);
				}
				else {
					System.out.println("Winner is Number2 with: "+number2);
				}
			}
		}
		else {
			System.out.println("Please enter 2 integers above 0!");
		}
	}
	
	public static void main(String[] args) {
		InputNumbers(15,22);
	}

}
