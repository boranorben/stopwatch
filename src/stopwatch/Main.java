package stopwatch;

/**
 * Creates the tasks and pass each task to the TaskTimer.
 * @author Issaree Srisomboon
 *
 */
public class Main {
	public static void main (String[] args) {
		Stopwatch timer = new Stopwatch();
		TaskTimer.measureAndPrint(new AppendToStringTask(50000));
		TaskTimer.measureAndPrint(new AppendToStringTask(100000));
		TaskTimer.measureAndPrint(new AppendToStringBuilderTask(100000));
		int counter = 1000000000; 
		TaskTimer.measureAndPrint(new SumDoublePrimitiveTask(counter));
		TaskTimer.measureAndPrint(new SumDoubleTask(counter));
		TaskTimer.measureAndPrint(new SumBigDecimalTask(counter));
	}
}
