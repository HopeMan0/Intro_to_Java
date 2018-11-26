import java.util.*;

class Exercise5_17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int user = 0;
		
		System.out.print("Enter the number of rows (1-15): ");
		user = input.nextInt();
		
		while (user > 15 || user < 1){
			System.out.print("Enter the number of rows (1-15): ");
			user = input.nextInt();
		}
		
		for (int countDracula = 1; countDracula <= user; count++){
			
		}
	}
}