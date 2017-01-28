package stopwatch;

/**
 * Sum array of double objects with a valuable counter.
 * @author Issaree Srisomboon
 *
 */
public class SumDoubleTask implements Runnable {
	private int counter;
	private final int ARRAY_SIZE = 500000;
	private double[] values = new double[ARRAY_SIZE];
	private Double sum = new Double(0.0);
	
	/**
	 * Initialize the valuable of counter 
	 * and set the values in double array with Double object, increasing depends on its index.
	 * @param the valuable of counter.
	 */
	public SumDoubleTask(int counter) {
		this.counter = counter;
		for(int i=0; i<ARRAY_SIZE; i++) values[i] = new Double(i+1);
	}
	
	/**
	 * Sum values in double array
	 * and set index of double array to 0 when the counter reaches ARRAY_SIZE;
	 */
	@Override
	 public void run() {
		for(int count=0, i=0 ; count < this.counter ; count++, i++) {
			if (i >= values.length) i = 0;
			sum = sum + values[i];
		}
	 }
	
	/**
	 * Get the description of SumDouble Task.
	 * @return the counter and the sum of Double objects with description.
	 */
	@Override
	public String toString() {
		return String.format("Sum array of Double objects with count=%,d\nsum = " + sum, this.counter);
	}
}
