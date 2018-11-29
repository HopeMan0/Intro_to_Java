//Trayce MArtineau
//11-12-18

import java.util.*;

class Exercise10_7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int choice;
		
		Account[] atm = new Account[10];
		
		for(int i = 0; i < 10; i++){
			atm[i] = new Account(i, 100);
		}
		
		System.out.print("ID (-1 to quit): ");
		int id = input.nextInt();
		
		while(id != -1){
			if(id == 0 || id == 1 || id == 2 || id == 3 || id == 4 || id == 5 || id == 6 || id == 7 || id == 8 || id == 9){
				System.out.println("Main menu");
				System.out.println("1: check balance");
				System.out.println("2: withdraw");
				System.out.println("3: deposit");
				System.out.println("4: exit");
				choice = input.nextInt();
				double balance = atm[id].getBalance();
				//switch for menu choices
				switch(choice){
					case 1 : System.out.println(balance);
						break;
					case 2 : 
						System.out.print("Enter amount you'd like to withdraw: ");
						double withdraw = input.nextDouble();
						balance = balance - withdraw;
						atm[id].setBalance(balance);
						break;
					case 3 : 
					System.out.print("Enter amount you'd like to deposit: ");
						double deposit = input.nextDouble();
						balance = balance + deposit;
						atm[id].setBalance(balance);
						break;
					case 4 : id = -1;
					default: 
						System.out.println("Enter Valid choice!!");
				}
				System.out.println("Balance: " + balance);
			}
			else{
				System.out.println("Enter a valid id");
			}
			System.out.print("ID (-1 to quit): ");
			id = input.nextInt();
		}
	}
}