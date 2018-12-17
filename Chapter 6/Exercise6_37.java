//Trayce Martineau
//Exercise 6_37

import java.util.*;

class Exercise6_37 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number: ");
		int number = input.nextInt();
		System.out.print("Enter width:  ");
		int width  = input.nextInt();
		
		int length = String.valueOf(number).length();
		
		System.out.println(format(number - number, width - length) + number);
	}
	public static String format(int number, int width){
		int length = String.valueOf(number).length();
		width = width - length;
		String output = number + "";

		while(width > 0){
			width = width -1;
			output = output + 0;
		}
		return output;
	}
}