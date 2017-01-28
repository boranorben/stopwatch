package stopwatch;

/**
 * Append any size of char to a StringBuilder. 
 * @author Issaree Srisomboon
 *
 */
public class AppendToStringBuilderTask implements Runnable {
	private final char CHAR = 'a';
	private int size;
	private StringBuilder builder = new StringBuilder(); 
	private String result;
	
	/**
	 * Initialize a valuable size of char.
	 * @param a valuable size of char.
	 */
	public AppendToStringBuilderTask(int size) {
		this.size = size;
	}
	
	/**
	 * Append a char 'a' to a StringBuilder builder until reach the size of char
	 * and covert builder to String to be contained in a String result.
	 */
	@Override
	public void run() {
		int k = 0;
		while(k++ < this.size) {
			builder = builder.append(CHAR);
		}
		result = builder.toString();
	}
	
	/**
	 * Get the description of AppendToStringBuilder Task.
	 * @return the valuable size of char and the length of result after adding char(s) with description.
	 */
	@Override
	public String toString() {
		return String.format("Append %,d chars to StringBuilder\nfinal string length = " + result.length(), this.size);
	}

}
