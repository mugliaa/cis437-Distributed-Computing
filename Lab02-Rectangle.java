/**
 * 
 * @author Adam Muglia
 * Assignment: Lab 02
 * Date: 01/17/2018
 *
 */

public class Rectangle implements Shape {
	
	double length;
	double width;
	
	public Rectangle (double length, double width) {
		this.length = length;
		this.width = width;
	}

	@Override
	public double computeArea() {
		return length * width;
	}
	

}
