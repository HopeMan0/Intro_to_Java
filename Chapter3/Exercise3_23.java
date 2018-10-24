//Trayce Martineau

import java.util.*;

class Exercise3_23{
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_BLACK = "\u001B[30m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_WHITE = "\u001B[37m";
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter x value: ");
		double x = input.nextDouble();
		System.out.print("Enter y value: ");
		double y = input.nextDouble();
		
		if(x <= 5 && x >= -5 && y <= 2.5 && y >= -2.5){
			System.out.println("Point is in the rectangle!!!!!!!!! >o<");
		}
		else{
			System.out.println(ANSI_RED + "P" + ANSI_RESET +  ANSI_YELLOW + "o" + ANSI_RESET + ANSI_GREEN + "i" + ANSI_RESET + ANSI_PURPLE + "n" + ANSI_RESET + ANSI_BLUE + "t" + ANSI_RESET + " is not in the rectangle¡¡¡¡¡¡¡¡¡¡¡ :(");
		}
	}
}

