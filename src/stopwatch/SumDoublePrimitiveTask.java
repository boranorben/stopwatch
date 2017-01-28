package stopwatch;

/**
 * Sum array of double primitives with a valuable counter.
 * @author Issaree Srisomboon
 *
 */
public class SumDoublePrimitiveTask implements Runnable {
	private int counter;
	private final int ARRAY_SIZE = 500000;
	private double[] values = new double[ARRAY_SIZE];
	private double sum = 0.0;
	
	/**
	 * Initialize the valuable of counter and set the values in double array with its index += 1.
	 * @param the valuable of counter.
	 */
	public SumDoublePrimitiveTask(int counter) {
		this.counter = counter;
		for(int k=0; k<ARRAY_SIZE; k++) values[k] = k+1;
	}
	
	/**
	 * Sum values in double array
	 * and set index of double array to 0 when the counter reaches ARRAY_SIZE;
	 */
	public void run() {	
		for(int count=0, i=0; count < this.counter ; count++, i++) {
			if (i >= values.length) i = 0;
			sum = sum + values[i];
		}
	}
	
	/**
	 * Get the description of SumDoublePrimitive Task.
	 * @return the counter and the sum of double primitive with description.
	 */
	public String toString() {
		return String.format("Sum array of double primitives with count=%,d\nsum = " + sum, this.counter);
	}

}
