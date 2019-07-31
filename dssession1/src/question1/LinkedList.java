package question1;

import java.util.ArrayList;
import java.util.List;

/**
 * This class creates the linked list to be used
 */
public class LinkedList {

	Node head;
	Node tail;

	/**
	 * insert is used to inset a node in linked list
	 * 
	 * @param data
	 *            is input value of node
	 */
	protected void insert(int data) {

		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			tail = newNode;
		}

		else {

			tail.next = newNode;
			tail = newNode;
		}
	}

	/**
	 * createLnkedList takes a list of data values and create a linked list
	 * 
	 * @param dataArray
	 *            array of data values
	 */
	public void createLinkedList(int[] dataArray) {
		for (int i = 0; i < dataArray.length; i++) {
			insert(dataArray[i]);
		}
		// this.printList();
	}

	/**
	 * createLoop helps in creating a loop in linked list
	 * 
	 * @param pos
	 *            is the position of element to which the last element will
	 *            refer
	 */
	protected void createLoop(int pos) {
		int i = 1;
		Node temporaryNode = head;
		while (i != pos) {
			temporaryNode = temporaryNode.next;
			i++;
		}
		this.tail.next = temporaryNode;
	}

	/**
	 * checkLoop checks for the presence of loop in linked list
	 * 
	 * @return true if loop is present else return false
	 */
	protected boolean checkLoop() {

		List<Node> nodeList = new ArrayList<Node>();
		Node temporaryNode = head;
		while (temporaryNode.next != null) {

			if (nodeList.contains(temporaryNode))
				return true;
			else {
				nodeList.add(temporaryNode);
				temporaryNode = temporaryNode.next;
			}
		}
		return false;
	}

	/**
	 * rotateSubLinkedList rotates the linked list from defined points
	 * 
	 * @param startingIndex
	 *            from where the sub linked list needs to be started
	 * @param endingIndex
	 *            ending index of sub linked list
	 * @param rotationTimes
	 *            number of times sub list needs to be rotated in clockwise
	 *            direction
	 */
	protected void rotateSubLinkedList(int startingIndex, int endingIndex,
			int rotationTimes) {
		if ((endingIndex < startingIndex) || (startingIndex < 1))
			throw new AssertionError("Invalid input");

		System.out.println("\nrotated linked list");
		Node subListStartPreviousNodeNext = null, subListEndPrev = null;

		while (rotationTimes != 0) {
			int i = 1;
			Node tempNode = this.head;

			while (tempNode.next != null) {

				if (i == startingIndex - 1) {
					subListStartPreviousNodeNext = tempNode;

				}

				if (i == endingIndex - 1) {
					subListEndPrev = tempNode;
				}

				if (i == endingIndex) {

					subListEndPrev.next = tempNode.next;
					tempNode.next = subListStartPreviousNodeNext.next;
					subListStartPreviousNodeNext.next = tempNode;
				}

				i++;
				tempNode = tempNode.next;
			}
			rotationTimes--;
		}
		// this.printList();
	}

	/**
	 * printLisgtprints the linked list
	 */
	public void printList() {
		Node temporaryNode = head;
		while (temporaryNode != null) {
			System.out.print(temporaryNode.data + " ");
			temporaryNode = temporaryNode.next;
		}
		System.out.println();
	}

}