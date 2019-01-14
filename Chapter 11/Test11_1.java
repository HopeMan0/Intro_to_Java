//Trayce Martineau
//Dec 18 2018

import java.util.*;

class Test11_1 {
	public static void main(String[] args) {
		GeometricObject Triangle = new GeometricObject();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the length of side 1, side 2, and side 3: ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		System.out.print("Enter the color of the triangle: ");
		String color = input.next();
		System.out.print("Is the triangle filled with this color?(true or false): ");
		boolean truorfals = input.nextBoolean();
		
		Triangle triangle = new Triangle(side1, side2, side3);
		
		System.out.println(triangle.toString());
		System.out.println("Area: " + triangle.getArea(side1, side2, side3));
		System.out.println("Perimeter: " + triangle.getPerimeter(side1, side2, side3));
		System.out.println("Color: " + color);
		System.out.println("Triangle filled: " + truorfals);
	}
}