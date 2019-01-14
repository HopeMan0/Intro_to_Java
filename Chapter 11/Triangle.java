//Trayce Martineau
//Dec 18 2018

class Triangle extends GeometricObject {
	private double side1;
	private double side2;
	private double side3;
	
	Triangle() {
			side1 = 1.0;
			side2 = 1.0;
			side3 = 1.0;
		}
	Triangle(double side1, double side2, double side3) { 
			this.side1 = side1;
			this.side2 = side2;
			this.side3 = side3;
		}
	public static double getPerimeter(double side1, double side2, double side3){
		double perimeter = side1 + side2 + side3;
		return perimeter;
	}
	public static double getArea(double side1, double side2, double side3){
		double s 	= (side1 + side2 + side3) / 2;
		double area = Math.sqrt(s * (s - side1) 
			* (s - side2) * (s - side3));
		return area;
	}
	public static String toString(double side1, double side2, double side3, double perimeter, double area){
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3 + " Triangle perimeter = " + perimeter + " area = " + area;
	}
}