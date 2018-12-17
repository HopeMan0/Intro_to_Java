import java.util.*;

class adventDayOne {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int frequency = 0;
		int num = input.nextInt();
				
		while(num != -9999){
			frequency = frequency + num;
		}
		System.out.println("Final frequency: " + frequency);
	}
}