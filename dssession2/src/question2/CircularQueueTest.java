package question2;

import static org.junit.Assert.*;

import org.junit.Test;

public class CircularQueueTest {
	CircularQueue queue = new CircularQueue(2);

	@Test
	public void testAddItem() {				//Add test positive test cases

		assertEquals("Added Element to Queue", queue.addItem(5));

		assertEquals("Added Element to Queue", queue.addItem(10));

	}

	@Test(expected = AssertionError.class)
	public void testAddItemNegitive() {			//Add test negative test cases

		assertEquals("Added Element to Queue", queue.addItem(5));
		assertEquals("Added Element to Queue", queue.addItem(10));
		assertEquals("Added Element to Queue", queue.addItem(15));

	}

	@Test
	public void testDeleteItem() {		//Delete test positive test cases

		assertEquals("Added Element to Queue", queue.addItem(5));
		assertEquals("Added Element to Queue", queue.addItem(10));
		assertEquals("Deleted Element from Queue", queue.deleteItem());
	}

	@Test(expected = AssertionError.class)
	public void testDeleteItemNegitive() {		//Delete test negative test cases

		assertEquals("Deleted Element from Queue", queue.deleteItem());
		
	}
	
	@Test
	public void testCheckEmptyorFull(){		//checkEmptyor Full positive test cases
		
		assertEquals("Queue is empty", queue.checkEmptyOrFull());
		
		assertEquals("Added Element to Queue", queue.addItem(5));

		assertEquals("Queue has some Elements", queue.checkEmptyOrFull());
		
		assertEquals("Added Element to Queue", queue.addItem(10));
		
		assertEquals("Queue is Full", queue.checkEmptyOrFull());
	
	}

}
