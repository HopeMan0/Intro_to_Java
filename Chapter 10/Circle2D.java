//Trayce Martineau
//11-29-18
import java.util.*;

class Circle2D {
	//list attributes
	double x;
	double y;
	double radius;
	
	//no-args constructor
	public Circle2D(){
		this.x		 = 0;
		this.y		 = 0;
		this.radius  = 1;
	}
	
	//ALL-args constructor
	public Circle2D(double x, double y, double radius){
		this.x 		= x;
		this.y 		= y;
		this.radius = radius;
	}
	//mutators
	public double getX(){
		return this.x;
	}
	public double getY(){
		return this.y;
	}
	public double getRadius(){
		return this.radius;
	}
	//area
	public double getArea(){
		return Math.PI * Math.PI * this.radius;
	}
	//cirucmference
	public double getCircumference(){
		return Math.PI * (2 * radius);
	}
	//return true if the point is in the circle
	public boolean contains(double x, double y){
		if (x < (this.x + this.radius) && x > (this.x - this.radius) &&
			y < (this.y + this.radius) && y > (this.y - this.radius)) {
			return true;
		}
		else {
			return false;
		}
	}
	//returns true if the circle is in the cricle
	public boolean contains(Circle2D circle) {
		//solve to find left, right, top, and bottom points
		double leftX 	= circle.getX()  - circle.getRadius();
		double rightX	= circle.getX() + circle.getRadius();
		double topY 	= circle.getY()	 + circle.getRadius();
		double bottomY 	= circle.getY()	 - circle.getRadius();

		//if points are in the circle, return true
		if (this.contains(leftX, circle.getY()) && this.contains(rightX, circle.getY()) &&
			this.contains(circle.getX(), topY) && this.contains(circle.getX(), bottomY)){
			return true;
		}
		else{
			return false;
		}
	}
	
	//returns true if circle overlaps this circle, else false
	public boolean overlaps (Circle2D circle){
		double distance = Math.sqrt(Math.pow(this.getX() - circle.getX(), 2) + 
									Math.pow(this.getY() - circle.getY(), 2));
									
		//if the distance between centers is less than or equal to sum or radii,
		//then the circles overlap
		if (distance <= (this.getRadius() + circle.getRadius())) {
			return true;
		}
		else{
			return false;
		}
	}
	//Prints object as string
	public String toString(){
		String output = String.format("Circle:\nCenter: (%.2f, %.2f)\nRadius: %.2f\nArea: %.2f\nCircumference: %.2f",
							this.getX(), this.getY(), this.getRadius(),
							this.getX(), this.getCircumference());
		return output;
	}
}