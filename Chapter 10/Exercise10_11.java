//Trayce Martineau
//11-30-18
import java.util.*;

class Exercise10_11 {
	public static void main(String[] args) {
		Circle2D c1 = new Circle2D();
		Circle2D c2 = new Circle2D(0, 0, 5);
		
		System.out.println(c1);
		System.out.println(c1);
		
		//test contains method
		System.out.println("\nIs point (1,1) inside c2? " + c2.contains(1, 1));
		System.out.println("\nIs point (6,6) inside c2? " + c2.contains(6, 6));
		System.out.println("\nIs c1 inside c2? " + c2.contains(c1));
		System.out.println("\nIs c2 inside c1? " + c1.contains(c2));

		// Test overlap method
		System.out.println("\nWill c1 overlap c2? " + c2.overlaps(c1));
		System.out.println("\nWill circle with (center (5, 0)) radius 2 overlap c2? " + c2.overlaps(new Circle2D(10, 0, 2)));

	}
}