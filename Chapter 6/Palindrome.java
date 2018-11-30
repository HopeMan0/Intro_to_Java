import java.util.*;

class Palindrome {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int user 	= 0;
		int num 	= 0;
		int remain	= 0;
		int reverse	= 0;
		
		System.out.print("Enter a number: ");
		user	 = input.nextInt();
		while ( num != 0) {
			remain	 = num % 10;
			reverse	 = remain;
			num 	 = num / 10;
		}

		
	}
}