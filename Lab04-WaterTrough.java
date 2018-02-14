import java.util.Random;

/**
 * Represents a pitstop at a Horse Race - a water trough!
 * @author Jonathan Engelsma
 * 
 * Edited by: Adam Muglia
 * Assignment: Lab 04
 * Date: 01/31/2018
 *
 */
public class WaterTrough {
	
	private Random rand =  new Random(System.currentTimeMillis());
	private int cnt = 0; 

	public synchronized long getDrink() throws InterruptedException
	{
		// Horse takes between 1-3 seconds drinking!
		synchronized (this) {
			if (cnt >= 2) {
				System.out.println("Someone needs to wait.");
				wait();
			}
			cnt++;
		}
		
		System.out.println(cnt + " horse starts drinking.");
		
		long duration = Math.abs((this.rand.nextLong()) % 2000) + 1000;
		Thread.sleep(duration);	
		
		
		synchronized (this) {
			cnt--;
			notify();
		}
		
		return duration;
	}
}
