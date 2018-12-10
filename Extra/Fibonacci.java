import java.util.*;

class Fibonacci {
	public static void main(String[] args) {
		System.out.print("Enter starting number: ");
		Scanner input  = new Scanner(System.in);
		int num 	   = input.nextInt();
		int sequence   = 0;
		
		while(num < 100000000 && sequence < 1000000000){
			num		 = num + sequence;
			System.out.print(" " + num);
			sequence = num + sequence;
			System.out.print(" " + sequence);
		}
	}
}