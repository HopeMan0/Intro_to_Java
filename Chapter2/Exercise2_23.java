//TrayceMartineau 10_9_18
import java.util.*;

class Exercise2_23 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter distance you'll travel(in miles): ");
		double distance = input.nextDouble();
				
		System.out.println("Enter mpg: ");
		double mpg		= input.nextDouble();
				
		System.out.println("Enter price per gallon: ");
		double pricePerGal		= input.nextDouble();
		
		double gallons = distance / mpg;
		double cost    = gallons * pricePerGal;
		cost = (cost * 100) / 100;
		
		System.out.print("Cost: " + cost);
				
	}
}