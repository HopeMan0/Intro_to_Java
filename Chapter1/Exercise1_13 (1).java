//Trayce Martineau 9-19-18
//import the tools
import java.util.Scanner;

//Does some algebra and solves for x and y
class Algebra {
	public static void main(String[] args) {
		
		//activate the scanner		
		Scanner input = new Scanner(System.in);
		
		//Get variables from user
		System.out.print("Enter value a: ");
		double a = input.nextDouble();
		
		System.out.print("Enter value b: ");
		double b = input.nextDouble();
		
		System.out.print("Enter value c: ");
		double c = input.nextDouble();
		
		System.out.print("Enter value d: ");
		double d = input.nextDouble();
		
		System.out.print("Enter value e: ");
		double e = input.nextDouble();
		
		System.out.print("Enter value f: ");
		double f = input.nextDouble();
		
		//solving for x and y
		double x = ((e * d) - (b * f)) / ((a * d) - (b * c));
		double y = ((a * f) - (e * c)) / ((a * d) - (b * c));
		System.out.println("x is " + x + " and y is " + y);
		
		//solving the number
		double fortyFourPointFive = (3.4 * x) + (50.2 * y);
		double fivePointNine      = (2.1 * x) + (0.55 * 7);
		System.out.println("the first solution is " + fortyFourPointFive + " and the second is " + fivePointNine);
	}
}