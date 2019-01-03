//Trayce Martineau
//December 20th 2018

import java.util.*;
import java.util.ArrayList;

class Exercise11_13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> numbers = new ArrayList<>();
		
		System.out.print("Enter 10 integers (-1 to end): ");
		for (int i = 0; i < 10; i++){
			numbers.add(input.nextInt());
		}
	removeDuplicate(numbers);
		System.out.print("The distinct integers are: ");
		for (int i = 0; i < numbers.size(); i++){
			System.out.print(numbers.get(i) + " ");
		}
	}
	public static void removeDuplicate(ArrayList<Integer> numbers) {
		for (int i = 0; i < numbers.size(); i++){
			for (int j = i + 1; j < numbers.size(); j++){
				if (numbers.get(i) == numbers.get(j)){
					numbers.remove(j);
				}
			}	
		}	
	}
}