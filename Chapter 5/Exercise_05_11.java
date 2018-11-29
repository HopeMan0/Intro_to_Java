//Trayce Martineau 9-21-18
                  
public class Exercise_05_11 {
	public static void main(String[] args) {
		
		//count numbers per line
		final int line = 10;	
		int 				 count = 0; 
		
		//use only numbers between 1 - 100
		for (int i = 100; i <= 200; i++) {
			//Decide whether the number is devisable by 5 or 6 and not both
			if (i % 5 == 0 ^ i % 6 == 0) {
				count++;
				if (count % line == 0)
					System.out.println(i);
				else
					System.out.print(i + " ");			
			}
		}
		System.out.println("oh no");
	}
}