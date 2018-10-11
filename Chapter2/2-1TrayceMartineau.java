//Trayce Martineau 9-19-18
import java.util.*;

class Temps {
	public static void main(String[] args) {
		double Celsius 	 = 0;
		double Farenheit = 0;
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter temperature for conversion (Celcius)");
		double celsius = input.nextDouble();
		
		double farenheit = (9.0/5.0) * celsius + 32;
		
		System.out.println(celsius + " degrees celsius is " + farenheit + " degrees farenheit.");
	}
}