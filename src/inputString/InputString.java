package inputString;

//import java.util.Scanner;

public class InputString {
/* Over complication!

	public static void writeText() {
		
		System.out.print("Your name is ");
			 
	}
	
	public static void main(String[] args) {
		
		System.out.println("Enter your name: ");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		scanner.close();
		writeText();
		System.out.print(name);
		
	}
*/
	
	public static void writeText(String text) {
		
		System.out.print(text);
			 
	}
	
	public static void main(String[] args) {
		
		writeText("Hello World!");
	}
}
