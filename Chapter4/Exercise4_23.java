//Exercise 4-23 Trayce Martineau 10-30-18

import java.util.*;

class Exercise4_23 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter Name: ");
		String name = input.nextLine();
		
		System.out.print("Enter hours worked: ");
		double hours = input.nextDouble();
		
		System.out.print("Enter hourly pay rate: ");
		double payrate = input.nextDouble();
		
		System.out.print("Enter FIT withholding(as decimal): ");
		double fit = input.nextDouble();
		
		System.out.print("Enter State Tax withholding(as decimal): ");
		double state = input.nextDouble();
		
		//Maths
		
		double grosspay 	= hours * payrate;
		double fitwitheld 	= grosspay * fit;
		double statewitheld = grosspay * state;
		
		double deductions = fitwitheld + statewitheld;
		double netpay	  = grosspay - (fitwitheld + statewitheld);
		
		double fitpercent = fit * 100;
		double statepercent = state * 100;
		
		//display
		System.out.println("Emplyee Name: " + name);
		System.out.println("Hours Worked: " + hours);
		System.out.println("Pay Rate: $" + payrate);
		System.out.println("GrossPay: $" + grosspay);
		System.out.println("Deductions: ");
		System.out.println("		Federal Withholding (" + fitpercent + "%): $" + fitwitheld);
		System.out.println("		State Withholding (" + statepercent + "%): $" + statewitheld);
		System.out.println("		Total Deductions: $" + deductions );
		System.out.println("NetPay: $" + netpay);
	}
}