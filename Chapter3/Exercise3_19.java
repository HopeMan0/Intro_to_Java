//Exercise 3_19
//Trayce Martineau
import java.util.*;

class Exercise3_19 {
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_RED = "\u001B[31m";
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter first side: ");
		double side1 = input.nextDouble();
		System.out.println("Enter second side: ");
		double side2 = input.nextDouble();
		System.out.println("Enter third side: ");
		double side3 = input.nextDouble();
		double perimeter = 0;
		
		if((side1 + side2) >= side3 && (side1 + side3) >= side2 && (side2 + side3) >= side1){
			perimeter = side1 + side2 + side3;
			System.out.println("Your perimeter is: " + perimeter);
		}
		else{
			System.out.println(ANSI_RED + "Invalid input!!!!!!!!! 0:" + ANSI_RESET);
		}
		
		
	}
}