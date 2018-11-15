import java.util.*;

class Exercise5_1 {
	public static void main(String[] args) {
		
		int positive = 0;
		int negative = 0;
		int total    = 0;
		
		Scanner input = new Scanner (System.in);
		System.out.print("Enter a positive or negative number: ");
		int number = input.nextInt();
		while(number != 0){
			System.out.print("Enter a positive or negative number(0 to end): ");
			number = input.nextInt();
			if(number > 0){
				positive = positive + 1;
				total = total + 1;
			}
			else if(number < 0){
				negative = negative + 1;
				total = total + 1;
			}
			else{
				//nada
			}
		}
		System.out.println("Positive numbers: " + positive);
		System.out.println("Negative numbers: " + negative);
		System.out.println("Total numbers: " + total);
	}
}