package stopwatch;

import java.math.BigDecimal;

/**
 * Sum array of BigDecimal with a valuable counter.
 * @author Issaree Srisomboon
 *
 */
public class SumBigDecimalTask implements Runnable {
	private int counter;
	private final int ARRAY_SIZE = 500000;
	private BigDecimal[] values = new BigDecimal[ARRAY_SIZE];
	private BigDecimal sum = new BigDecimal(0.0);
	
	/**
	 * Initialize the valuable of counter and set the values in BigDecimal array with its index += 1.
	 * @param the valuable of counter.
	 */
	public SumBigDecimalTask(int counter) {
		this.counter = counter;
		for(int i=0; i<ARRAY_SIZE; i++) values[i] = new BigDecimal(i+1);
	}
	
	/**
	 * Sum values by using add method in BigDecimal class
	 * and set index of BigDecimal array to 0 when the counter reaches ARRAY_SIZE;
	 */
	public void run() {
		for(int count=0, i=0 ; count < this.counter ; count++, i++) {
			if (i >= values.length) i = 0;
			sum = sum.add( values[i] );
		}
	}
	
	/**
	 * Get the description of SumBigDecimal Task.
	 * @return the counter and the sum of BigDecimal array with description.
	 */
	public String toString() {
		return String.format("Sum array of BigDecimal with count=%,d\nsum = " + sum, this.counter);
	}

}
