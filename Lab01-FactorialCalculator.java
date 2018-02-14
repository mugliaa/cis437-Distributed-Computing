import java.io.*;

/**
 * This program will take an integer value as input and compute
 * its factorial using a very simple recursive algorithm.
 * 
 * @author Jonathan Engelsma
 *
 */
public class FactorialCalculator {

	int answer;
	
	/**
	 * Recursive routine to compute a factorial of an integer.
	 * @param val integer to compute the factorial of.
	 * @return the factorial value of the given integer.
	 */
	static public int computeFactorial(int val)
	{
		if (val == 1) {
			return 1;
		} else {
			int newVal = val * computeFactorial(val-1); 
			return newVal;
		}
	}
	
	/**
	 * Main routine - this is the entry point of our program.
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String s;
		System.out.print("Please enter an integer value: ");		
		while((s = in.readLine()) != null && s.length() != 0) {
			try {
				Integer val  = Integer.parseInt(s.trim());
				System.out.println("The factorial of " + val + " is " + computeFactorial(val) + ".");
			} catch (NumberFormatException nfe) {
				System.out.println("Invalid input!!");
			}
			System.out.print("Please enter an integer value: ");
		}

	}

}
