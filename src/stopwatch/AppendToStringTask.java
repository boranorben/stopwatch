package stopwatch;

/**
 * Append any size of char to a String. 
 * @author Issaree Srisomboon
 *
 */
public class AppendToStringTask implements Runnable{
	private final char CHAR = 'a';
	private int size;
	private String result = ""; 
	
	/**
	 * Initialize a valuable size of char.
	 * @param a valuable size of char.
	 */
	public AppendToStringTask(int size) {
		this.size = size;
	}
	
	/**
	 * Append a char 'a' to a String result until reach the size of char.
	 */
	@Override
	public void run() {
		int k = 0;
		while (k++ < this.size) {
			result = result + CHAR;
		}
	}
	
	/**
	 * Get the description of AppendToString Task.
	 * @return the valuable size of char and the length of result after adding char(s) with description..
	 */
	@Override
	public String toString() {
		return String.format("Append %,d chars to String\nfinal string length = " + result.length(),this.size);
	}
}
