package tooHot;

public class TooHot {

	public static void InputNumbers(int temperature, boolean isSummer) {
		int summerTrue=0;
		if(isSummer) {
			summerTrue=10;
		}
		if(temperature>=60 && temperature<=(90+summerTrue)) {
			System.out.print("Result = True");	
		}
		else {
		System.out.print("Result = False");	
		}
	}
	
	public static void main(String[] args) {
		InputNumbers(62,true);
	}

}
