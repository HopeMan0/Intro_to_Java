//Exercise 4-23 Trayce Martineau 10-30-18

import java.util.*;

class Exercise4_23 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter Name: ");
		String name = input.newString();
		
		System.out.println("Enter hours worked: ");
		double hours = input.nextDouble();
		
		System.out.println("Enter hourly pay rate: ");
		double payrate = input.nextDouble();
		
		System.out.println("Enter FIT withholding: ");
		double fit = input.nextDouble();
		
		System.out.println("Enter State Tax withholding: ");
		double state = input.nextDouble();
		
		//Maths
		
		double grosspay 	= hours * payrate;
		double fitwitheld 	= grosspay * fit;
		double statewitheld = grosspay * state;
		
		double deductions = fitwitheld + statewitheld;
		double netpay	  = grosspay - (fitwitheld + statewitheld);
		
		//display
		
	}
}