package stopwatch;

/**
 * A Stopwatch that measures elapsed time between a starting time
 * and stopping time, or until the present time.
 * @author Issaree Srisomboon
 * @version 1.0
 */
public class Stopwatch {
	
	/** constant for converting nanoseconds to seconds. */
	private static final double NANOSECONDS = 1.0E-9;
	
	/** time that the stopwatch was started, in nanoseconds. */
	private long startTime;
	
	/** time that the stopwatch was stopped, in nanoseconds. */
	private long stopTime;
	
	/** status of stopwatch */
	private boolean running;
	
	/**
	 * Initialize a new stopwatch and set it stop. 
	 */
	public Stopwatch() {
		this.running = false;
	}
	
	/**
	 * Reset the stopwatch and start if stopwatch is not running,
	 * does nothing when stopwatch is already running. 
	 */
	public void start() {
		if (!this.running) {
			this.startTime = System.nanoTime();
			this.running = true;
		}
	}
	
	/**
	 * Stop the stopwatch¡
	 * does nothing when stopwatch is not already running. 
	 */
	public void stop() {
		if (this.running) {
			this.stopTime = System.nanoTime();
			this.running = false;
		}
	}
	
	/**
	 * Get the elapsed time in second with decimal.
	 * @return The elapsed time in second with decimal
	 * if the stopwatch is running, then return the elapsed time since start until the current times,
	 * otherwise, if the stopwatch is not running, then return time between the start and stop times.
	 */
	public double getElapsed() {
		if (this.running) {
			return (System.nanoTime() - this.startTime) * NANOSECONDS;
		} else 
			return (this.stopTime - this.startTime) * NANOSECONDS ;
	}
	
	/**
	 * Check whether stopwatch is running or not.
	 * @return true if the stopwatch is running,
	 * return false if the stopwatch is stopped.
	 */
	public boolean isRunning() {
		return this.running;
	}
	
}
