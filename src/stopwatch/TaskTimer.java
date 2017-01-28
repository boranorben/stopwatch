package stopwatch;

/**
 * Runs a task using a Stopwatch and prints the elapsed time.
 * @author Issaree Srisomboon
 *
 */
public class TaskTimer {
	static Stopwatch timer = new Stopwatch();
	
	/**
	 * Runs a task, measures and prints its running time to the console.
	 * @param runnable
	 */
	public static void measureAndPrint(Runnable runnable) {
		timer.start();
		runnable.run();
		timer.stop();
		System.out.println(runnable.toString());
		System.out.printf("Elapsed time %.6f sec\n\n", timer.getElapsed());
	}

}
