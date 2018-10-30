//Taryce Martineau 10-26-18

import java.util.*;

class Exercise4_17 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.print("Enter year: ");
		int year 		= input.nextInt();
		System.out.print("Enter month (first 3 letters): ");
		String month 	= input.next();
		
		
		
		switch (month.toLowerCase()) {
			//31days
			case "jan" : System.out.println("31 days");
				break;
			case "mar" : System.out.println("31 days");
				break;
			case "may" : System.out.println("31 days");
				break;
			case "jul" : System.out.println("31 days");
				break;
			case "aug" : System.out.println("31 days");
				break;	
			case "oct" : System.out.println("31 days");
				break;
			case "dec" : System.out.println("31 days");
				break;	
				
				
			//30 days	
			case "apr" : System.out.println("31 days");
				break;
			case "jun" : System.out.println("31 days");
				break;
			case "sep" : System.out.println("31 days");
				break;
			case "nov" : System.out.println("31 days");
				break;
			
			//28/29 days	
			case "feb" : if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
				System.out.println("29 days");
			}
			else{
				System.out.println("28 days");
			}
				break;
		}
	}
}