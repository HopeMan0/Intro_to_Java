//Trayce MArtineau
//11-12-18

import java.util.*;

class Exercise10_7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("ID: ");
		int pin = input.nextInt();

		int choice;
		double withdraw;
		double deposit;
		
		
		while(pin != -1){
			if(pin == 0 || pin == 1 || pin == 2 || pin == 3 || pin == 4 || pin == 5 || pin == 6 || pin == 7 || pin == 8 || pin == 9){
				System.out.println("Main menu");
				System.out.println("1: check balance");
				System.out.println("2: withdraw");
				System.out.println("3: deposit");
				System.out.println("4: exit");
				choice = input.nextInt();
				//switch for menu choices
				switch(choice){
					case 1 : System.out.println(Account.getBalance);
					break;
					case 2 : System.out.print("Enter amount you'd like to withdraw: ");
						withdraw = input.nextDouble();
						Account.setBalance = Account.getBalance - withdraw;
					break;
					case 3 : System.out.print("Enter amount you'd like to deposit: ");
						deposit = input.nextDouble();
						Account.setBalance = Account.getBalance + deposit;
					default: System.out.println("Enter Valid choice!!");
					case 4 : pin = -1;
				}
			}
			else{
				System.out.println("Enter a valid pin");
			}
		}
	}
}