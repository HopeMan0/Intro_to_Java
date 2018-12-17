import java.util.*;

class Test {
	public static final String ANSI_YELLOW 	= "\u001B[33m";
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print(ANSI_YELLOW + "Whos's the cutest person alive? ");
		String text = input.nextLine();
		if(text.equalsIgnoreCase("Brandi")){
			System.out.println("Correct!!!!! I love brandi");
		}
		else{
			System.out.print("Wrong. Brandi is the cutest");
		}
	}
}