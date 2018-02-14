/**
 * 
 * @author Adam Muglia
 * Assignment: Lab 02
 * Date: 01/17/2018
 *
 */

public class Circle implements Shape {
	
	double radius;
	
	public Circle (double radius) {
		this.radius = radius;
	}

	@Override
	public double computeArea() {
		// TODO Auto-generated method stub
		return (Math.PI) * Math.pow(radius, 2);
	}

}
