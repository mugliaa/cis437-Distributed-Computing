package edu.gvsu.cis.cs437.lab3;

import java.math.BigDecimal;

/**
 * 
 * @author Adam Muglia
 * Assignment: Lab 03
 * Date: 01/31/2018
 *
 */

public class PiTask implements Runnable {
	
	private Pi theTask;
	
	public PiTask(Pi theTask) {
		super();
		this.theTask = theTask;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Computing Pi...");
		BigDecimal result = this.theTask.execute();
		System.out.println("The result is " + result + ".");
	}

}
