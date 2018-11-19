//Trayce Martineau 11 - 8 - 18
//Exercise 10-3
//forgive me for my indentation

import java.util.*;

class Exercise10_3 {
	public static void main(String[] args) {
		int[] values = {4, 7, 6}; 

			System.out.println("Test isEven(int):");
			for (int i = 0; i < values.length; i++) {
				System.out.println(values[i] + " " + MyInteger.isEven(values[i]));
			}	
			System.out.println("Test isOdd(int):");
			for (int i = 0; i < values.length; i++) {
				System.out.println(values[i] + " " + MyInteger.isOdd(values[i]));
			}
			System.out.println("");
			System.out.println("Test isPrime(int):");
			for (int i = 0; i < values.length; i++) {
				System.out.println(values[i] + " " + MyInteger.isPrime(values[i]));
			}
			System.out.println("");
			MyInteger value = new MyInteger(6);
			System.out.println("Test equals methods compared to '6':");
			for (int i = 0; i < values.length; i ++){
				System.out.println(values[i] + " " + value.equals(values[i]));
			}
			char[] characters = {'4', '6', '1', '9'};
			String numbers = "4";
			System.out.println("");
			System.out.println(numbers + " is a string lol");

			System.out.println("Test parseInt(char[]) and parseInt(string):");
			for (int i = 0; i < characters.length; i++){
				System.out.print(characters[i] + "");
			}
			System.out.print(" + " +numbers + " = " + (MyInteger.parseInt(characters) + MyInteger.parseInt(numbers)));
			
			System.out.println("");
			System.out.println("That string has now been used as an int (;");
	}
}