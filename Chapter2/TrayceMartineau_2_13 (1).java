import java.util.*;


class TrayceMartineau_2_13 {
	public static void main(String[] args) {
		System.out.print("Enter monthly savings: ");
		
		Scanner input = new Scanner(System.in);
		double money  = input.nextInt();
		double rate   = 0.00417;
		double total  = 0;
		
		total = money * (1 + rate);
		total = (100 + total ) * (1 + rate);
		total = (100 + total ) * (1 + rate);
		total = (100 + total ) * (1 + rate);
		total = (100 + total ) * (1 + rate);
		
		
		
		System.out.println(total);
	}
}