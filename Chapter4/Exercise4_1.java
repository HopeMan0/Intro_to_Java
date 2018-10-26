//Trayce martineau 10-26-18
import java.util.*;

class Exercise4_1 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.print("Enter length from vertex to center: ");
		double radius = input.nextDouble();
		
		double area = 0;
		double side = 0;
		
		
		side = (2 * radius) * Math.sin(Math.PI / 5);
		area = (5 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 5));

		System.out.println("The area of the pentaggon: " + area);
	}
}