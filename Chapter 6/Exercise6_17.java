//Trayce Martineau
//12-12-18

import java.util.*;

class Exercise6_17 {
	public static void main(String[] args) {
		System.out.print("Enter your number: ");
		
		Scanner input   = new Scanner(System.in);
		int n 	 		= input.nextInt();
		printMatrix(n);
	}
	public static void printMatrix(int n){
		
		for(int e = 0; e < n; e++){
			System.out.println("");
			for(int i = 0; i < n; i++){
				int rando = (int)(0 + Math.random() * 1 + Math.random());
				System.out.print(" " + rando);
			//System.out.println((int(0 + Math.random())) * 1 + 1)
			}
		}
	}
}