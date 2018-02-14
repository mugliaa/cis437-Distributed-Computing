package edu.gvsu.cis.cs437.lab3;

import java.io.*;

public class MyPiPrinter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		boolean done = false;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			while (!done) {
				System.out.print("Compute PI to how many decimal points?");
				String command = reader.readLine();
				if(command==null || command.equalsIgnoreCase("quit")) {
					done = true;
				} else {
					try {						
						int digits = Integer.parseInt(command);
						Pi piComputer = new Pi(digits);
						PiTask myTask = new PiTask(piComputer);
						Thread myThread = new Thread(myTask);
						myThread.start();
					} catch (NumberFormatException nfe) {
						System.out.println("Whoops that was not an integer.  Please try again.");
					}
				}		
			}
		} catch (IOException e) {
			System.out.println("Uh oh, something bad happened.  We better get out of here.");
		}
	}

}
