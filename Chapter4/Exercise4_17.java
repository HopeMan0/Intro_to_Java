//Taryce Martineau 10-26-18

import java.util.*;

class Exercise4_17 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.print("Enter year: ");
		int year 		= input.nextInt();
		System.out.print("Enter month (first 3 letters): ");
		String month 	= input.next();
		
		
		boolean isLeapYear =
		(year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
			
		if(month = "Jan" || "Mar" || "Jul" || "Aug" || "Oct" || "Dec"){
			int days = 31;
			System.out.println("Days: " + days);
		}
		else if( month = "Apr" || "Jun" || "Sep" || "Nov"){
			int days = 30;
			System.out.println("Days: " + days);
		}
		else if( month = "Feb"){
			if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
			int days = 29;
			System.out.println("Days: " + days);
			}
			else{
				int days = 28;
				System.out.println("Days: " + days);
			}
		}
		else{
			System.out.println("Type a real month, silly");
		}
	}
}