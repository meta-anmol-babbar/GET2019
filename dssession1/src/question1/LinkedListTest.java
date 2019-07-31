package question1;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * This class contains the test methods for testing methods of class LinkedList
 */
public class LinkedListTest {

	@Test
	public void testRotation1() {
		int[] data = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 18 };
		LinkedList list = new LinkedList();
		list.createLinkedList(data);
		list.rotateSubLinkedList(5, 9, 2);
		int[] captureData = new int[data.length];
		Node temporaryNode = list.head;
		int i = 0;
		while (temporaryNode != null) {
			captureData[i] = temporaryNode.data;
			temporaryNode = temporaryNode.next;
			i++;
		}
		int[] expectedData = { 2, 3, 4, 5, 9, 10, 6, 7, 8, 11, 12, 13, 14, 15,
				18 };

		assertArrayEquals(expectedData, captureData);
		list.printList();
	}

	@Test
	public void testRotation2() {
		int[] data = { 2, 3, 4, 5, 6, 7 };
		LinkedList list = new LinkedList();
		list.createLinkedList(data);
		list.rotateSubLinkedList(2, 5, 2);
		int[] captureData = new int[data.length];
		Node temporaryNode = list.head;
		int i = 0;
		while (temporaryNode != null) {
			captureData[i] = temporaryNode.data;
			temporaryNode = temporaryNode.next;
			i++;
		}
		int[] expectedData = { 2, 5, 6, 3, 4, 7 };

		assertArrayEquals(expectedData, captureData);
		list.printList();
	}

	@Test(expected = AssertionError.class)
	public void testRotation3() {
		int[] data = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 18 };
		LinkedList list = new LinkedList();
		list.createLinkedList(data);
		list.rotateSubLinkedList(5, 4, 2); // Invalid index input
		int[] captureData = new int[data.length];
		Node temporaryNode = list.head;
		int i = 0;
		while (temporaryNode != null) {
			captureData[i] = temporaryNode.data;
			temporaryNode = temporaryNode.next;
			i++;
		}
		int[] expectedData = { 2, 3, 4, 5, 9, 10, 6, 7, 8, 11, 12, 13, 14, 15,
				18 };

		assertArrayEquals(expectedData, captureData);
	}

	@Test
	public void testLoop1() {
		int[] data = { 2, 3, 4, 5, 6, 7 };
		LinkedList list = new LinkedList();
		list.createLinkedList(data);
		assertEquals(false, list.checkLoop());
	}

	@Test
	public void testLoop2() {

		// int[] data = { 2, 3, 4, 5, 6, 7 };
		LinkedList l = new LinkedList();
		l.insert(2);
		l.insert(3);
		l.insert(4);
		l.insert(5);
		l.insert(6);
		l.insert(7);
		l.createLoop(4);
		// l.createLinkedList(data);
		assertEquals(true, l.checkLoop());
	}

}
