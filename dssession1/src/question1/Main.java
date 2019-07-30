package question1;

public class Main {
	public static void main(String args[]) {

		LinkedList l = new LinkedList();

		int[] data1 = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 18 };
		l.createLinkedList(data1);
		/*
		 * l.insert(2); l.insert(3); l.insert(4); l.insert(5); l.insert(6);
		 * l.insert(7); l.insert(8); l.insert(9); l.insert(10); l.insert(11);
		 * l.insert(12); l.insert(13); l.insert(14); l.insert(15); l.insert(18);
		 * //l.createLoop(5);
		 */
		// System.out.println(l.tail.next);
		// System.out.println(l.checkLoop());
		l.rotateSubLinkedList(5, 9, 2);

	}

}