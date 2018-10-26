import java.util.*;
import javax.swing.*;


class FireEmblem {
	public static final String ANSI_RESET 	= "\u001B[0m";
	public static final String ANSI_RED 	= "\u001B[31m";
	public static final String ANSI_GREEN	= "\u001B[32m";
	public static final String ANSI_YELLOW 	= "\u001B[33m";
	public static final String ANSI_BLUE 	= "\u001B[34m";
	public static void main(String[] args) {
		//stats
		double strength     = 0;	
		double stamina      = 0;
		double reflex       = 0;
		double mind         = 0;
		double fate			= 0;
		double charisma     = 0;
		double range 		= 0;
		
		Scanner input  = new Scanner(System.in);
		System.out.println("First, Enter your name: ");
		String name = input.nextLine();
		
		
		System.out.println("Choose a class: ");
		System.out.println(">Wizard");
		System.out.println(">Soldier");
		System.out.println(">Archer");

		String 	player = input.nextLine();
		while(player.equalsIgnoreCase("Wizard") || player.equalsIgnoreCase("Archer") || player.equalsIgnoreCase("Soldier"));
			if(player.equalsIgnoreCase("Wizard")){
				//Decide Stats
				strength 	 = strength + 25;
				stamina 	 = stamina	+ 10;
				reflex 		 = reflex	+ 15;
				mind 		 = mind 	+ 30;
				fate 		 = fate 	+ 13;
				charisma	 = charisma + 5;
			
				range		 = range + 3;
			
				}
			else if(player.equalsIgnoreCase("Soldier")){
				strength 	 = strength + 35;
				stamina 	 = stamina	+ 25;
				reflex 		 = reflex	+ 30;
				mind 		 = mind 	+ 0;
				fate 		 = fate 	+ 8;
				charisma	 = charisma + 15;
			
				range		 = range + 2;
			

				}
			else if(player.equalsIgnoreCase("Archer")){
				strength 	 = strength + 15;
				stamina 	 = stamina	+ 14;
				reflex 		 = reflex	+ 25;
				mind 		 = mind 	+ 24;
				fate 		 = fate 	+ 16;
				charisma	 = charisma + 40;
			
				range		 = range + 5;
			
				}
			else{
				System.out.print("Error");
			}
		System.out.print("Str: " + strength);
		System.out.print(" Stm: " + stamina);
		System.out.print(" Rflx: " + reflex);
		System.out.print(" Mind: " + mind);
		System.out.print(" Fate: " + fate);
		System.out.print(" Chr: " + charisma);
		System.out.print(" Range: " + range);
		
	}
	
}
