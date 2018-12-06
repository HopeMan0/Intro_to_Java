import java.util.*;

class Exercise6_17 {
	public static void main(String[] args) {
		System.out.print("Enter your number: ");
		
		Scanner input   = new Scanner(System.in);
		int n 	 		= input.nextInt();
	}
	public static void printMatrix(int n){
		for(int i = 0; i < n; i++){
			int rando = (int)(0 + Math.random() * 1 + 1);
			System.out.print(" " + rando);
			//System.out.println((int(0 + Math.random())) * 1 + 1)
			
		}
	}
}