/**
 * 
 */


/**
 * A sample application that can create an manipulate different Shape 
 * objects.
 * @author Jonathan Engelsma
 * 
 * Name: Adam Muglia
 * Assignment: Lab 02
 * Date: 01/17/2018
 *
 */
public class ShapeClient {

	/**
	 * Main entry point of our program.
	 * @param 
	 */
	public static void main(String[] args) 
	{
		// Declare an array of shapes.
		Shape[] myShapes = new Shape[3];
		
		// Create a circle shape and assign to the array.
		Circle circ = new Circle(10.0);
		myShapes[0] = circ;
		
		// Create a triangle shape and assign to the array.
		Triangle triangle = new Triangle(12.0, 15.3);
		myShapes[1] = triangle;
		
		// Create a rectangle shape and assign to the array.
		Rectangle rect = new Rectangle(2.0, 4.0);
		myShapes[2] = rect;
		
		// Compute their area with a single loop.
		for(Shape shape : myShapes) {
			double area = shape.computeArea();
			System.out.println("Area for shape (" + shape.getClass().getName() + ") equals " + area + ".");
		}
	}

}
