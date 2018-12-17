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
		
		for (int count = 1; count <= user; count++){
			//print space
			for( int space = 1; space <= (user - count); space++){
				System.out.print("   ");
			}
			
			//prin left side
			for(int left = count ; left >= 1; left--){
				System.out.printf("%3d", left);
			}
			
			//print right side
			for (int right = 2; right <= count; right++){
				System.out.printf("%3d ", right);
			}
			System.out.println();
		}
	}
}