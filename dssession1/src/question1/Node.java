package question1;

/**
 * This class represents a node in a linked list
 */

public class Node {
	int data;
	Node next;

	Node() { // Default constructor
	}

	Node(int data) { // intializiation of Node valuess
		this.data = data;
		next = null;
	}
}