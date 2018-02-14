/**
 * 
 * @author Adam Muglia
 * Assignment: Lab 02
 * Date: 01/17/2018
 *
 */

public class Triangle implements Shape {
	
	double height;
	double base;
	
	public Triangle (double height, double base) {
		this.height = height;
		this.base = base;
	}

	@Override
	public double computeArea() {
		// TODO Auto-generated method stub
		return (height * base) / 2;
	}
}
