package question2;

/**
 * this class creates circular queue and include various methods of it
 */
public class CircularQueue {

	int[] circularQueue;
	int start = -1, end = -1;

	/**
	 * Constructor of Circular queue for initializing the queue
	 * 
	 * @param length
	 *            is the size of the queue
	 */
	public CircularQueue(int length) {
		circularQueue = new int[length];

	}

	/**
	 * addItem adds an item to the queue
	 * 
	 * @param value
	 *            is the item to be added to queue
	 * @return String of message
	 */
	public String addItem(int value) {
		if (start == -1 && end == -1) {
			circularQueue[0] = value;
			start = end = 0;
		} else
			try {
				if (start - end == -1) {
					throw new AssertionError("queue full");
				} else if (end == circularQueue.length - 1 && start == 0) {
					return "Queue Full";
				} else if (end == circularQueue.length - 1 && start != 0) {
					end = 0;
					circularQueue[end] = value;
				} else {
					end++;
					circularQueue[end] = value;
				}
			} catch (AssertionError e) {
				return "Queue full";
			}

		return "Added Element to Queue";

	}

	/**
	 * deleteItem delete the first element of the queue
	 * 
	 * @return message
	 */
	public String deleteItem() {
		try {
			if (start == -1) {
				throw new AssertionError("Queue is Empty");
				// return "Queue is Empty";
			}
		} catch (AssertionError e) {
			return "Queue is empty";
		}
		if (start == end) {
			circularQueue[start] = 0;
			start = -1;
			end = -1;
		} else if (start == circularQueue.length - 1) {
			start = 0;
			circularQueue[start] = 0;
		} else {
			circularQueue[start] = 0;
			start++;
		}

		return "Deleted Element from Queue";
	}

	/**
	 * checkEmptyorFull checks queue or space availability
	 * 
	 * @return message
	 */
	public String checkEmptyOrFull() {
		try {
			if ((start - end == 1)
					|| (end == circularQueue.length - 1 && start == 0))
				throw new AssertionError("Queue is full");
		} catch (AssertionError e) {
			return "Queue is Full";
		}
		if (start == -1)
			return "Queue is empty";
		return "Queue has some Elements";
	}

	public void print() {
		for (int i = 0; i < circularQueue.length; i++) {
			System.out.println(circularQueue[i]);
		}
	}

}
